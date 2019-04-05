package de.whz.gdp2.g8.vehicle_booking_gui.model;

public abstract class LandVehicle extends VehicleBase {

	public LandVehicle(String name, int distance) {
		super(name, distance, OperatingEnvironment.LAND);
	}
}
