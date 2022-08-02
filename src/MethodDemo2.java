
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is running");
		MethodDemo2 md = new MethodDemo2();
		int start = 1, last = 100;
		int result = md.makeSum(start, last);
		System.out.println(start + "부터" + last + "까지의 합은= " + result);
		start=30; last=50;
		result = md.makeSum(start, last);
		System.out.println(start + "부터" + last + "까지의 합은= " + result);
		System.out.println("Program is not running");
	}

	int makeSum(int start, int last) {								//Call By Name	//Call by Value			 // 메소드의 3요소, 이름 필요.Name, 파라미터가 들어올수있는 괄호.(), 복귀를 위한 리턴타입이 필요.
		System.out.println("Method is running");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println("Method is not running");
		return sum;
	}
}