import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		SortingAlgo sa = new SortingAlgo();
		int[] array = {10,2,5,3,1};
		
		sa.incInsertationSort(array);
		sa.decInsertationSort(array);
	}

}

class SortingAlgo {

	int[] keys = new int[5];
	
	public void incInsertationSort(int[] array){
		int i;
		for(int j = 1; j<array.length; j++){
			int key = array[j];
			i = j - 1;
			while(i >= 0 && array[i]>key){
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}
		System.out.println("Insartion Sort Algo: " + Arrays.toString(array));
	}
	
	public void decInsertationSort(int[] array){
		int i;
		for(int j = array.length-2; j>=0; j--){
			int key = array[j];
			i = j + 1;
			while(i < array.length && array[i]>key){
				array[i - 1] = array[i];
				i = i + 1;
			}
			array[i - 1] = key;
		}
		System.out.println("Insartion Sort Algo: " + Arrays.toString(array));
	}
	
	
}
