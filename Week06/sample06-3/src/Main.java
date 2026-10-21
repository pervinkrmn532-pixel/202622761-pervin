//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
      final int radius =  6400;
      final float PI = 3.141592f;
      final int KOREA = 100505;

      double surface = 4 *PI * radius * radius;

      double ratio = KOREA / surface;

    System.out.printf("지구의 반지름 %,d Km, 표면적 %,.2f km²\n", radius, surface);
    System.out.printf("대한민국 면적 %,d km² 은 %f %% 입니다.\n", KOREA, ratio);

}
