package binarySearch;

public class BinarySearch {
	public static int binarySearch (int [] array, int target) {
		int min = 0;
		int max = array.length - 1;
		int mid = (max + min) / 2; 
		
		while (min != max) {
			mid = (max + min) / 2; 
			System.out.println(array[mid]);
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target) {
				max = mid ;
			} else if (array[mid] < target) {
				min = mid;
			}
		}
		return -1; 
		
	}
	
	
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 7};
		
		System.out.println(binarySearch(arr, 2));
	}
	

}
