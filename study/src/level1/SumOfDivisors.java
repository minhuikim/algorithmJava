package level1;

public class SumOfDivisors {
	
	public void SumOfDivisors() {
		System.out.println(solution(12));
	}
	
	public int solution(int n) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
	
	// 실행속도 절반
	public int solution2(int n) {
		int answer = 0;
		
		for(int i=1; i<=n/2; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		
		return answer + n;
	}

}
