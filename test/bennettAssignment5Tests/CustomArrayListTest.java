package bennettAssignment5Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {

	@Test
	void should_remove_one_item_from_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		populateList(sut);

		int movedItem = 5;
		int removedItem = sut.remove(4);
		// testing removal
		assertEquals(removedItem, 4);
		// testing if the other items are shifting
		assertEquals(movedItem, sut.get(4));
	}
	
	

	@Test
	void should_add_item_at_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		populateList(sut);
		int movedItem = 7;
		sut.add(6, 3);
		// test add
		assertEquals(3, sut.get(6));
		// test shifting to right
		assertEquals(movedItem, sut.get(7));
	}

	@Test
	void Should_add_item_to_list() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(10);

		assertEquals(10, sut.get(0));
	}

	@Test
	void Should_get_item_from_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		populateList(sut);
		
		int target = sut.get(5);
		assertEquals(target, 5);

	}

	@Test
	void Should_return_size_of_List() {
		CustomList<Integer> sut = new CustomArrayList<>();
		populateList(sut);
		int size = sut.getSize();

		assertEquals(size, 14);
	}

	private void populateList(CustomList<Integer> sut) {
		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}
//		sut.remove(9);
		sut.add(1000);
		sut.add(9, 1000);
		sut.add(6, 2000);
		sut.add(6, 3000);
		sut.remove(9);
		sut.remove(10);
		sut.add(5000);
		sut.add(9000);
	}

}
