package test;

import java.math.BigInteger;

public class Problem04 {
    /*
    문제의 예시처럼 factorial(1_000_000)을 실행하면 대략 1_000_000번의 함수 호출이 재귀적으로 이루어져
    스택 메모리를 초과 하게 됩니다. 따라서 재귀 방식이 아닌 반복문을 통해 factorial을 구현하면 본 문제를 피할 수 있습니다.
    그리고 factorial(1_000_000)은 long 으로도 절대 표현할 수 없는 큰 숫자이기에 java 에선 BicInteger 클래스를 이용해서
    계산하는 방법도 있습니다. 아래는 예시 코드 입니다.
     */

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
