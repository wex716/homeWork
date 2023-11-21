import java.util.Scanner;

public class summAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int sum = 0;

        for (int i = numA; i <= numB; i++){
            sum += numA;
            numA++;

        }
        System.out.println(sum);


    }
}
