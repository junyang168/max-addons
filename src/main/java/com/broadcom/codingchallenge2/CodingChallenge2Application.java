package com.broadcom.codingchallenge2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingChallenge2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CodingChallenge2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Enter Number:");
		java.io.Console co=System.console();
		if( co == null)
		   return;
		String input = co.readLine();
		try { 
			int num =Integer.parseInt(input);  		
			MaxProductFinder finder = new MaxProductFinder( );	
			System.out.print("Max Product of addons: ");	
			System.out.println( finder.getMaxProduct( num ) );
		} catch (NumberFormatException e) {
			System.out.println("Invalid number ");
		}
	 }	
}
