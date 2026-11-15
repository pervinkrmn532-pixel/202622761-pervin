void main() {
    Scanner keyboard = new Scanner(System.in);
    int[] isbn = new int[13];            // 12자리 + 체크 기호

    /*************** 입력 ***************/
    System.out.print("ISBN 앞 12자리 입력 (하이픈 없이) : ");
    String input = keyboard.next();

    if (input.length() != 12) {
        System.err.println("ERROR : 12자리 숫자를 입력하세요");
        return;
    }
    for (int i = 0; i < 12; i++) {
        isbn[i] = input.charAt(i) - '0';
    }

    /*************** 처리 ***************/
    int sum = 0;
    for (int i = 0; i < 12; i++) {
        if (i % 2 == 0)
            sum += isbn[i] * 1;          // 가중치 1
        else
            sum += isbn[i] * 3;          // 가중치 3
    }

    int rest = sum % 10;
    int check = (rest == 0) ? 0 : 10 - rest;
    isbn[12] = check;

    /*************** 출력 ***************/
    System.out.println("가중치의 합 : " + sum);
    System.out.println("체크 기호 : " + check);
    System.out.println("유효성 확인 : " + (sum + check) + " % 10 = " + (sum + check) % 10);
    System.out.print("완성된 ISBN : ");
    for (int i = 0; i < 13; i++) {
        System.out.print(isbn[i]);
    }
    System.out.println();
}