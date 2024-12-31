package Contral;

import java.util.Scanner;

//제어문
public class IfTest {
	//조건문 if, switch~case
	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요.");
		System.out.println("입력 > ");
		//if(조건식) {}
		int num;
		//Class 이름 : Scanner - 데이터타입
		Scanner scanner = new Scanner(System.in); //클래스 = 생성자();
		//import 단축키: Ctrl+shift+O
		num = scanner.nextInt(); //입력한 값을 숫자로 해석하는 것
		scanner.close();
		
		
		if(num < 0){
			//조건의 결과 true일 때만 실행, false일 때는 실행하지 않음
			System.out.println("음수입니다.");
		}
		System.out.println("프로그램 종료");
	}

}
