package com.scaler01.greetings;

public class Greetings {

    /*
    *
    * Write a function which prints the appropriate greeting message based on the time of the day.
    *
    * */

    public static String greet() { 

        int hour = java.time.LocalTime.now().getHour();

        if(hour >= 0 && hour < 12){

            return "Good Morning!";

        } else if(hour >= 12 && hour < 16){

            return "Good Afternoon!";

        } else if(hour >= 16 && hour < 20){

            return "Good Evening!";

        } else {
            return "Good Night!";
        }
    }

}
