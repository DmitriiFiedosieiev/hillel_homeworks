package com.hillel.fileWorker;

import com.hillel.archiver.Archiver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compressor {

    private OutputStream out;
    private Path innerPath;

    public Compressor(OutputStream out, String innerPath) {
        this.out = out;
        this.innerPath = Paths.get(innerPath);
    }

    public void compress(String last) throws IOException{
        try {
            if (out instanceof ZipOutputStream) {
                ((ZipOutputStream) out).putNextEntry(new ZipEntry(last));
                Files.copy(innerPath, out);
                ((ZipOutputStream) out).closeEntry();
            } else if (out instanceof GZIPOutputStream) {
                Files.copy(innerPath, out);
            }
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
