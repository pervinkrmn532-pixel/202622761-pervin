import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, fee;

        System.out.println("**** 체육관 입장료 계산 ****");
        System.out.print("\t\t 나이 : ");
        age = keyboard.nextInt();

        fee = (age >= 18) ? 4000
                : (age >= 13) ? 3000
                : (age >= 7) ? 1000 : 0;

        String note = (fee == 0) ? " (무료)" : "";

        System.out.printf("\t\t 입장료 : %d 원%s\n", fee, note);
    }
}