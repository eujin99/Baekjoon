import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();  // 테스트케이스 갯수 받기

        List<Integer> results = new ArrayList<>();  // 결과를 저장할 리스트

        for(int t = 0; t < tc; t++) {
            int anum = sc.nextInt();  // A 갯수
            int bnum = sc.nextInt();  // B 갯수

            List<Integer> a = new ArrayList<>();  // A 리스트
            List<Integer> b = new ArrayList<>();  // B 리스트

            for (int j = 0; j < anum; j++) {
                a.add(sc.nextInt()); // A의 원소 리스트에 추가
            }

            for (int k = 0; k < bnum; k++) {
                b.add(sc.nextInt()); // B의 원소 리스트에 추가
            }

            Collections.sort(a, Collections.reverseOrder());  // A 내림차순
            Collections.sort(b, Collections.reverseOrder());  // B 내림차순

            int result = 0;
            int indexA = 0;  // A 리스트의 인덱스
            for (int i = 0; i < bnum; i++) {  // B의 모든 원소에 대해 반복
                while (indexA < anum && a.get(indexA) > b.get(i)) {  // A가 B보다 크면
                    indexA++;  // 다음 A 원소로 이동
                }
                result += indexA;  // A의 현재 인덱스까지의 원소들이 B보다 큰 경우의 수
            }

            results.add(result); // 결과 리스트에 결과값 저장
        }

        // 모든 결과 출력
        for (int result : results) {
            System.out.println(result);
        }
    }
}
