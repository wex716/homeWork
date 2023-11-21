import java.util.Scanner;
public class posledovatelnsot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("сколько вы хотите ввести чисел: ");
        int nym = scanner.nextInt();

        System.out.print("введите x: ");
        int x = scanner.nextInt();

        int[] nums = new int[nym];
        int summa = 0;


        for (int i = 0; i < nums.length; i++) {
            System.out.println("введите число " + (i + 1));
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                summa += nums[i];
            }
        }
        System.out.println("сумма чисел больших x: " + summa);


        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                count += 1;
            }
        }

        System.out.println("количество четных чисел: " + count);


    }
}
