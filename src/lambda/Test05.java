package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해 준다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface // 함수형인터페이스 어노테이션
interface MyFunc5 {
	int add(int x, int y);
}

public class Test05 {
	public static void main(String[] args) {
//		MyFunc5 myFunc5 = new MyFunc5() {			
//			@Override
//			public int add(int x, int y) { 
//				return 0;
//			}
//		};
		
		// 익명 이너클래스를 함수적 코딩(람다식) 으로 변경하기
		// MyFunc5 myFunc5 = () => {} // 자바스크립트의 arrow function
		MyFunc5 myFunc5 = (x, y) -> x + y; // 자바 arrow function (실행할 내용이 한줄이면 중괄호 생략하고 함수를 옆에 끌어옴)
		
		int res = myFunc5.add(40, 50);
		System.out.println("res : "+res);
	}
}
