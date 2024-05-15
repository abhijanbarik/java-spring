package com.scaler01;
import com.scaler01.greetings.Greetings;
import com.scaler01.http.Client;
public class Main {
    public static void main(String[] args) {

//        System.out.println("WELCOME back to the game: ABHIJAN");

        /*********************************************************************************/

//        Greetings seeTime = new Greetings();
//
//        System.out.println(seeTime.greet());

        /*********************************************************************************/

        Client client = new Client();

        String response = client.get("https://github.com/square/okhttp");

        System.out.println(response);
    }
}
