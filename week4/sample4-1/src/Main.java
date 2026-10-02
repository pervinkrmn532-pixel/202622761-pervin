//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a = 5;
    int b = 2;

    // Doğru ondalıklı sonuç (2.5) elde etmek için tür dönüşümü (casting) yapılır
    double c = (double) a / b;
    double d = (float) a / b;

    // 4 değişken için 4 adet belirteç eklendi ve %.2f formatı düzeltildi
    System.out.printf("a = %d, b = %d, c = %.2f, d = %.2f\n", a, b, c, d);
}