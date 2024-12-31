package Operators;

public class ConditionalTest {
	
	public static void main(String[] args) {
		//삼항연산자 : 항이 세개, 조건?ture일 때 값: false일때 값; (조건-관계연산자)
		System.out.println(true?10:5);
		System.out.println(false?10:5);
		
		int num=101;
		System.out.println(num%2==1?"홀수":"짝수"); 
		//num을 2로 나눠 나머지 결과값이 1과 같으면 "홀수", 아니면 "짝수" 
		
		String str = num%2==0?"짝수":"홀수"; //String 문자열 변수
		//String str = num%2==0?"짝수":10; 문법상 맞지만 사용하지 말것
		System.out.println(str);
		
	}

}
