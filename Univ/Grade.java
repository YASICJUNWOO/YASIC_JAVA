import java.util.Scanner;

public class Grade {
	double ms,sc,en;
	
	Grade(double ms, double sc,double en) {
		this.ms=ms;
		this.sc=sc;
		this.en=en;
	}
	
	public double average() {
		return (ms+sc+en)/3.0;
	}
	
	
	public static void main(String args[]) {
		double math,science,english;
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		math = scanner.nextDouble();
		science = scanner.nextDouble();
		english = scanner.nextDouble();
		
		scanner.close();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 "+ me.average());
		
		
		
		
	}
}

