package Contral;

public class IfTest02 {
	
	public static void main(String[] args) {
		if(true) {
			System.out.println("무조건 실행합니다.");
			System.out.println("여러줄을 사용해도 돼요.");
		}
		boolean result=false;
		if(result) {
			System.out.println("절대로 실행되지 않아요.");
		
		//{} 안의 내용이 한줄인 경우 {} 생략해도 됨
		int num=9;
		if(10%2==0)
			System.out.println("짝수");
		else 
			System.out.println("홀수");
			
		}
	}
}