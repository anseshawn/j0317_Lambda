package lambda;

// 람다식을 이용하여 제곱값을 구하시오

@FunctionalInterface
interface MyFunc6_2 {
	int calc(int x); // 내용없이 선언부만 (인터페이스)
}

// 원넓이를 람다식으로 구하시오
@FunctionalInterface
interface MyFunc6_2_2 {
	int calc(int r);
}
@FunctionalInterface
interface MyFunc6_2_3 {
	double calc(int r);
}

public class Test06_2 {
	public static void main(String[] args) {
//		MyFunc6_2 myFunc6_2 = new MyFunc6_2() {
//			@Override
//			public int calc(int x) {
//				return x * x;
//			}
//		};
		
		MyFunc6_2 myFunc6_2 = (x) -> x * x;
		System.out.println("5의 거듭제곱 : "+ myFunc6_2.calc(5));
		
		// 원 넓이
		MyFunc6_2_2 myFunc6_2_2 = (r) -> (int)(3.14 * r * r);
		System.out.println("반지름 5인 원넓이 : "+myFunc6_2_2.calc(5));
		System.out.println("반지름 10인 원넓이 : "+myFunc6_2_2.calc(10));
		
		MyFunc6_2_3 myFunc6_2_3 = (r) -> Math.PI * r * r;
		System.out.println("반지름 5인 원넓이 : "+myFunc6_2_3.calc(5));
		System.out.println("반지름 10인 원넓이 : "+myFunc6_2_3.calc(10));
	}
}
