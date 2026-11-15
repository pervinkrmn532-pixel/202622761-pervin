void main() {
    Scanner keyboard = new Scanner(System.in);
    double[] score = new double[7];     // 7명의 채점관 점수
    double sum = 0;

    /*************** 입력 ***************/
    for (int i = 0; i < score.length; i++) {
        do {
            System.out.printf("%d번 채점관 점수 입력 (60.0 ~ 100.0) : ", i + 1);
            score[i] = keyboard.nextDouble();
        } while (score[i] < 60.0 || score[i] > 100.0);
        sum += score[i];
    }

    /*************** 처리 ***************/
    double max = score[0];
    double min = score[0];
    for (int i = 1; i < score.length; i++) {
        if (score[i] > max) max = score[i];
        if (score[i] < min) min = score[i];
    }
    double result = (sum - max - min) / 5;   // 최고, 최소 제외 5명 평균

    /*************** 출력 ***************/
    System.out.printf("최고 점수 : %.1f, 최소 점수 : %.1f\n", max, min);
    System.out.printf("홍길동 선수의 최종 점수 : %.2f\n", result);
}