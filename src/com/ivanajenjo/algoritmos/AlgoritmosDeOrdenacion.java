package com.ivanajenjo.algoritmos;

import java.util.Random;

public class AlgoritmosDeOrdenacion {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randoms = random.ints(500).toArray();
        printArray(randoms);
        int res[] = sort(randoms);
        System.out.println(res[1]);

    }

    public static int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
