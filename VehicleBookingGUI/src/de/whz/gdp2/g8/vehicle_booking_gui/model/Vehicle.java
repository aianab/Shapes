package de.whz.gdp2.g8.vehicle_booking_gui.model;

public interface Vehicle {
	boolean isAvailable();

	int getMaxDistance();

	OperatingEnvironment getOperatingEnvironment();

	String getName();

	void book();

	boolean canOperateOn(OperatingEnvironment environment);
}
