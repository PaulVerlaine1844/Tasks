public class SnakeArray {
    public static void main(String[] args) {
        int[][] snake = new int[12][10];
        int k = 1;
        for (int i = 11; i >= 0; i--) {
            if (i % 2 != 0) {
                for (int j = 9; j >= 0; j--) {
                    snake[i][j] = k;
                    k++;
                }
            } else {
                for (int m = 0; m <= 9; m++) {
                    snake[i][m] = k;
                    k++;
                }
            }
        }
        print(snake);
    }

    public static void print(int[][] a) {
        for (int[] p : a) {
            for (int c : p) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
