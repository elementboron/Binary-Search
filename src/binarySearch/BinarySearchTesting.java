package binarySearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTesting {
	
	private BinarySearch testObj;
	private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	
	@BeforeEach
	void setup() {
		testObj = new BinarySearch();
	}

	@Test
	void testHappy() {
		assertEquals(1, BinarySearch.binarySearch(arr, 2));
	}

}
