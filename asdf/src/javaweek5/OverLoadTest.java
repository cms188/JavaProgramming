package javaweek5;

public class OverLoadTest {

	public static void main(String[] args) {
		OverLoad Ov = new OverLoad();
		System.out.println("int 유형인수의 결과: "+Ov.Calc(2, 5));
		System.out.println("double 유형인수의 결과: "+Ov.Calc(2.0, 5.0));
	}

}
