package com.bansal.common;

import java.util.Scanner;
import java.util.logging.Logger;


public class Common {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        String input = "ss";//sc.nextLine();
        System.out.println("You entered: "+input);
        //log.info("DONE for logging.");


        System.out.println("Path: "+System.getProperty("user.dir")); //Prints user directory

    }
}
