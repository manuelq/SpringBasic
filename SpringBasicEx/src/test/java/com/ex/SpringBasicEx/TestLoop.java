package com.ex.SpringBasicEx;

import java.util.Scanner;

public class TestLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		    Scanner get = new Scanner(System.in);
		    int number;

		    // Ex.1.

		    String family_name;
		    String[] family_array;

		    System.out.println("Enter number of family members: ");
		    number = Integer.parseInt(get.nextLine());
		    family_array = new String[number];

		    for(int i = 0; i < number; i++){
		        System.out.println("Enter family member name: "+i);
		        family_name = get.nextLine();
		        family_array[i] = family_name;
		    }

		    for(int i = 0; i < number; i++){
		        System.out.println(family_array[i]);
		    }


	}

}
