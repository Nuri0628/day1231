package Contral;

import java.util.Scanner;

public class NestedifTest {
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요.");
		System.out.println("입력 > ");
		Scanner scanner = new Scanner(System.in); //클래스 = 생성자();
		int num = scanner.nextInt(); //입력한 값을 숫자로 해석하는 것
		scanner.close();
		
		//중첩if
		if(num>=0) {
			System.out.println("음수가 아닙니다.");
			if(num==0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("양수 입니다.");
				
			}
		}else {
			System.out.println("음수 입니다.");
		}
	}

}
