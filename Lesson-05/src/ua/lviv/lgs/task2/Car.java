package ua.lviv.lgs.task2;

public class Car {

	public String model;

	int maxSpeed;

	String bodyType;

	public Car(String model) {
		maxSpeed = 200;
		this.model = model;

	}

	public Car(String model, int maxSpeed, String bodyType) {

		this.model = model;
		this.maxSpeed = maxSpeed;
		this.bodyType = bodyType;
	}

}
