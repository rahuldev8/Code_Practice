package com.devjr.LangBasics;
//Difference between == and .equals() for strings
public class Comparsion {
    public static void main(String[] args) {
        String a = "test";
        String b = "test";
        String c = a;
        System.out.println(c==a); //outputs true, since only one copy of "test" created inside pool
        /*
        * Duplicate strings will not be allowed in string pool, which is present in heap memory
        * String pool is a structure to hold strings in heap area
        * String Pool will not allow any duplicates to it
        * The use case of string pool is Optimization*/

        //System.out.println(a==b); //== operator compares, two objects and their references(outputs true)

        //Explicitly creating two strings with same value or content using <new> keyword

        String s1 = new String("Jacob"); //when using new keyword, the string objects are created
        String s2 = new String("Jacob"); // outside the string pool, but inside heap area
        System.out.println(s1==s2); //outputs false, hence the objects are different

        //To Compare only the values in Strings use .equals()
        String name1 = new String("Richard");
        String name2 = new String("Richard");
        System.out.println(name1.equals(name2)); //outputs true since, .equals() method will only
        //consider the contents in string,they don't care about the objects,
        //if they are same in contents, output will be true
    }
}
