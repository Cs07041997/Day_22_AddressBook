package com.bridgelabz.program;

public class Person {
	 String firstName;
	    String lastName;
	    String address;
	    String city;
	    String zipCode;
	    String phoneNumber;
	    String email;

	    public Person(String firstName, String lastName, String address, String city, String zipCode, String phoneNumber, String email) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.zipCode = zipCode;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", address='" + address + '\'' +
	                ", city='" + city + '\'' +
	                ", zipCode='" + zipCode + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }

}
