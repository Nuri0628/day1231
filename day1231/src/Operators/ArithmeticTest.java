package Operators;

public class ArithmeticTest {
	
	public static void main(String[] args) {
		//산술연산자 (+,-,*,/,%,++(1증가),--(1감소)) ++ -- 단항연산자 나머지 이항연산자
		int num1=10, num2=20;
		
		System.out.println(num1+num2); //30
		System.out.println(num1-num2); //-10
		System.out.println(num1*num2); //200
		System.out.println(num1/num2); //0.5(x)=>0
		// !!!정수/정수는 결과는 정수로만 나옴. 소수점 아래는 표현 안 됨!!!!
		System.out.println((double)num1/num2); //0.5 항이 한개인 단항 연산자 (실수형 double)
		System.out.println(num1/(double)num2); //0.5		
		System.out.println((double)(num1/num2)); //0.0
		System.out.println(num1/num2*1.0); //0.0 왼쪽부터 오른쪽으로 계산
		System.out.println(1.0*num1/num2); //0.5
		System.out.println(num1%num2); //10%20 나누고 난 후에 나머지를 결과로 제공
		System.out.println(1001%2);
		System.out.println(2000000000%2);
		//++,-- :단항연산자 상수X 변수에 사용
		//++ 1증가 연산자
		System.out.println(++num1); //11 :출력전에 변화(증가)
		System.out.println(num1++); //11 :출력후에 변화(증가)
		System.out.println(num1); //12
		
		int a=10;
		System.out.println(++a + 10); //21
		System.out.println("a="+a);
		a=10;
		System.out.println(a++ + 10); 
		System.out.println("a="+a);
		
		//-- 1감소 연산자
		System.out.println(num2--); //출력이후에 감소한다
		System.out.println("num2="+num2); //19
		System.out.println(--num2); //현재값을 1감소 시킨 후 결과가 출력됨
		System.out.println("num2="+num2); //18
		num2--;
		System.out.println("num2="+num2); //17
		--num2;
		System.out.println("num2="+num2); //16
	}

}
