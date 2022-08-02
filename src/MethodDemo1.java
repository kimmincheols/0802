
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Program is running");
		MethodDemo1 md = new MethodDemo1();
		md.makeSum(1, 100);
		md.makeSum(30, 50);
		System.out.println("Program is not running");
	}

	void makeSum(int start, int last) {								//Call By Name	//Call by Value			 // 메소드의 3요소, 이름 필요.Name, 파라미터가 들어올수있는 괄호.(), 복귀를 위한 리턴타입이 필요.
		System.out.println("Method is running");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println(start + "부터" + last + "까지의 합은= " + sum);
		System.out.println("Method is not running");
	}
}