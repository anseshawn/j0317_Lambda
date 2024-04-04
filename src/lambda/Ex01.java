package lambda;

// 람다식을 이용하여 입력받은 수들 중에서 최댓값/최솟값을 구하시오.
@FunctionalInterface
interface ExFunc01 {
	int[] calc(int[] su);
}

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. 메소드를 선언하고
		ExFunc01 exFunc01 = (su) -> {
			int max = su[0], min = su[0];
			for(int i=1; i<su.length; i++) {
				if(su[i] > max) max = su[i];
				else if(su[i] < min) min = su[i];
			}
			int[] res = {max,min};
			return res; // 값을 하나만 넘길 수 있음
		};
		
		// 처리 루틴..
		int[] su = {10,5,15,2,8,20,7,16,9,13}; // 2. 이부분에서 처리
		int[] res = exFunc01.calc(su);
		
		System.out.println("최댓값 : "+res[0]);
		System.out.println("최솟값 : "+res[1]);
		
	}
}
