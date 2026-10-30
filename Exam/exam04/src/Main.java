import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;

        System.out.print("첫 번째 변 a : ");
        a = keyboard.nextInt();
        System.out.print("두 번째 변 b : ");
        b = keyboard.nextInt();
        System.out.print("세 번째 변 c : ");
        c = keyboard.nextInt();

        // 삼각형 성립 조건
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("삼각형이 성립합니다.");

            // 삼각형 종류
            String type;
            if (a == b && b == c) {
                type = "정 삼각형";
            } else if (a == b || b == c || a == c) {
                type = "이등변 삼각형";
            } else {
                type = "일반 삼각형";
            }

            // 직각 삼각형 (정 삼각형 제외)
            boolean right = (a * a + b * b == c * c)
                    || (a * a + c * c == b * b)
                    || (b * b + c * c == a * a);
            if (right && !(a == b && b == c)) {
                type = type + " (직각 삼각형)";
            }

            // 헤론의 공식
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("삼각형의 종류 : " + type);
            System.out.printf("삼각형의 면적 : %.2f ㎠\n", area);
        } else {
            System.out.println("삼각형 아님");
        }
    }
}