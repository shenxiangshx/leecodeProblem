package com.leetcode.algorithms.array;

public class SpiralArrayPrint {

    public static void spiralOrderArrayprint(int[][] matrix){
        int tR = 0 ;
        int tC = 0;
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;
        while (tR<dR&&tC<dC){
            pringEdge(matrix,tR++,tC++,dR--,dC--);
        }
    }

    public static void pringEdge(int[][] matrix,int tR,int tC,int dR,int dC){
        if (tR == dR){
            for (int i = tC; i < dC; i++) {
                System.out.println(matrix[tR][i]);
            }
        }else if (tC == dC){
            for (int i = tC; i < dC; i++) {
                System.out.println(matrix[i][tC]);
            }
        }else {
            int curC=tC;
            int curR=tR;
            while (curC!=dC){
                System.out.println(matrix[tR][curC]);
                curC++;
            }
            while (curR!=dR){
                System.out.println(matrix[curR][dC]);
                curR++;
            }
            while (curC!=tC){
                System.out.println(matrix[dR][curC]);
                curC--;
            }

            while (curR!=tR){
                System.out.println(matrix[curR][tC]);
                curR--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralOrderArrayprint(a);
    }
}
