import java.util.Scanner;

public class obrabotkaDannix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++){
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
