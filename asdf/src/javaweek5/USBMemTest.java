package javaweek5;

public class USBMemTest {
	public static void main(String[] args) {
	USBMem U1, U2;
	U1 = new USBMem(8, "빨강색");
	U2 = new USBMem(32, "파랑색");
	
	U1.Memwrite();
	U1.MemRead();
	U2.Memwrite();
	U2.MemRead();
	}
}
