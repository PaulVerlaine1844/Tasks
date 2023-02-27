public class CompositeNumbers {

    public static void main(String[] args) {
        int k = 11;
        for (int i = 2; i <= k; i++) {
            for (int j = 2; j < (i / 2) + 1; j++) {
                if (i % j == 0) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
