package com.test.java;

import java.util.Arrays;

public class array{
    public static void main(String[] args){
       int[][] triangle = new int[10][];
       for (int i=0; i<10; i++){
           triangle[i] = new int[i+1];
           triangle[i][0] = triangle[i][i] = 1;
           for (int j=1; j<triangle[i].length-1; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
           }
       }
       for (int k=0; k<triangle.length; k++){
           System.out.println(Arrays.toString(triangle[k]));
       }
    }
}
