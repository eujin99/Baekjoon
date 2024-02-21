import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mushrooms = new int[10];
        int sum = 0;  //지금까지 모은 점수!
        
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            sum += mushrooms[i]; //계속 더하다가

            //100이상일 경우 먼저!!
            if (sum >= 100) {
                int diff1 = sum - 100;
                int diff2 = 100 - (sum - mushrooms[i]); //바로 이전까지 점수 빼기 ~
                
                if (diff1 <= diff2) {
                    System.out.println(sum);  
                } else {
                    System.out.println(sum - mushrooms[i]);  
                }
                return;  
            }
        }
        
        System.out.println(sum);
    }
}
