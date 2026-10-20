package lsk;

public abstract class MotorVehicle extends TransportationDevice{
	Engine engine;
	public void startEngine(){
		engine.start();
	}
}
