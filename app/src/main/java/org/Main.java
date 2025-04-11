/*
 * This is our main entrypoint defined in build.gradle
 */
package org;

import org.operations.Operations;

// https://github.com/fathzer/javaluator?tab=readme-ov-file

public class Main {

    public static void main(String[] args) {

        Operations classUnderTest = new Operations("10");
        classUnderTest.log("2");
        String output = classUnderTest.evaluate();

        System.err.println(output);
    }
}
