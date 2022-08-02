
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is running");
		MethodDemo md = new MethodDemo();
		md.makeSum();
		md.makeSum();
		System.out.println("Program is not running");
	}

	void makeSum() {								//Call By Name				 // 메소드의 3요소, 이름 필요.Name, 파라미터가 들어올수있는 괄호.(), 복귀를 위한 리턴타입이 필요.
		System.out.println("Method is running");
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is not running");
	}
}