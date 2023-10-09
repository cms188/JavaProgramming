import java.util.Scanner;

public class asdf
{
	private int weight;
	private int reps;
	private int set;

	

	public void setWeight() {
		Scanner s = new Scanner(System.in);
		System.out.println("운동 수행 중량을 입력하세요 : ");
		int weight = s.nextInt();
	}
	public void setReps() {
		Scanner s = new Scanner(System.in);
		System.out.println("운동 수행 횟수를 입력하세요 : ");
		int reps = s.nextInt();
	}
	public void setSet() {
		Scanner s = new Scanner(System.in);
		System.out.println("운동 수행 세트를 입력하세요 : ");
		int set = s.nextInt();
	}
	
	public int getWeight()
	{
		return weight;
	}
	public int getReps()
	{
		return reps;
	}
	public int getSet()
	{
		return set;
	}
}
