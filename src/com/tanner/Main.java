package com.tanner;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {


    public static void main(String[] args) {
        System.out.println(play());
    }

    static int getRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    static int getUserNum(){
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Pick a number 1-100: ");
        String userInput = numScanner.next();
        int userNum = Integer.parseInt(userInput);
            return userNum;
    }



    static String play(){
        int randomInt = getRandom(1,100);
        int userGuess = getUserNum();
        while(randomInt != userGuess){
            if(userGuess > randomInt){
                System.out.println("Guess lower");
                userGuess = getUserNum();
                System.out.println(userGuess);
            } else if(userGuess < randomInt){
                System.out.println("Guess higher");
                userGuess = getUserNum();
            }
        }
        return "You win! The number is " + randomInt + "!";
    }
}
