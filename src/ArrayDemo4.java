
public class ArrayDemo4 {
	public static void main(String[] array) {
		//java ArrayDemo4  45 + 78  array에 값저장
//		for(int i =0; i < array.length; i++) {
//			System.out.println("array[" + i + "] = " + array[i]);
//		}
		if(array.length !=3) {
			System.err.println("Usage Error");
			System.exit(-1);
		}		
		
		int first = Integer.parseInt(array[0]);	// "45" -> 45
		int second = Integer.parseInt(array[2]); // "78" -> 78
		switch(array[1]) {
		case "+" : System.out.printf("%d + %d = %d\n", first,  second,(first + second)); break;
		case "-" : System.out.printf("%d - %d = %d\n", first,  second,(first - second));	break;
		case "x" : System.out.printf("%d x %d = %d\n", first,  second,(first * second));	break;
		case "/" : System.out.printf("%d / %d = %d\n", first,  second,(first / second));	break;
		case "%" : System.out.printf("%d %% %d = %d\n", first,  second,(first % second));break;
		default : System.out.println("이런 부호는 없습니다 ^^깔깔");
		
		}
		
	}
}