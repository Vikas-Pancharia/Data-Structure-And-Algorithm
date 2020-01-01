package com.cg.array;

public class SingleDimentionalArrayMain {

	public static void main(String[] args) {

		System.out.println("Creating a blank array of size 10...");
		SingleDimentionalArray sda = new SingleDimentionalArray(10);
		sda.traverseArray();
		System.out.println();
		System.out.println();

		System.out.println("Inserting few values in the Array...");
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(3, 30);
		sda.insert(4, 40);
		sda.insert(5, 50);
		sda.insert(6, 60);
		sda.insert(7, 70);
		sda.insert(8, 80);
		sda.insert(1, 100);
		sda.insert(12, 1200);
		System.out.println();
		System.out.println();
		
		System.out.println("Accessing cell number#1...");
		sda.accessingCell(1);
		System.out.println();
		System.out.println();
		
		System.out.println("Searching 30 in the array...");
		sda.searchInAnArray(30);
		System.out.println();
		System.out.println();
		
		System.out.println("Searching 400 in the array...");
		sda.searchInAnArray(400);
		System.out.println();
		System.out.println();
		
		System.out.println("Delete value from Cell#3 of array...");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(3);
		System.out.println();
		System.out.println("After Deleting: ");
		sda.traverseArray();
		System.out.println();
		System.out.println();
	}

}
