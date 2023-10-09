package access;

public class ATest {

	public static void main(String[] args) {
		A obj = new A();
		
		//obj.a = 10;	//private 멤버 이기때문에 다른 클래스에서 접근할수없음 (같은 패키지더라도)
		obj.b = 20;	//default 멤버는 다른 클래스에서 사용가능 (같은 패키지일 경우)
		obj.c = 30;	//public 멤버는 다른 클래스에서 사용가능 (다른 패키지일 경우에도 가능)
		
		System.out.println("obj.b는 "+obj.b+"입니다.");
		System.out.println("obj.c는 "+obj.c+"입니다.");

	}

}
