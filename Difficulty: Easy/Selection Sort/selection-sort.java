class Solution {
	void selectionSort(int[] arr) {
		// code here
		int mnidx = 0;
		for (int i = 0; i<arr.length; i++) {
		    int min = Integer.MAX_VALUE;
			for (int j = i; j<arr.length; j++) {
				if (min>arr[j]) {
					min = arr[j] ;
					mnidx = j;
				}
			}
				int temp = arr[i];
				arr[i] = min;
				arr[mnidx] = temp;
		}
	}
}
