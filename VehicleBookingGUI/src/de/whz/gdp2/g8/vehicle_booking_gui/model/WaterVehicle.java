package de.whz.gdp2.g8.vehicle_booking_gui.model;

public abstract class WaterVehicle extends VehicleBase {

	public WaterVehicle(String name, int distance) {
		super(name, distance, OperatingEnvironment.WATER);
	}
}
