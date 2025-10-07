package com.pluralsight;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        try{
            System.out.println("Enter the name of a story: ");
            String storyInput = myScanner.nextLine();
            FileReader fileReader = new FileReader(storyInput);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            int counter = 1;
            while((input = bufferedReader.readLine()) != null){
                System.out.println(counter + ". " + input);
                counter++;
            }
            bufferedReader.close();
        }
        catch(IOException e){
            System.err.println("The story does not exist.");
        }
    }
}
