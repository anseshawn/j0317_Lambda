package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해 준다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface // 함수형인터페이스 어노테이션
interface MyFunc2 {
	int add(int x, int y);
}

// 1. 인터페이스를 만들어서
public class Test02 {
	public Test02(int x, int y) { // 2. 필요한 함수를 생성자 안에 다 넣어주고
		MyFunc2 myFunc2 = new MyFunc2() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc2.add(x, y);
		System.out.println("res : "+res);
	}
	
	public static void main(String[] args) {
		new Test02(20, 30); // 3. 메인에서 불러와서 쓰는것이 원칙
	}
	
}
