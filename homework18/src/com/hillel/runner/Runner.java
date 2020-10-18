package com.hillel.runner;

import com.hillel.service.VideoLibrary;

public class Runner {

    public static void main(String[] args) {
        VideoLibrary videoLibrary = new VideoLibrary();
        videoLibrary.deleteFilmsOlderGivenYears(5);
    }
}
