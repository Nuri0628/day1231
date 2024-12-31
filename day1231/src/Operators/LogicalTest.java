package Operators;

public class LogicalTest {
	public static void main(String[] args) {
		//논리연산자(&&, ||,!) : 비트연산자와 구분
		
		//&& logical and Operator 논리곱
		//true true 경우 : true, 나머지 false
		//(true,true) = true
		//(true,false) = false
		//(false,true) = false
		//(false,false) = false
		int a=60,b=13,c=10;
		System.out.println(true && true);
		//최단산쉬, 관비리삼대
		System.out.println(a>c && b>c); //연산순서 : 1관계연산자 2논리연산자
		//논리연산자 기준으로 왼쪽항이 true면 왼쪽항은 계산 안 함
		System.out.println(a>c && b<=c);
		System.out.println(a<c && b>c);
		System.out.println(a>c && b<c);
		System.out.println("---");
		
		//|| Logical OR Operator
		//둘다 false인 경우 false, 나머지 true
		//둘 중 하나라도 true이면 true 아니면 false 
		System.out.println(false || false);
		//최단산쉬, 관비리삼대
		System.out.println(a>c || b>c); //true
		System.out.println(a>c || b<=c); //true
		System.out.println(a<c || b>c); //true
		System.out.println(a>c || b<c); //false
		
		System.out.println("---");
		System.out.println(a>c || b>c && c==10); //true
		//true||true&&true
		System.out.println(a>c || b<c && c==10); //false
		//false||false&&true // &&가 || 보다 우선순위가 높다
		
		System.out.println("---");
		//! Logical NOT Operator 논리 반전 연산자
		System.out.println(!!true); //!! 중 두번쨰 연산자부터 연산시작
		
		boolean flag=false;
		System.out.println(!flag);
		System.out.println(!(a<c));
	}

}
