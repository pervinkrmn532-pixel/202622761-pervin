//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double a = 1500.35;
    double b = 890.76;

    int sum = (int) (a + b);
    double tax = sum * (10.0 / 100);
    int result = (int) (sum - tax);

    System.out.printf("이지1 = %.2f 원\n", a);
    System.out.printf("이지2 = %.2f 원\n", b);
    System.out.printf("합계 : %,d 원\n", sum);
    System.out.printf("세금 : %,.2f 원\n", tax);
    System.out.printf("실제 : %,d 원\n", result);
}
