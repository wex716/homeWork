import java.util.Scanner;

public class ocenkiFizika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество учеников: ");
        int students = scanner.nextInt();
        int[] marks = new int[students];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Введите оценку ученика " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            while (marks[i] < 2 || marks[i] > 5) {
                System.out.println("Такой оценки не существует!");
                System.out.print("Введите оценку ученика " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

            }
        }

        int marks5 = 0;
        int marks4 = 0;
        int marks3 = 0;
        int marks2 = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 5) {
                marks5 += 1;
            } else if (marks[i] == 4) {
                marks4 += 1;
            } else if (marks[i] == 3) {
                marks3 += 1;
            } else if (marks[i] == 2) {
                marks2 += 1;
            }

        }
        System.out.println("Пятерок: " + marks5);
        System.out.println("Четверок: " + marks4);
        System.out.println("Троек: " + marks3);
        System.out.println("Двоек: " + marks2);



    }
}
