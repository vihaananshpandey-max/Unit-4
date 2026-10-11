public class Equations {
    public static void main(String[] args) {
        int x = 0;
        int solutions = 0;
        while (solutions < 2) {
            double y = (x - 3) * (x - 8) / (x - 6.0);
            if (x == 6) {
                x++;
                continue;
            }
            if (y == 2) {
                solutions++;
                System.out.println("         " + x);
            }
            x++;
        }
    }
}
