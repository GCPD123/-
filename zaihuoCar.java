package com.car;

public class zaihuoCar extends Car {
	

	public zaihuoCar(double cargoCapacity,double peopleCapacity,String name,double rent) {
		this.setCargoCapacity(cargoCapacity);
		this.setPeopleCapacity (peopleCapacity);
		this.setName (name);
		this.setRent (rent);
		System.out.println("�ػ������췽��ִ����");
		System.out.println(this.getPeopleCapacity());
	}
}