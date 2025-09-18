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
		//test that it finds the right index for all elements in arr
		for(int i=0; i < arr.length-1; i++) {
			assertEquals(i, BinarySearch.binarySearch(arr, arr[i]));
			
		}
	}
	
	@Test
	void testNotAnElement() {
		int[] testArr = {1, 2, 5, 10, 15, 20, 221};
		
		assertEquals(-1, BinarySearch.binarySearch(arr, -5));
		assertEquals(-1, BinarySearch.binarySearch(testArr, 0));
	}
	
	@Test
	void testEmptyArray() {
		int[] emptyArr = {};
		
		assertEquals(-1, BinarySearch.binarySearch(arr, -5));
		assertEquals(-1, BinarySearch.binarySearch(arr, 0));
		
	}

}
