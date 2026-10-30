import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int spend, saving, food;
        double engel;
        String grade;

        System.out.println("**** 엥겔 지수 계산 ****");
        System.out.print("\t\t 지출액 : ");
        spend = keyboard.nextInt();
        System.out.print("\t\t 저축액 : ");
        saving = keyboard.nextInt();

        food = spend - saving;
        engel = (double) food / spend * 100;

        if (engel <= 30) {
            grade = "상류층";
        } else if (engel <= 50) {
            grade = "중산층";
        } else {
            grade = "하류층";
        }

        System.out.printf("\t\t 식 생활비 : %d 원\n", food);
        System.out.printf("\t\t 엥겔 지수 : %.2f\n", engel);
        System.out.println("\t\t 판정 : " + grade);
    }
}