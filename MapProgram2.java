package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram2 {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");


        System.out.println(languages.get("Java"));

        languages.put("Java", "this is overwritten");
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this is overwritten");
        }

        System.out.println("================================================");

        System.out.println(languages.keySet());

        //learning how to REMOVE. Really simple.
        //(Reminds me of CRUD for databases)
        //Maybe, I shouldn't have created a MapProgram2
        //Remove method can also return true or false
                //languages.remove("Lisp");
        //If you were to replace the value paired with Algol
        //in the following if-else statement
        //with "an algorithmic language"
        //"Algol removed" will be printed.
        //This entails that language.remove is actually
        //being run. And once it has, the sout applies.
        //That seems to indicate that the reason
        //Algol wasn't removed was because the key/value
        //did not match with what was in language.put
        //This is...obvious...but now I get it...
        if(languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

       //learning how to REPLACE
        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        //The above code prints out Lisp's original value
        //But, once the forEach loop is run, we're returned with
        //the replaced value
        System.out.println(languages.replace("Scala", "this will not be added"));
        //You can only replace items on file, so the sout
        //for Scala returns null
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        //shows that Lisp has truly been removed
        System.out.println(languages.keySet());

        //now like we did with remove. We can also use an
        //if-else statement to ensure checks
        //also, notice the THREE parameters
        //key, oldValue, newValue
        //also, if-else statements require a boolean
        //but since the method is also run
        //I'm assuming that this means the following
        //"If the following method CAN be run", not only
        //will it run, but it will also return a true boolean
        //and run whatever code is inside the block
        //I think that that's what it means....

        System.out.println("================================================");
        //remember, you can only replace something that
        //at first existed AND the previous one
        //for example, Lisp was originaly "Therein lies madness"
        //Then, it's been changed to "a function programming...
        //Then, finally to "replaced for the second time"
        if(languages.replace("Lisp", "a functional programming language with imperative features", "replaced for the second time")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        //WOAH
        //You can actually use ANY OBJECT for the key and value
        //You can even use another MAP for the key and value
        //but, it's risky to do because it's confusing
        //You CANT have a map contain itself as a key however
        //But why would anyone do that...
    }

}

