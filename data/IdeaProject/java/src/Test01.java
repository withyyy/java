import cn.hutool.core.io.IoUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        int a[][] = new int[11][11];
        a[1][2] = 1;
        a[2][3] = 2;
        int[][] ints = xiShu(a);
        for (int[] b :
                ints) {
            for (int x :
                    b) {
                System.out.print("\t" + x);
            }
            System.out.println();
        }

        int[][] erWei = erWei(ints);
        for (int[] i :
                erWei) {
            for (int t :
                    i) {
                System.out.print("\t" + t);
            }
            System.out.println();
        }
    }

    /**
     * 将二维矩形数组转换为稀疏数组
     *
     * @param a 二位数组
     * @return 稀疏数组
     */
    public static int[][] xiShu(int[][] a) {
        int sum = 0;

        //计算一共有多少个有效数值
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    sum++;
                }
            }
        }

        //配置稀疏数组第一行
        int[][] xiShu = new int[sum + 1][3];
        xiShu[0][0] = a.length;
        xiShu[0][1] = a[0].length;
        xiShu[0][2] = sum;

        //补全稀疏数组
        int con = 1;
        for (int k = 0; k < a.length; k++) {
            for (int m = 0; m < a[0].length; m++) {
                if (a[k][m] != 0) {
                    xiShu[con][0] = k;
                    xiShu[con][1] = m;
                    xiShu[con][2] = a[k][m];
                    con++;
                }
            }
        }

        return xiShu;
    }

    /**
     * 将稀疏数组，转换为二维数组
     *
     * @param xiShu 稀疏数组
     * @return 二维数组
     */
    public static int[][] erWei(int[][] xiShu) {
        int[][] erWei = new int[xiShu[0][0]][xiShu[0][1]];

        for (int i = 1; i < xiShu.length; i++) {
            erWei[xiShu[i][0]][xiShu[i][1]] = xiShu[i][2];
        }

        return erWei;
    }


}

