package com.someotherpackage;

import java.util.Scanner;

public class Coin{
	  public static void main (String[] Args){
	  Scanner sc = new Scanner (System.in);
	  System.out.print("Enter a number");
	  int i = sc.nextInt();
	  int q = 25;
	  int d = 10;
	  int n = 5;
	  int p = 1;
	  int quarters = (i/q);
	  int dimes = (i - quarters*25)/d;
	  int nickels = (i - (quarters*25) - (dimes*10))/n;
	  int pennies = (i - (quarters*25) - (dimes*10) - (nickels*5))/p;
	  System.out.println ("Your amount contain the following");
	  System.out.println ("quarters:   " + quarters);
	  System.out.println ("dimes:    " + dimes);
	  System.out.println ("nickels:    " + nickels);
	  System.out.println ("pennies:    " + pennies);

	}}