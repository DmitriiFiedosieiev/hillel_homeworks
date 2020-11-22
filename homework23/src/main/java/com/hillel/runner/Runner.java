package com.hillel.runner;

import com.hillel.service.impl.VideoLibrary;

public class Runner {

    public static void main(String[] args) {
        VideoLibrary videoLibrary = new VideoLibrary();
        System.out.println(videoLibrary.findFilmsForCurrentAndPreviousYear());
    }
}
