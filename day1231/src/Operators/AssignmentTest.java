package Operators;

public class AssignmentTest {
	
	public static void main(String[] args) {
		//대입연산자
		int num = 10;
		System.out.println(num);
		
		int a=num=100; //연산자 우선순위 오른쪽부터 (num=100)
		System.out.println(num);
		System.out.println(a);
		
		//복합 대입연산자 - 이항 연산다에 대해 사용
		a = a + 5;
		System.out.println("a => "+ a);
		//모든 프로그램이 싫어하는 것? 중복, 효율적으로 코딩
		a+=5; //증가 연산자 :a에 5를 더한 값을 다시 a에 대입, a=a=+5와 동일
		System.out.println("a => "+ a);
		a-=5; //a에 5를 뺀 값을 다시 a에 대입, a=a=+5와 동일
		System.out.println("a => "+ a);
		//a=a+1 a+=1, a=a-1 a-=1
		
	}

}
