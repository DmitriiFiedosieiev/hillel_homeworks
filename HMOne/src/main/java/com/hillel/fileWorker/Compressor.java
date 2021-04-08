package com.hillel.fileWorker;

import com.hillel.archiver.Archiver;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compressor {

    private Archiver archiver;

    public Compressor(Archiver archiver) {
        this.archiver = archiver;
    }

    public void compress(Path innerPath, OutputStream outputStream, String last) {
        try(OutputStream out = archiver.archive(outputStream)) {
            if (out instanceof ZipOutputStream) {
                ((ZipOutputStream) out).putNextEntry(new ZipEntry(last));
                Files.copy(innerPath, out);
                ((ZipOutputStream) out).closeEntry();
            } else if (out instanceof GZIPOutputStream) {
                Files.copy(innerPath, out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}