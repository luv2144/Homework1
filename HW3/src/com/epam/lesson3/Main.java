package com.epam.lesson3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Figure 1");
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print("*");
                j++;
                if (j > i) {
                    break;
                }
            }
            i++;
            System.out.println();
        }
        int ib = 9;
        while (ib >= 1) {
            int jb = ib;
            while (jb <= ib) {
                System.out.print("*");
                jb--;
                if (jb <= 0) {
                    break;
                }
            }
            ib--;
            System.out.println();
        }

        System.out.println("Figure 2");
        int i2 = 0;
        while (i2 <= 10) {
            int j = 1;
            while (j <= 10) {
                if (i2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
                if (j > i2) {
                    break;
                }
            }
            int z = 0;
            while (z <= 9) {
                if (z + j <= 10) {
                    System.out.print("*");
                }
                z++;
            }
            i2++;
            System.out.println();
        }

        System.out.println("Figure 3");
        int ib3 = 9;
        while (ib3 >= 1) {
            int jb = ib3;
            while (jb <= ib3) {
                System.out.print(" ");
                jb--;
                if (jb <= 0) {
                    break;
                }
            }
            int stars = 0;
            while (stars <= 9 - ib3) {
                System.out.print("*");
                stars++;
            }
            ib3--;
            System.out.println();
        }

        System.out.println("Figure 4");
        int i4 = 9;
        while (i4 >= 1) {
            int jb = i4;
            while (jb <= i4) {
                System.out.print(" ");
                jb--;
                if (jb <= 0) {
                    break;
                }
            }
            int stars = 0;
            while (stars <= 9 - i4) {
                System.out.print("*");
                stars++;
            }
            i4--;
            System.out.println();
        }
        int i4b = 0;
        while (i4b <= 10) {
            int j = 1;
            while (j <= 10) {
                if (i4b == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
                if (j > i4b) {
                    break;
                }
            }
            int z = 0;
            while (z <= 9) {
                if (z + j <= 10) {
                    System.out.print("*");
                }
                z++;
            }
            i4b++;
            System.out.println();
        }

        System.out.println("Figure 5");
        int i5left = 9;
        int i5right = 1;
        while (i5left >= 1) {
            int jb = i5left;
            while (jb <= i5left) {
                System.out.print(" ");
                jb--;
                if (jb <= 0) {
                    break;
                }
            }
            int stars = 0;
            while (stars <= 9 - i5left) {
                System.out.print("**");
                stars++;
            }

            i5left--;
            System.out.println();
        }
        int ib5left = 9;
        while (ib5left >= 1) {
            int jb = ib5left;
            while (jb <= ib5left) {
                System.out.print(" ");
                jb--;
                if (jb <= 0) {
                    break;
                }
            }
            int stars = 0;
            while (stars <= 9 - ib5left) {
                System.out.print("**");
                stars++;
            }
            ib5left--;
            System.out.println();
        }
    }
}
