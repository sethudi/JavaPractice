package application;

import application.exceptions.TemperatureOutOfRangeException;

public class Thermostat {
	public void setTemparature(double temperature) throws TemperatureOutOfRangeException {
		
		setMachineTemperature(temperature);
		System.out.println("setting temperature to "+ temperature);
	}
	
	private void setMachineTemperature(double temperature) throws TemperatureOutOfRangeException{
		if(temperature <0 || temperature >35) {
			throw new TemperatureOutOfRangeException("Temperature out of range");
		}
	}
}
