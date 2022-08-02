import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,7,2,8,9,6,7,4,5,6,7,1,56,43,5,4};
		System.out.println("Befor Sorting");
		System.out.println(Arrays.toString(array));
	
		Arrays.sort(array);
		System.out.println("After Ascding Sorting");
		System.out.println(Arrays.toString(array));
		
		System.out.println("After Descding Sorting");
		System.out.print("[");
		for( int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + ",");			
		}
			System.out.println("]");
	}
}
