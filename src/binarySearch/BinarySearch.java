package binarySearch;

public class BinarySearch {
	public static int binarySearch (int [] array, int target) {
		int min = 0;
		int max = array.length - 1;
		int mid = (max + min) / 2; 
		
		while (array[mid] != target) {
			if (array[mid] > target) {
				min = mid;
			} else if (array[mid] < target) {
				max = mid;
			}
			else if (min == max) {
				return -1;
			}
		}
		return mid; 
		
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int target = 6;
		
		binarySearch(array, target);
	
		System.out.println(binarySearch(array, target));
	}

}
