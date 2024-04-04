package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해 준다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface // 함수형인터페이스 어노테이션
interface MyFunc4 {
	int add(int x, int y);
}

public class Test04 {
	public static void main(String[] args) {
		MyFunc4 myFunc4 = new MyFunc4() { //익명이너클래스
			
			@Override
			public int add(int x, int y) { // 구현하는 내용을 내가 만들기
				return x + y;
			}
		};
		
		int res = myFunc4.add(40, 50);
		System.out.println("res : "+res);
	}
}
