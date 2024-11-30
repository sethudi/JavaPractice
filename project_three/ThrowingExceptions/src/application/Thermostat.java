package application;

public class Thermostat {
	public void setTemparature(double temperature) throws Exception {
		
		if(temperature <0 || temperature >35) {
			throw new Exception("Temperature out of range");
		}
		
		System.out.println("setting temperature to "+ temperature);
	}
}
