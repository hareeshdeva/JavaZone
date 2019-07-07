package com.javapractice.examples;

import java.util.Scanner;

public class BewareTheKraken {
	public static void main(String[] args) {
		System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
		System.out.println("Here we goooOOooOooo.....! *SPLASH*");

		int depthDivedInFt = 0;
		boolean isSwim = false;

		// Turns out the ocean is only so deep, 36200 at the deepest survey,
		// so if we reach the bottom ... we should probably stop.
		while (depthDivedInFt < 36200) {
			System.out.println("So far, we've swam " + depthDivedInFt + " feet");
			Scanner sc  = new Scanner(System.in);
			System.out.println("Do you want swim more?");
			isSwim = sc.nextBoolean();
			if(isSwim ==  false){
				System.out.println("Better luck next time.");
				break;
			}
			if (depthDivedInFt >= 20000) {
				System.out.println("Uhhh, I think I see a Kraken, guys ....");
				System.out.println("TIME TO GO!");
				break;
			}
			// I can swim, really fast! 500ft at a time!
			depthDivedInFt += 1000;
		}
		System.out.println("");
		System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
		System.out.println("I bet we can do better next time!");
	}
}
