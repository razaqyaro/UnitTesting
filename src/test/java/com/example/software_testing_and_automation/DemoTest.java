package com.example.software_testing_and_automation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    public void test_is_triangle_1(){
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    @Test
    public void test_is_triangle_2(){
        assertTrue(Demo.isTriangle(3, 4, 5));
    }
    @Test
    public void test_is_NOT_triangle_1(){
        assertFalse(Demo.isTriangle(7, 4, 12));
    }

    @Test
    public void test_is_NOT_triangle_2(){
        assertFalse(Demo.isTriangle(13, 7, 5));
    }

    @Test
    public void test_mainf_program_1(){
        ByteArrayInputStream inputStream = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";
        assertEquals(consoleOutput, outputStream.toString());
    }

    @Test
    public void test_main_program_1() {
        String input = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String[] args = {};
        // Run the main method of the Demo class
        Demo.main(args);

        // Define the expected output string
        String consoleOutput = "Enter side 1: \n" +
                "Enter side 2: \n" +
                "Enter side 3: \n" +
                "This is a triangle.\n"; // Modified the expected output to match the program's print statement

        // Trim both the console output and the output stream string
        String output = outputStream.toString().trim();
        consoleOutput = consoleOutput.trim();

        // Assert the equality of the strings
        assertEquals(consoleOutput, output);
    }

}
