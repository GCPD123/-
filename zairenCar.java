package com.car;

public class zairenCar extends Car {

	public zairenCar(double cargoCapacity,double peopleCapacity,String name,double rent) {
		this.setCargoCapacity(cargoCapacity);
		this.setPeopleCapacity (peopleCapacity);
		this.setName (name);
		this.setRent (rent);
		System.out.println("���˳����췽��ִ����");
		System.out.println(this.getPeopleCapacity());
	}
		// TODO Auto-generated constructor stub
	
	
}
