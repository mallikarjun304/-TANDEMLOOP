package ten_k_coders;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a= ");
        int a = sc.nextInt(); 
        int result = 0;
        int count = 0;

        for (int i = 1; count < a; i++) {
            if (i % 2 == 1) {
                result = i;
                count++;
                if (count < a) {
                    System.out.print(result + ", ");
                } else {
                    System.out.print(result);
                }
            }
        }
    }
}
