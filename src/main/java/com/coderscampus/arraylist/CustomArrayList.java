package com.coderscampus.arraylist;

import java.util.Arrays; 
import java.util.Objects;

public class CustomArrayList<T> implements CustomList<T> {
	private int baseSize = 10;
	private int size;
	Object[] items = new Object[size];
	Object[] emptyArray = {};
	Object[] intermediateArray = new Object[baseSize];

	public CustomArrayList() {
		this.intermediateArray = emptyArray;
	}

	public Object[] toArray() {
		return Arrays.copyOf(intermediateArray, baseSize);
	}

	private void add(T item, Object[] intermediateArray, int size2) {
		if (size2 == intermediateArray.length)
			intermediateArray = grow();
		intermediateArray[size2] = item;
		size = size2 + 1;
	}

	@Override
	public boolean add(T item) {
		int i;
		for (i = 0; i < size; i++) {
			if (item.equals(intermediateArray[i])) {
				return false;
			}
		}
		add(item, intermediateArray, size);
		return true;

	}

	private Object[] grow(int minCap) {
		int oldCap = intermediateArray.length;
		if (oldCap > 0 || intermediateArray != emptyArray) {
			int newCap = CustomArrayList.newLenght(oldCap, minCap - oldCap, oldCap >> 1);
			return intermediateArray = Arrays.copyOf(intermediateArray, newCap);
		} else {
			return intermediateArray = new Object[Math.max(baseSize, minCap)];
		}

	}

	private Object[] grow() {
		return grow(size + 1);
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	T intermediateArray(int index) {
		return (T) intermediateArray[index];
	}

	@Override
	public T get(int index) {
		Objects.checkIndex(index, size);
		return intermediateArray(index);
	}

	private static int newLenght(int oldLenght, int minGrowth, int perfGrowth) {
		int prefLength = oldLenght + Math.max(minGrowth, perfGrowth);
		if (0 < prefLength && prefLength <= 200) {
			return prefLength;
		} else {
			return 1000;
		}
	}
}
