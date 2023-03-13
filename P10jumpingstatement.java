public class P10jumpingstatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip the third iteration
            }
            System.out.println(i + " " + (6 - i));
        }
    }
}
