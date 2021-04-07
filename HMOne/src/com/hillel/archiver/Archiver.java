package com.hillel.archiver;

import java.io.IOException;
import java.io.OutputStream;

@FunctionalInterface
public interface Archiver {

    OutputStream archive(OutputStream data) throws IOException;
}
