package com.cg.array;

public class TwoDimentionalArrayMain {

	public static void main(String[] args) {
		
		System.out.println("Creating a blank array of size 5x5...");
		TwoDimentionalArray tda = new TwoDimentionalArray(5, 5);
		tda.traverseArray();
		
		tda.insertValueInTheArray(0, 2, 1000001);
		tda.traverseArray();
		
		tda.insertValueInTheArray(0, 2, 1000001);
		tda.traverseArray();
		
		tda.accessingCell(0, 2);
		tda.accessingCell(6, 2);
		tda.accessingCell(2, 2);
		
		tda.searchingSingleValue(10);
		tda.searchingSingleValue(-2147483648);
		tda.searchingSingleValue(1000001);
		
		tda.deleteValueFromArray(0, 2);
		tda.traverseArray();
		
		tda.deleteThisArray();
		tda.traverseArray();
	}
}
