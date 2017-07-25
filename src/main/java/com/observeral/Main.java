package com.observeral;

/**
 * Created by qmm on 17-7-25.
 */

//java.util.Observer;

public class Main {

    public static void main(String[] args) {
        VideoSite vs = new VideoSite();
//        vs.registerObserver(new VideoFans("LiLei"));
//        vs.registerObserver(new VideoFans("HanMeimei"));
//        vs.registerObserver(new VideoFans("XiaoMing"));

        // add videos
        vs.addVideos("Video 1");
        //vs.addVideos("Video 2");
    }
}
