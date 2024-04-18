package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {

        /**
         * Do whiles
         * and
         * While loops
         */
        int count = 0;
        boolean checker = true;

        do {
            System.out.println("Our current count is: " + count);
            count++;

            if(count > 5) {
                checker = false;
            }
        } while(checker);

        while(checker) {
            System.out.println("Our current count is: " + count);
            count++;

            if(count > 5) {
                checker = false;
            }
        }


        while(count < 10) {
            count+=2;
            System.out.println(count);
        }

        do {
            System.out.println(count);
            count++;
        } while (count < 4);

        /**
         * for loops!
         */

        //counting 0 - 9
        for(int iterator = 0; iterator < 10; iterator++) {
            System.out.println(iterator);
        }

        //count from 10 - 1 by 2
        for(int i = 10; i > 0; i-=2) {
            System.out.println(i);
        }

    }
}
