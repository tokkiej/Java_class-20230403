package exer;

import java.util.Scanner;

public class WonClaculator {
	
	final double EX_RATE = 1309.5; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이는 얼마입니다?");
		Scanner scanner = new Scanner(System.in);
		
		int student_age = scanner.nextInt();
		
		if(student_age >=20) {
			System.out.println("당신은 성인이시군요!");
		} else {
			System.out.println("당신은 미성년이시군요!");
		}
		System.out.println("당신의 나이는 " + student_age+"살입니다.");
		
		scanner.close();//스캐너 객체 닫기

	}

}


