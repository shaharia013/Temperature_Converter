package com.shaharia.TemperatureConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fahrenheit_to_Celsius implements TemperatureConverter{
	public void convert() {
		
		System.out.println("Enter the source temperature at Fahrenheit : ");
		
		BufferedReader bfBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		try {
			string = bfBufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int fahrenheit = Integer.parseInt(string) ;
		
		int celsius = ((fahrenheit-32)*5)/9;
		
		System.out.println("Target temperature at  Celsius :  " + celsius);
		
		
	}

}
