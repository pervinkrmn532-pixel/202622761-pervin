void main() {
    Scanner keyboard = new Scanner(System.in);
    String[] name = new String[10];
    double[] weight = new double[10];
    double sum = 0;

    /*************** 입력 ***************/
    for (int i = 0; i < weight.length; i++) {
        System.out.printf("%d번째 학생 이름 : ", i + 1);
        name[i] = keyboard.next();
        do {
            System.out.print("몸무게 (30.0 ~ 120.0) : ");
            weight[i] = keyboard.nextDouble();
        } while (weight[i] < 30.0 || weight[i] > 120.0);
        sum += weight[i];
    }

    /*************** 처리 ***************/
    double avg = sum / weight.length;

    int count = 0;                       // 평균 이상자 수
    for (int i = 0; i < weight.length; i++) {
        if (weight[i] >= avg) count++;
    }
    double rate = (double) count / weight.length * 100;

    // 몸무게 내림차순 정렬 (이름도 같이 교환)
    for (int i = 0; i < weight.length - 1; i++) {
        for (int j = 0; j < weight.length - 1 - i; j++) {
            if (weight[j] < weight[j + 1]) {
                double tw = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = tw;

                String tn = name[j];
                name[j] = name[j + 1];
                name[j + 1] = tn;
            }
        }
    }

    /*************** 출력 ***************/
    System.out.printf("평균 몸무게 : %.1f Kg\n", avg);
    System.out.printf("평균 이상자의 비율 : %.1f %%\n", rate);
    System.out.println("--- 상위 2명 ---");
    for (int i = 0; i < 2; i++) {
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);
    }
    System.out.println("--- 하위 2명 ---");
    for (int i = weight.length - 2; i < weight.length; i++) {
        System.out.printf("%s : %.1f Kg\n", name[i], weight[i]);
    }
}