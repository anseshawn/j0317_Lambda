package lambda;

// 람다식을 이용하여 제곱값을 구하시오

@FunctionalInterface
interface MyFunc6 {
	int calc(int x); // 내용없이 선언부만 (인터페이스)
}

public class Test06_1 {
	public static void main(String[] args) {
		MyFunc6 myFunc6 = new MyFunc6() {
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		System.out.println("5의 거듭제곱 : "+ myFunc6.calc(5));
	}
}
