package Operators;

public class RelationalTest {
	public static void main(String[] args) {
		//관계연산자 결과로 논리값 (true or false) 
		int num1=10 ,num2=20;
		System.out.println(num1 == num2); //숫자를 비교할 때 사용, 문자에 할때는 다른 값이 나올 수도 있음
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("---");
		//not equals :!= 특수문자 순서주의!!!
		System.out.println(num1 != num2); //true
		//System.out.println(num1 =! num2); //순서가 바뀌면 문법 에러
		System.out.println("---");
		
		//A > B :(A greater than B) A가 B보다 큰지 비교
		System.out.println("num1 > num2 : "+(num1 > num2));
		//A < B :(A less than B) A가 B보다 작은지 비교
		System.out.println("num1 < num2 : "+(num1 < num2));
		
		System.out.println("---");
		//특수문자 순서주의!!! >= <=
		//A >= B :(A greater than or equal to B) A가 B보다 큰거나 같은지 비교
		System.out.println("num1 >= num2 : "+(num1 >= num2));
		//A <= B :(A less than or equal to B) A가 B보다 작거나 같은지 비교
		System.out.println("num1 <= num2 : "+(num1 <= num2));
		
		boolean result=num1 <num2;
		System.out.println(result);
		
		
	}

}
