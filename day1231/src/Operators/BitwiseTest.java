package Operators;

public class BitwiseTest {
	
	public static void main (String[] args) {
		//비트연산자 : 2진수 연산자
		byte a=60; //0011 1100 : 32+16+8+4 == 60
		byte b=13; //0000 1101 : 8+4+1 == 13
		//& Binary AND Operator (그리고)
		//두개가 모두 참(true,1)일 때 : (1,1) == 1 제외 나머지 0 
		//(1,0) == 0
		//(0,1) == 0
		//(0,0) == 0
		
		byte result= (byte)(a & b); //0000 1100 == 12
		System.out.println(result);
		
		//| Binary OR Operator ()
				//두개가 모두 거짓(false,0) (0,0) == 0 제외 나머지 1 
				//(1,1) == 1
				//(0,1) == 1
				//(1,0) == 1
				
		result= (byte)(a | b); //0011 1101 == 61
		System.out.println(result);
		
		//^ Binary XOR Operator ()
		//두개가 같으면 0 다르면 1 
		result= (byte)(a ^ b); //0011 0001 32+16+1 == 49
		System.out.println(result);
		
		
		//~ : 부정형 Binary Ones Complement Operator
		// 비트 단위로 부정 (0->1, 1->0)
		System.out.println( ~a ); //1100 0011 128+64+2+1 == -61
		
		//<< : 왼쪽으로 이동 Binary Left Shift Complement Operator
		//빈칸은 숫자 부호가 ++면 0으로, --면 1로 채운다
		//    0011 1100 == 60
		// 00[1111 0000]== -16
		System.out.println((byte)(a<<2)); //-16
		System.out.println(a<<2); //240 == 60*4(2*2)
		
		//>> : 오른쪽으로 이동 Binary Right Shift Complement Operator
		//    0011 1100 == 60
		// 00[1111 0000]== 240
		System.out.println((byte)(a>>2)); //0000 1111 == 15 == 60/4
		//System.out.println(a>>7); //0
		a=-60;
		System.out.println((byte)(a>>2)); //1111 0001 == -15 == 60/4
		
		//>>> : 오른쪽으로 이동하고 빈칸은 무조건 0으로 채움 Shift right zero fill Operator
		//부호는 유지한 채로 값은 0으로 채움
		a=60;
		System.out.println((byte)(a>>>2)); //15
		a=-60;
		System.out.println((byte)(a>>>2)); //-15
	}

}
