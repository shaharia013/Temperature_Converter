package com.shaharia.TemperatureConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	System.out.println(" ************* Temperature Converter Started ***************");
    	System.out.println();
    	System.out.println();
    	
        
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("allxml.xml");
    	
    
		boolean shouldBreak = false;
	
		while(true) {
			
			System.out.println();
	    	System.out.println();
			System.out.println(" ************* New Conversion *************");
			System.out.println(" ************** Enter E to end the Converter ***************");
			
			System.out.println("Enter the Source : ");
	    	
	    	BufferedReader bfBufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    	String string = bfBufferedReader.readLine();
			
			
			System.out.println("Enter the target : ");
			String targetString = bfBufferedReader.readLine();
			System.out.println();
			
			switch (string) {
			case "C":
				if(targetString.equalsIgnoreCase("F")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("celtofah");
			    	temp.convert();
				}
				else if(targetString.equalsIgnoreCase("K")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("celtokel");
			    	temp.convert();
				}
				else {
					System.out.println("Select target between F and K");
				}
				shouldBreak = false;
				break;
				
			case "F":
				if(targetString.equalsIgnoreCase("C")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("fahtocel");
			    	temp.convert();
				}
				else if(targetString.equalsIgnoreCase("K")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("fahtokel");
			    	temp.convert();
				}
				else {
					System.out.println("Select target between C and K");
				}
				shouldBreak = false;
				break;
				
			case "K" :
				if(targetString.equalsIgnoreCase("C")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("keltocel");
			    	temp.convert();
				}
				else if(targetString.equalsIgnoreCase("F")) {
					TemperatureConverter temp = (TemperatureConverter) applicationContext.getBean("keltofah");
			    	temp.convert();
				}
				else{
					System.out.println(" Select target betweer C and F");
				}
				
				shouldBreak = false;
				break;
				
				
			case "E" :
				shouldBreak = true;
				break;
				

			default:
				if(!string.equalsIgnoreCase("E")) {
					System.out.println("Invalid source");
				}
				break;
			}
			
			if(shouldBreak)
				break;
			
		}
		
		
		System.out.println();
    	System.out.println();
		System.out.println(" ************* Temperature Converter Ended ***************");
    }
		
    }

