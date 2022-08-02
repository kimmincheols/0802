
public class ArrayDemo1 {
	public static void main(String[] args) {
		
//		<<Rectangular Array>>
		// 1stway
//		int [][] array = null;		//declaration 선언
//		array = new int[2][3];
//		array[0][0] = (int)(Math.random() * 10 +1);
//		array[0][1] = (int)(Math.random() * 10 +1);
//		array[0][2] = (int)(Math.random() * 10 +1);
//		array[1][0] = (int)(Math.random() * 10 +1);
//		array[1][1] = (int)(Math.random() * 10 +1);
//		array[1][2] = (int)(Math.random() * 10 +1);

//		2stway
//		int [][] array ;
//		array = new int [][] { {3,4,5,6}, {7,8,9,10}};
		
//		3stway
//		int [][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
		
		
		
//		<< Ragged(Jagged)Array>>
//		1stway
//		int [][] array;			//Declaration
//		array = new int [3][];				//Creation 3층까지는 정해졌지만 열을 모른다.
//		array[0] = new int[ 3];
//		array[1] = new int[ 2];
//		array[2] = new int[ 1];
//		array[0][0] =  (int)(Math.random() * 10 +1);			//Assignment
//		array[0][1] =  (int)(Math.random() * 10 +1);
//		array[0][2] =  (int)(Math.random() * 10 +1);
//		array[1][0] =  (int)(Math.random() * 10 +1);
//		array[1][1] =  (int)(Math.random() * 10 +1);
//		array[2]01] =  (int)(Math.random() * 10 +1);
		
//		2stway
//		int [][] array;
//		array = new int [3][];
//		array[0] = new int[] { 3,4,5,6,7,8,9,1};
//		array[0] = new int[] { 9,10};
//		array[0] = new int[] { 11,12,13,14 };
		
////		3stway		
//		int [][] array = {
//				{3,4,5,6},
//				{7,8},
//				{9,10,11,12,13,14}
//		};
//		
//		for(int i = 0; i < array.length ; i++) {
//			System.out.println("array" + i + "층");
//			for(int j = 0; j < array[i].length; j++) {
//				System.out.print("array[" + i + "][" + j +"] =" + array[i][j] + "\t");
//			}
//			System.out.println();
//		}

		
	}
}
