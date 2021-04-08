package com.hillel;

import com.hillel.fileWorker.Compressor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Runner {

    Scanner scanner;

    public Runner() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
        runner.close();
    }

    public void run() {
        System.out.println("Enter archive type(zip/gzip)");
        String type = scanner.nextLine().toLowerCase().trim();
        System.out.println("Enter full directory path with extension where to archive");
        String outerPath = scanner.nextLine().toLowerCase().trim();
        System.out.println("Enter full directory path with extension what file must be archived");
        String innerPath = scanner.nextLine().toLowerCase().trim();
        startCompression(type, outerPath, innerPath);
    }

    public void close() {
        scanner.close();
    }

    private void startCompression(String type, String outerPath, String innerPath) {
        String[] inner = innerPath.split(Pattern.quote(File.separator));
        String last = inner[inner.length - 1];
        try(FileOutputStream fileOutputStream = new FileOutputStream(outerPath)) {
            if (type.equals("zip")) {
                Compressor compressor = new Compressor(ZipOutputStream::new);
                compressor.compress(Paths.get(innerPath), fileOutputStream, last);
            } else if (type.equals("gzip")) {
                Compressor compressor = new Compressor(GZIPOutputStream::new);
                compressor.compress(Paths.get(innerPath), fileOutputStream, last);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}