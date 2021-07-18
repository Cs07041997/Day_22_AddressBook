package com.bridgelabz.program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice = 0;
        while (choice!=10) {
            System.out.print("please choose from below\n1-add contact\n2-edit contact\n3-delete person\n4-search person\n10-exit \n:-> ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deletePerson();
                case 4:
                    addressBook.searchByCity();
                case 10:
                    break;
            }
        }
    }
}

	
