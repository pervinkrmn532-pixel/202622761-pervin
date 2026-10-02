//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a = Integer.MAX_VALUE;
    long b = a + 1;  // Integer overflow oluşur
    long c = a + 1L; // Taşma olmaz, c doğru değeri alır

    // 3 değişken için 3 adet %,d belirteci kullanıldı
    System.out.printf("a = %,d, b = %,d, c = %,d\n", a, b, c);
}