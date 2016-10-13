package com.usjr.finalsexam.controller;


import com.usjr.finalsexam.entity.Video;

import java.util.ArrayList;
import java.util.List;

public class VideosController {

    private List<Video> mVideos;

    public VideosController() {
        mVideos = new ArrayList<>();
        mVideos.add(new Video("B08iLAtS3AQ", "What's new in Android - Google I/O 2016", "For more videos and games check out our new website at http://www.sesamestreet.org \n" +
                "\n" +
                "In this video, Bert and Ernie perform with Ray Charles. \n" +
                "\n" +
                "Sesame Street is a production of Sesame Workshop, a nonprofit educational organization which also produces Pinky Dinky Doo, The Electric Company, and other programs for children around the world.",
                "https://i.ytimg.com/vi/gzDS-Kfd5XQ/mqdefault.jpg"));

        mVideos.add(new Video("r_LpCi6DQME", "Image compression for Android developers - Google I/O 2016",
                "Bloated images are slow to fetch and costly to download; which is troubling, since images comprise the largest bulk of content your app will send around. In order to keep your users happy and their bandwidth healthy, image optimization & size reduction should be on the top of your list. In this video, we'll get into the nitty-gritty on how image compression works for your favorite file types, and show you how to use that knowledge to create smaller files for your users. This talk is applicable for any Android developer who has loaded a bitmap off a network connection.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/r_LpCi6DQME/mqdefault.jpg"));

        mVideos.add(new Video("JQ8w_TbQqVA", "Android Pay everywhere: New developments - Google I/O 2016",
                "Be the first to hear about what we've been up to since launch and the exciting new announcements we have in the works for Android Pay. Join us on a whirlwind tour of new features, partners and markets, including new opportunities for developers to bring a seamless transaction experience to mobile devices.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/JQ8w_TbQqVA/mqdefault.jpg"));

        mVideos.add(new Video("5GIk9ABs8ww", "Games: The Google advantage - Google I/O 2016",
                "Game development is challenging, but Google's diverse tools and services can confer great advantages when used effectively together. Noah Falstein, Chief Game Designer, gives an overview of these techniques, including those utilizing newly announced Google technologies. Ben Frenkel, PM from Play Games Services, will talk about what's new, and delve into ways developers are using Google Play Games Services to improve their games and profitability. Ina Fuchs of YouTube Gaming will conclude by talking about the ways YouTube helps grow audiences and highlight games with their latest advances. \n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/5GIk9ABs8ww/mqdefault.jpg"));

        mVideos.add(new Video("Z4iXOmtHTIc", "Beyond payments with Android Pay - Google I/O 2016",
                "See how you can create an amazing in-store experience by enabling your users to send their loyalty and payment information in a single tap. We will show live demos for integrating loyalty programs, gift cards and offers with just a few lines of code. We'll also demonstrate how banks can enable their users to participate in Android Pay through their mobile banking apps. This hands-on session from our senior PM and Engineer will take you behind the scenes on how we've developed these simple APIs to enable great user experiences.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/Z4iXOmtHTIc/mqdefault.jpg"));

        mVideos.add(new Video("xctGIB81D2w", "Lean and Fast: Putting Your App on a Diet - Google I/O 2016",
                "Your APK's size is the one of the first deterrents to users installing and updating your app. Has your APK let itself go over time? There's never a better time to get your APK into shape. This session presents a collection of techniques to reduce the size of your APK, reach more users and scale to devices big or small!\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/xctGIB81D2w/mqdefault.jpg"));

        mVideos.add(new Video("37ia7S4Lsv4", "Introducing the Awareness API, an easy way to make your apps context aware - Google I/O 2016",
                "Mobile devices are always with their users - when they wake up in the morning, at the park with friends, even while driving. There is a huge opportunity to increase user engagement and delight by tailoring your app experiences to be aware of these environments. We'll be introducing Awareness API which makes it easy to make your apps context aware, and manages system health for you.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/37ia7S4Lsv4/mqdefault.jpg"));

        mVideos.add(new Video("QlhU0YioJks", "Behind the scenes: What’s new in Android accessibility - Google I/O 2016",
                "Come get a behind the scenes look at what’s new in Android for accessibility! Hear about the major additions to accessibility in Android ‘N’, and see demos of new APIs that developers can use to create new experiences and build accessible apps. Get a unique look on how Google conducts UX research for users with disabilities and the importance of UX research during the development cycle. Learn about Voice Access (beta), a new Android Accessibility Service that allows users with motor impairments to control a device through voice alone.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/QlhU0YioJks/mqdefault.jpg"));

        mVideos.add(new Video("w45y_w4skKs", "What's new in the support library - Google I/O 2016",
                "Compatibility with older versions of Android is a must-have for most applications. Join members of the Android Support Library team as they walk through recent advances in backwards compatibility, explain important changes, and discuss the future of the support libraries.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/w45y_w4skKs/mqdefault.jpg"));

        mVideos.add(new Video("j33M5BqoLuI", "Raiders of the lost app: Google Play secrets to launching and getting discovered - Google I/O 2016",
                "Google Play helps developers build great apps and games, and grow a large user base.  Learn about best practices to improve app ranking and help you reach the right users for your app across Play. But to really go big you need to be great. Set your app up for success using experiments, rapid iteration, and release control tools and hear about how we've made it easier than ever to run and manage beta testing programs.\n" +
                        "\n" +
                        "Watch more Android talks at I/O 2016 here: https://goo.gl/Uv3jls\n" +
                        "See all the talks from Google I/O 2016 here: https://goo.gl/olw6kV\n" +
                        "\n" +
                        "#io16 #GoogleIO #GoogleIO2016", "https://i.ytimg.com/vi/j33M5BqoLuI/mqdefault.jpg"));
    }

    public List<Video> getVideos() {
        return mVideos;
    }
}

