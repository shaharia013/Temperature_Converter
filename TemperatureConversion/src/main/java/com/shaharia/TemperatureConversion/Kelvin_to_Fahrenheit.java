package com.shaharia.TemperatureConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kelvin_to_Fahrenheit implements TemperatureConverter {
	public void convert() {
		System.out.println("Enter the source temperature at Kelvin : ");
		
		BufferedReader bfBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		try {
			string = bfBufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
         double kelvin = Double.parseDouble(string) ;
		
		int fahrenheit = (((int)(kelvin - 273.15) * 9) / 5 ) + 32;
		
		System.out.println("Target temperature at  fahrenheit :  " + fahrenheit);
		
	}

}
