package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<Integer> testList = new CustomArrayList<>();
		for (int i = 0; i < 42; i++) {
			testList.add(i); // basic add check
		}
		testList.add(6, 200); // add at index check
		int newNum = testList.remove(8); // remove at index check
		for (int i = 0; i < testList.getSize(); i++) { 
			System.out.println(testList.get(i)); // get at index check
		}
		System.out.println(testList.getSize()); // get size check
		System.out.println("-------");
		System.out.println(newNum); // remove at index check

	}

}
