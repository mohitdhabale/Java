public class P1LS {
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime numbers between 1 and 100 are: ");
        for (i = 2; i <= 100; i++) {
            flag = 1;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
