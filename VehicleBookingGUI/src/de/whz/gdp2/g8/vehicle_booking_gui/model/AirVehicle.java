package de.whz.gdp2.g8.vehicle_booking_gui.model;

public abstract class AirVehicle extends VehicleBase {

	public AirVehicle(String name, int distance) {
		super(name, distance, OperatingEnvironment.AIR);
	}

}
