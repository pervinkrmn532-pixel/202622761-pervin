//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("Name of person ? ");
    name = keyboard.nextLine();
    System.out.printf("%s person age ?", name);
    age = keyboard.nextInt();
    System.out.printf("%s person height (175) ? ", name);
    height = keyboard.nextDouble();
    System.out.printf("%s person weight (60) ?", name);
    weight = keyboard.nextFloat();

    System.out.printf("%s person age %d age.\n", name, age);
    System.out.printf("%s person height %.1f cm.\n", name, height);
    System.out.printf("%s person weight %.1f kg.\n", name, weight);

}