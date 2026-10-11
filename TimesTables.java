public class TimesTables {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
                if (0 < i * j && i * j < 10) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
