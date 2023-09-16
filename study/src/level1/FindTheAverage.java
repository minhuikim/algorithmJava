package level1;

import java.util.stream.IntStream;

public class FindTheAverage {
	
	public void FindTheAverage() {
		int[] arr = {1,2,3,4};
		System.out.println(solution3(arr));
	}
	
	public double solution(int[] arr) {
		int sum = IntStream.of(arr).sum();
		return (double) sum / arr.length;
	}

	// average 메소드 사용
	public double solution2(int[] arr) {
		return IntStream.of(arr).average().getAsDouble();
	}
	
	// 기본 문법
	public double solution3(int[] arr) {
		int answer = 0;
		for(int a : arr) {
			answer += a;
		}
		return (double) answer / arr.length;
	}
}
