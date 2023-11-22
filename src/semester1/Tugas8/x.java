package semester1.Tugas8;

public class x {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size * 2; i++) {
            if (i <= size) {
                for (int j = 1; j <= size * 2; j++) {
                    if (j < i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j <= size) {
                        System.out.print("    ");
                    } else if (j == size + 1) {
                        System.out.print(" *");
                    }
                }
            } else if (i > size) {
                for (int j = size * 2; j >= 1; j--) {
                    if (j > i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j > size) {
                        System.out.print("    ");
                    } else if (j == size - 1) {
                        System.out.print(" *");
                    }
                }
            }
            System.out.println();
        }
    }
}
