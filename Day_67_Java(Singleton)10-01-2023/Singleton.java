//Program: Complete the Singleton class in your editor which contains the following components:

// A private Singleton non parameterized constructor.
// A public String instance variable named str.
// Write a static method named getSingleInstance that returns the single instance of the Singleton class.

// Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.

// Input Format
// You will not be handling any input in this challenge.

// Output Format
// You will not be producing any output in this challenge.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
public String str;
private static Singleton INSTANCE;

private Singleton() {}

public static Singleton getSingleInstance() {
    if (INSTANCE != null) {
        return INSTANCE;
    }
    synchronized(Singleton.class) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        INSTANCE = new Singleton();
        return INSTANCE;
    }
}
}
// Sample Input
// hello world

// Sample Output
// Hello I am a singleton! Let me say hello world to you