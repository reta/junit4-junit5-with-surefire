package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnit4TestCase {
    private UploadDestination destination;
    private final String location;

    public JUnit4TestCase(String location) {
        this.location = location;
    }

    @Before
    public void setUp() {
        destination = new UploadDestination();
    }

    @Parameters(name= "{index}: location {0} is supported")
    public static Object[] locations() {
        return new Object[] { "s3://test", "http://host:9000", "sftp://host/tmp" };
    }

    @Test
    public void testLocationIsSupported() {
        assertTrue(destination.supports(location));
    }
}