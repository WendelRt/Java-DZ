package com.company;

public class Main {

    public static void main(String[] args) {
        int x1=1;
        int x2=1; //число, которое чаще всего меняется в столбце
        String [][] tabl = new String[8][9];
        for (int i=0;i<8;i++) {
            x1++;
            for (int j = 0; j<9 ; j++)
            {tabl[i][j]= (x1+ "x" + x2 + "="+(x1*x2));
            System.out.println(tabl[i][j]);
                x2++;}
            System.out.println(" ");
            x2=1;
                    }
    }
}
