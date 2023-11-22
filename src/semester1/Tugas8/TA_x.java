package semester1.Tugas8;

import java.util.Scanner;

public class TA_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran : ");
        int size = input.nextInt();
        input.close();

        System.out.println("\n");
        
        //Looping FOR
        System.out.println("X Pake FOR");
        xPakeFor(size);
        System.out.println("\n");
        
        //Looping WHILE
        System.out.println("X Pake WHILE");
        xPakeWhile(size);
        System.out.println("\n");
        
        //Looping DO WHILE
        System.out.println("X Pake DO WHILE");
        xPakeDoWhile(size);
        System.out.println("\n");
    } 

    static void xPakeDoWhile(int size) {
        int i = 1;
        int j = 1;

        do {
            if (i <= size) {
                j = 1;
                do {
                    if (j < i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j <= size) {
                        System.out.print("    ");
                    } else if (j == size + 1) {
                        System.out.print(" *");
                    }
                    j++;
                } while (j <= size * 2);
            } else if (i > size) {
                j = size * 2;
                do {
                    if (j > i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j > size) {
                        System.out.print("    ");
                    } else if (j == size - 1) {
                        System.out.print(" *");
                    }
                    j--;
                } while (j >= 1);
            }
            System.out.println();
            i++;
        } while (i <= size * 2);
    }

    static void xPakeWhile(int size) {
        int i = 1;
        int j = 1;

        while (i <= size * 2) {
            if (i <= size) {
                j = 1;
                while (j <= size * 2) {
                    if (j < i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j <= size) {
                        System.out.print("    ");
                    } else if (j == size + 1) {
                        System.out.print(" *");
                    }
                    j++;
                }
            } else if (i > size) {
                j = size * 2;
                while (j >= 1) {
                    if (j > i) {
                        System.out.print("  ");
                    } else if (j == i) {
                        System.out.print(" *");
                    } else if (j > size) {
                        System.out.print("    ");
                    } else if (j == size - 1) {
                        System.out.print(" *");
                    }
                    j--;
                }
            }
            System.out.println();
            i++;
        }
    }

    static void xPakeFor(int size) {
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
