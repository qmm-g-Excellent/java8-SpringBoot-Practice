package com.observeral;

/**
 * Created by qmm on 17-7-25.
 */

//import java.util.Observer;

public class VideoFans implements Observer {

    private String name;

    public VideoFans(String name){
        this.name = name;
    }
    @Override
    public void update(Subject s) {
        System.out.println(this.name + ", new videos are available! ");
        // print video list
        System.out.println(s);
    }
}
