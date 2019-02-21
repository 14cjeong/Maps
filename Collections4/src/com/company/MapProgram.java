package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    //shortcut "psvm"
    public static void main(String[] args) {
        //two generic parameters: <key, value>
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        //we retrieve the languages using get(key)
        System.out.println(languages.get("Java"));
        //note: keys are unique. so, Java will use the
        //most updated one (and overwrite older ones)
        languages.put("Java", "this is overwritten");
        System.out.println(languages.get("Java"));

        //Additionally, to see if something is a new reference
        //You can do wrap the languages.put with a "sout"
        // system.out.println(languages.put("Lisp", "Therein lies madness"));
        //Otherwise, if you wrapped it around
        //System.out.println(languages.put("Java", "this is overwritten"));
        //You would actually get the previous value:
        //"a compiled high level, object-oriented, platform..."

        //you can also check if languages contains something
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else{
            languages.put("Java", "this is overwritten");
        }

        //The important thing to grasp, in my opinion,
        //is the power of the if, else statement
        //You can use it to check virtually anything.

        System.out.println("================================================");

        //We've been using if-else statements many, many times.
        //We've also been using for loops many, many times
        //This for loop goes through all the keys in a single
        //statement
        //the following is also another example of a forEach
        //I'm still having trouble conceptualizing forEach
        //But, the following is saying to
        //sout(key + " : " + languages.get(key))
        //forEach
        //String key
        //until the length of languages.keySet()
        //...I think that that's what it means...
        //Now, the way I'm conceptualizing it with length
        //is because I'm trying to draw similarities with the regular for loop,
        //which usually has a length parameter after i = 0, for example.
        //based on https://www.tutorialspoint.com/javaexamples/method_for.htm
        //Since you don't have a teacher
        //you'll have to confirm by repetition.

        System.out.println(languages.keySet()); //This prints out an array containing the languages that we put in

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
        //the above code prints out the following:
       /* Java : this is overwritten
        BASIC : Beginners All Purposes Symbolic Instruction Code
        Lisp : Therein lies madness
        Python : an interpreted, object-oriented, high-level programming language with dynamic semantics
        Algol : an algorithmic language*/
       //NOTICE that the ordering isn't the same as we put it in
        //That's a part of using a default HashMap
    }
}
