package com.pluralsight;

public class Practice {

    public static void main(String[] args) {

        //Data Types

        //primitive v non-primitive data types


        /**
         * primitive = char, int, long, float, double, boolean
         * non-primitive = String
         */
        //Character types
            //char - singular alphabetical value
            //String = alphanumeric values, collection of characters
                //Requires "", '', `` quotes

        //Numerical types
            //int - integer
            //long - bigger integer

            //float - contains values after decimal
            //double - contains values after decimal

        //boolean type - true or false 1 or 0


        String output = "My Favorite Color: ";

        String myFavColor = "Purple";

        System.out.println(output);

        output += myFavColor;

        System.out.println(output);


        int aliciasFavNum = 22;

        aliciasFavNum += 2;
        //modulus

        System.out.println(10 % 3);


        long testVal = 200000000000l;
        float testFloat = 2.25f;





        //Adding 1 or Subtracting 1

        int helloCount = 1;
        int heyCount = 100;

        System.out.println(Math.min(1, 100));

        helloCount++; //increments by 1
        helloCount--; //decreases by 1






    }

}
