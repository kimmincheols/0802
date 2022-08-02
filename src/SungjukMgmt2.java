

public class SungjukMgmt2 {
	public static void main(String[] args) {
		System.out.println("성적 관리 프로그램 시작! ");
		Student jimin = new Student();
		Input.input(jimin);
		Calc.calc(jimin);
		Output.output(jimin);
		System.out.println("성적 관리 프로그램 끝! ");		
	}
}
