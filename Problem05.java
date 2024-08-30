package test;

import java.util.Arrays;

public class Problem05 {
    public static void main(String[] args) {
        int[][] pond = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        System.out.println(calPondDepth(pond));

// ---------------------바뀐배열 출력 코드--------------------
//        System.out.println();
//        int[][] bb = calPondDepth2(pond);
//        for (int i = 0; i < bb.length; i++) {
//            for (int j = 0; j < bb[i].length; j++) {
//                System.out.print(bb[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static int calPondDepth(int[][] pond) {
        int w = pond[0].length;
        int h = pond.length;

        while (true) {
            boolean found = false;
            boolean[][] increment = new boolean[h][w];
            for (int i = 1; i < h - 1; i++) {
                for (int j = 1; j < w - 1; j++) {
                    int value = pond[i][j];
                    if (value > 0) {
                        if (value == pond[i - 1][j] && value == pond[i + 1][j] && value == pond[i][j + 1] && value == pond[i][j - 1]) {
                            increment[i][j] = true;
                            found = true;
                        }
                    }
                }
            }
            if (!found)
                break;
            for (int i = 1; i < h - 1; i++) {
                for (int j = 1; j < w - 1; j++) {
                    if (increment[i][j])
                        pond[i][j]++;
                }
            }
        }

        return Arrays.stream(pond).flatMapToInt(Arrays::stream).sum();

    }

    public static int[][] calPondDepth2(int[][] pond) {
        int w = pond[0].length;
        int h = pond.length;

        while (true) {
            boolean found = false;
            boolean[][] increment = new boolean[h][w];
            for (int i = 1; i < h - 1; i++) {
                for (int j = 1; j < w - 1; j++) {
                    int value = pond[i][j];
                    if (value > 0) {
                        if (value == pond[i - 1][j] && value == pond[i + 1][j] && value == pond[i][j + 1] && value == pond[i][j - 1]) {
                            increment[i][j] = true;
                            found = true;
                        }
                    }
                }
            }
            if (!found)
                break;
            for (int i = 1; i < h - 1; i++) {
                for (int j = 1; j < w - 1; j++) {
                    if (increment[i][j])
                        pond[i][j]++;
                }
            }
        }

        return pond;

    }
}
