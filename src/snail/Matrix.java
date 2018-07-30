package snail;

/**
 * @author Artem on 30.07.2018
 * @project Snail
 */

public class Matrix {
    public static void main(String[] args) {
        int size = 6;
        long[][] mat = new long[size][size];
        int i = 1;
        int j, k;
        int p = size / 2;
        for (k = 1; k <= p; k++) {
            for (j = k - 1; j < size - k + 1; j++)
                mat[k - 1][j] = i++;
            for (j = k; j < size - k + 1; j++)
                mat[j][size - k] = i++;
            for (j = size - k - 1; j >= k - 1; --j)
                mat[size - k][j] = i++;
            for (j = size - k - 1; j >= k; j--)
                mat[j][k - 1] = i++;
        }
        for (int l = 0; l < mat.length; l++) {
            for (int m = 0; m < mat[0].length; m++) {
                System.out.print(mat[l][m]+" ");
            }
            System.out.println();
        }
    }
}