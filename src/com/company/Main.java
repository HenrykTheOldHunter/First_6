package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Массив рандомных чисел");
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) arr1[i] = (int)(Math.random()*100);
        System.out.println("Первый массив");
        for(int x: arr1) System.out.print(x + " ");
        Arrays.sort(arr1);
        System.out.println("\nОтсортированный первый массив");
        for(int x: arr1) System.out.print(x + " ");

        int[] arr2 = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr2.length; i++) arr2[i] = Math.abs(ran.nextInt())/10000000;
        System.out.println("\nВторой массив");
        for(int x: arr2) System.out.print(x + " ");
        Arrays.sort(arr2);
        System.out.println("\nОтсортированный второй массив");
        for(int x: arr2) System.out.print(x + " ");
    }
}
