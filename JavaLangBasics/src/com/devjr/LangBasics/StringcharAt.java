package com.devjr.LangBasics;

public class StringcharAt {
    public static void main(String[] args) {
        //In java strings are stored in form of char array
        //But not any other languages, we are allowed to get char using [] index
        // we need a special method .charAt(), which will get particular character from that index
        // As usual the string index are also starting from 0

        String name1 = "Morris Traversal";
        System.out.println(name1.charAt(7)); //the index 7 has T


        System.out.println(new int[] {1,2,3});//prints out some random values, String Representation of Object

        //Precision Formatting
        float pi = 3.1435353535f;
        System.out.printf("%.2f",pi);
    }
}
