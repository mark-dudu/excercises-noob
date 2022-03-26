package exercises.javase;

/**
 * @author mark
 * 在控制台打印输出指定内容
 */
class GraphPrint {
    public static void main(String[] args) {
        int scale = 7;
        multiplicationTable();//打印九九乘法表
        triangle1(scale);//打印直角三角形1
        triangle2(scale);//打印直角三角形2
        triangle3(scale);//打印正三角形
        triangle4(scale);//打印倒置的正三角形
        rhombus(scale);//打印一个实心菱形
        rhombus2(scale);//打印一个实心菱形
        hollowRhombus(scale);//打印一个空心的菱形

    }

    private static void rhombus2(int scale) {
        int size = 2 * scale - 1;
        int start = scale;
        int end = scale;
        boolean flag = false;
        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                if (i < start || i > end) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (end == size) flag = true;
            if (flag) {
                start++;
                end--;
            } else {
                start--;
                end++;
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void hollowRhombus(int scale) {
        //上半个三角形
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= scale - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //下半个三角形
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (scale - i) - 1; j++) {
                if (j == 1 || j == 2 * (scale - i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void rhombus(int scale) {
        //上半个三角形
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= scale - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //下半个三角形
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (scale - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle4(int scale) {
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (scale - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle3(int scale) {
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= scale - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle2(int scale) {
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= scale - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangle1(int scale) {
        for (int i = 1; i <= scale; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
