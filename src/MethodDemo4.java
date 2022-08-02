
public class MethodDemo4 {
	public static void main(String[] args) {
//		mymethod(5, 62.7,'A', "Yes Master");
//		mymethod(new int[] {3,4,5,6});
//		Student jimin = new Student();		jimin.name = " 한지민 "; jimin.age=26;
//		mymethod(jimin);
		int original = 5;
		System.out.println("Before Call method original" + original);
		
		mymethod(original);
		System.out.println("Before Call method original" + original);		
		
	}
//		static void mymethod(Student mystudent) {						//Call by Reference
//			return;		
	// static void mymethod(int su, double weight, char grade, String str) {

	static void mymethod(int target) {
		System.out.println("in method, target = " + target);
		target = 100;
		System.out.println("in method, target = " + target);
		
	}
	
}
