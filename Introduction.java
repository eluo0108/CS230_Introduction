
/* Introduction.java
 * Practice printing with System.out.print and variables and strings
 * CS230 Lab 1 
 * Written by: CS230
 * Modified by: Esther Luo
 * Modified date: sept 11 2019
 */
import java.util.Scanner;
public class Introduction {
  public static void main (String[] args) {
  //declare and initialize vars
  
  System.out.println("Hi, What is your name?");
  Scanner scan = new Scanner(System.in);
  String name = scan.nextLine();
  
  System.out.println("What is the year of your graduation?");
  Scanner scan1 = new Scanner(System.in);
  int year = scan1.nextInt();  
  
  System.out.println("How much money do you have?");
  Scanner scan2 = new Scanner(System.in);
  double money = scan2.nextDouble();   
  
  System.out.println("Is it true that you are a CS major?");
  Scanner scan3 = new Scanner(System.in);
  boolean cs_major = scan3.nextBoolean(); 
  
    /*String name = "stella";
    int year = 2018;
    double money = 54.23;
    boolean cs_major = true;*/
  
  //put together and show introductory paragraph
    System.out.println("Hi, my name is " + name);
    System.out.println("I am in the class of "+ Integer.toString(year)); // year works solo too
    System.out.println("I have $" + Double.toString(money) + " in my wallet.");
    System.out.println("I am "+ name + " and I am a CS major: " + cs_major);
    System.out.println(); // blank output line for separation when running program multiple times
     
   }
}
