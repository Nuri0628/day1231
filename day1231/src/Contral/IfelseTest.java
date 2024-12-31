package Contral;

import java.util.Scanner;

public class IfelseTest {
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요.");
		System.out.println("입력 > ");
		Scanner scanner = new Scanner(System.in); //클래스 = 생성자();
		int num = scanner.nextInt(); //입력한 값을 숫자로 해석하는 것
		scanner.close();
		
		//if문이 false일 때 실행 if~else
		//홀수인지 짝수인지 판별하는 로직 작성
		if(num%2 == 1) { //num을 2로 나눈 나머지가 1과 같은가? = num값이 홀수인가?
			//조건식의 결과가 ture일 때 실행하는 구간
			System.out.println(num+" 은 홀수 입니다.");
		}else {
			//조건식의 결과가 false일 때 실행하는 구간
			System.out.println(num+" 은 짝수 입니다.");
		}
		
	}

}
