package org.gs;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeHelloDockerIT extends HelloDockerTest {

    // Execute the same tests but in native mode.
}