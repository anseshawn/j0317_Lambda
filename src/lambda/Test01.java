package lambda;

// 람다식을 구현하기 위해서는 '함수형(적) 인터페이스'를 생성해 준다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.

@FunctionalInterface // 함수형인터페이스 어노테이션
interface MyFunc1 {
	int add(int x, int y);
}

public class Test01 {

}
