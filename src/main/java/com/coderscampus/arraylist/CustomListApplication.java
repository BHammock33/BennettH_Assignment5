package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> testList = new CustomArrayList<>();
		addNums(testList);
		testList.toString();
		int size = testList.getSize();
		System.out.println(size);
		System.out.println("---------");
		addRepeatedNums(testList);
		System.out.println(size);
		String testItem = testList.get(4);
		System.out.println(testItem);
		for(int i=0; i < testList.getSize(); i++) {
			System.out.println(testList.get(i));
		}
	}

	private static void addRepeatedNums(CustomList<String> testList) {
		testList.add("element 1");
		testList.add("element 2");
		testList.add("element 3");
	}

	private static void addNums(CustomList<String> testList) {
		testList.add("element 1");
		testList.add("element 1");
		testList.add("element 1");
		addRepeatedNums(testList);
		testList.add("element 4");
		testList.add("element 5");
		testList.add("element 6");
		testList.add("element 7");
		testList.add("element 8");
		testList.add("element 9");
		testList.add("element 10");
		testList.add("element 11");
		testList.add("element 12");
		testList.add("element 13");
		testList.add("element 14");
		testList.add("element 15");
		testList.add("element 16");
		testList.add("element 17");
		testList.add("element 18");
		testList.add("element 19");
		testList.add("element 20");
		testList.add("element 21");
		testList.add("element 22");
		testList.add("element 23");
		testList.add("element 24");
		testList.add("element 25");
		testList.add("element 26");
		testList.add("element 27");
		testList.add("element 28");
		testList.add("element 29");
		testList.add("element 30");
		testList.add("element 31");
		testList.add("element 32");
		testList.add("element 33");
		testList.add("element 34");
		testList.add("element 35");
		testList.add("element 36");
		testList.add("element 37");
		testList.add("element 38");
		testList.add("element 39");
		testList.add("element 40");
		testList.add("element 41");
		testList.add("element 42");
		testList.add("element 23");
		testList.add("element 15");
	}
}
