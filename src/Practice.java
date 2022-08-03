
public class Practice {
	public static void main(String[] args) {
		int [] answer = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
		String [] names = {"한지민", "박지민", "홍지민", "신지민", "김지민"};
		int [][] array = {
				{1, 2, 2, 4, 2, 2, 3, 4, 1, 2},
				{1, 2, 3, 4, 1, 1, 1, 4, 1, 1},
				{1, 2, 3, 4, 1, 2, 3, 4, 1, 2},
				{1, 3, 3, 3, 3, 3, 3, 3, 1, 2},
				{1, 2, 3, 4, 1, 2, 3, 1, 1, 2}
		};
		char [][] result = new char[names.length][10];
		int [] jumsus = new int[names.length];
		for(int i = 0; i < result.length; i++) {
			int jumsu = 0;
			for(int j =0; j < result[i].length; j++) {
				if(array[i][j] == answer[j]) {
					result[i][j] = 'O'; jumsu += 10;
				}
				else result[i][j] = 'X';
			}
			jumsus[i] = jumsu;
		}
		
		//////////////////////////////
		for(int i = 0; i < result.length; i ++) {
			System.out.print(names[i] + " : ");
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%c\t", result[i][j]);
			}
			System.out.println("(" + jumsus[i] + "점)");
		}
	}
}
