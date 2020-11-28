package com.example;

import java.net.URI;

public class UploadDestination {
    public boolean supports(String location) {
        final String scheme = URI.create(location).getScheme();
        return scheme.equals("http") || scheme.equals("s3") || scheme.equals("sftp");
    }
}
