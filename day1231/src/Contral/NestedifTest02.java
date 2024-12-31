package Contral;

import java.util.Scanner;

public class NestedifTest02 {
	
	public static void main(String[] args) {
		System.out.println("점수를 입력해 주세요.(0~100)");
		System.out.println("입력 > ");
		Scanner scanner = new Scanner(System.in); //클래스 = 생성자();
		int num = scanner.nextInt(); //입력한 값을 숫자로 해석하는 것
		scanner.close();
		
		
		//num 점수가 저장
		//90점 이상은 A
		//80점 이상 90점 미만 B
		//70점 이상 80점 미만 C
		//60점 이상 70점 미만 D
		//60점 보다 작으면 F
		if(num>=90) {
			System.out.println('A');
		}else { //90미만 
			if(num>=80) {
				System.out.println('B');
			}else{ //80점 미만이면
				if(num>=70) {
					System.out.println('C');
				}else{ //70점 미만이면
					if(num>=60) {
					System.out.println('D');
					}else{ //나머지 점수
						System.out.println('F');
			
					}
				}

			}
		}
	}
}
