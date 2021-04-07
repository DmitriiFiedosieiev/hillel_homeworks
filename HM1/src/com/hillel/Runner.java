package com.hillel;

import com.hillel.archiver.Archiver;
import com.hillel.fileWorker.Compressor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class Runner {

    private OutputStream outputStream;
    private Archiver archiver;
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
                archiver = ZipOutputStream::new;
            } else if (type.equals("gzip")) {
                archiver = GZIPOutputStream::new;
            }
            outputStream = archiver.archive(fileOutputStream);
            Compressor compressor = new Compressor(outputStream, innerPath );
            compressor.compress(last);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}