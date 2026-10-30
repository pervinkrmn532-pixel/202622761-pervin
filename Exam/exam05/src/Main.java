public class Main {
    public static void main(String[] args) {
        int cost = 1015000;          // 매입원가
        double profitRate = 0.3;     // 이익율 30%
        double taxRate = 0.1;        // 세율 10%

        double price = cost * (1 + profitRate);   // 정가 (매출액)
        double salesTax = price * taxRate;        // 매출 세액
        double purchaseTax = cost * taxRate;      // 매입 세액
        double payTax = salesTax - purchaseTax;   // 납부 세액

        System.out.println("**** 납부 세액 계산 ****");
        System.out.printf("\t\t 매입 원가 : %d 원\n", cost);
        System.out.printf("\t\t 정가 : %.0f 원\n", price);
        System.out.printf("\t\t 매출 세액 : %.0f 원\n", salesTax);
        System.out.printf("\t\t 매입 세액 : %.0f 원\n", purchaseTax);
        System.out.printf("\t\t 납부 세액 : %.0f 원\n", payTax);
    }
}