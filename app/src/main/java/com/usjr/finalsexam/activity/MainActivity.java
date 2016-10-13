package com.usjr.finalsexam.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.usjr.finalsexam.R;
import com.usjr.finalsexam.adapters.VideoListAdapter;
import com.usjr.finalsexam.controller.VideosController;
import com.usjr.finalsexam.db.VideoTable;
import com.usjr.finalsexam.entity.Video;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private VideoListAdapter mAdapter;
    private ProgressBar mProgressBar;
    private VideosController mController;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        mController = new VideosController();
        mAdapter = new VideoListAdapter(this, new ArrayList<Video>());
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);
        prepareData();
        displayListOfVideos();

        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    showProgressBar();
                    sleep(2000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            hideProgressBar();
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();



    }

    private void prepareData() {
        // In order to avoid duplication of data, I remove all video list item from the database
        // first and then add new items into the database. Sample test data are present in
        // VideosController.getVideos() method.

        VideoTable.deleteAllVideos(getApplicationContext());
        List<Video> videos = mController.getVideos();

        for (Video vid : videos) {
            VideoTable.insertVideo(this, vid);
        }
    }

    private void displayListOfVideos() {
        // TODO: Implement this method

//        VideoTable db = new VideoTable();


        List<Video> videos = VideoTable.getAllVideos(getApplicationContext());
        mAdapter.addAll(videos);
//        listView.setAdapter(mAdapter);

    }

    public void showProgressBar() {
        // TODO: Implement this method

        mProgressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar() {
        // TODO: Implement this method
        mProgressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, PlayVideoActivity.class);
        intent.putExtra("VID_ID", mAdapter.getItem(position).getId());
        startActivity(intent);
    }
}
