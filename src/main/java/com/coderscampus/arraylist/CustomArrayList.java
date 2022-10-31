package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private int baseSize = 10;
	private int size;
	Object[] items = new Object[baseSize];

	@Override
	public boolean add(T item) {
		if (items.length == size) {
			grow();
		}
		items[size] = item;
		size += 1;
		return true;
	}

	private void grow() {
		Object[] bigArray = Arrays.copyOf(items, items.length * 2);
		items = bigArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
//		
		if (size == items.length) {
			grow();
		}
		for (int i = size - 1; i > index; i--) {
			items[i + 1] = items[i];
		}
		items[index] = item;
		size++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		Object removedItem = items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		size--;
		return (T) removedItem;
	}

}
//Add Attempt one
//Object[] shiftedArray = Arrays.copyOf(items, (items.length) + 1);
//if (shiftedArray.length == size) {
//	grow();
//}
//for (int i = 0; i < index; i++) {
//	shiftedArray[i] = items[i];
//}
//shiftedArray[index] = item;
//for (int i = index + 1; i < items.length; i++)
//	shiftedArray[i] = items[i - 1];
//items = Arrays.copyOf(shiftedArray, shiftedArray.length);
//return true;

//remove Attempt one
//Object[] shrinkArray = new Object[size + 1];
//
//		for (int i = 0; i < index; i++) {
//			shrinkArray[i] = items[i];
//		}
//		for (int i = index + 1; i < shrinkArray.length; i++)
//			shrinkArray[i - 1] = items[i];
//		items = Arrays.copyOf(shrinkArray, shrinkArray.length);
//		return (T) removedItem;
//	}
