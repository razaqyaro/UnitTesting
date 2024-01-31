package com.example.software_testing_and_automation;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest
{
    @Test
    public void mainTestInput1(){
        String input = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //invoke
        String[] args = {};
        Demo2.main(args);

        //(expected) output
        String consoleOutput = "Enter the radius"+ System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 1.0,"+ System.getProperty("line.separator");
        consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, outputStream.toString());
    }

    @Test
    public void mainTestInput3(){
        String input = "3\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //invoke
        String[] args = {};
        Demo2.main(args);

        //(expected) output
        String consoleOutput = "Enter the radius"+ System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 3.0,"+ System.getProperty("line.separator");
        consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, outputStream.toString());
    }
    // radius = 3, circumference = 18.849555921539, area = 28.274333882308

    // radius = 0, circumference = 0, area = 0

    // radius = -1, error = "radius must be positive

    // radius = "abc"


}
