package application;

import application.exceptions.TemperatureOutOfRangeException;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemparature(70);
		} catch (TemperatureOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}