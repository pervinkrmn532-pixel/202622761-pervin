
void main() {
    byte test = 127;
    byte value = (byte)(test + 1);

    System.out.printf("%d + 1 = %d\n", test, value);

    System.out.printf("%d + 1 = %d\n", test, test + 1);
}
