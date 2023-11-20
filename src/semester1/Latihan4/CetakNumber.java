package semester1.Latihan4;

class CetakNumber {
    public static void main(String[] args) {
        loro();
    }

    static void siji() {
        for (int i = 1; i <= 1; i++) {
            for(int j = 1; j <= 4; j++) System.out.print("  ");
            for(int j = 1; j <= 2; j++) System.out.print(" *");
            System.out.println();
        }
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++) System.out.print("  ");
            for(int j = 1; j <= 3; j++) System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 4; j++) System.out.print("  ");
            for(int j = 1; j <= 2; j++) System.out.print(" *");
            System.out.println();
        }
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++) System.out.print("  ");
            for(int j = 1; j <= 4; j++) System.out.print(" *");
            System.out.println();
        }
    }

    static void loro() {
        for(int i = 1; i <= 1; i++) {
            for(int j = 1; j <= 3; j++) System.out.print("  ");
            for(int j = 1; j <= 4; j++) System.out.print(" *");
            System.out.println();
        }
    }
}

/*
 = = = = = = = = = = =
 =       * * * *
 =     * * * * * *
 =   * * *     * * *
 =   * *         * *
 =             * * *
 =           * * *
 =         * * *
 =       * * *
 =   * * * * * * * *
 =   * * * * * * * *
 = = = = = = = = = = =
 */