import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 로프의 개수
        int[] ropes = new int[n]; // 각 로프의 최대 중량을 저장할 배열

        // 각 로프의 최대 중량 입력 받기
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        // 로프를 내림차순으로 정렬하여 최소 중량이 가장 큰 로프부터 확인
        Arrays.sort(ropes);
        int maxWeight = 0;

        // 모든 로프를 사용하지 않아도 되므로, 각 로프의 최대 중량을 고려하여 최대 중량을 구함
        for (int i = 0; i < n; i++) {
            int weight = ropes[i] * (n - i); // 현재 로프를 포함한 뒤의 모든 로프가 들 수 있는 중량 계산
            maxWeight = Math.max(maxWeight, weight);
        }

        System.out.println(maxWeight);
    }
}
