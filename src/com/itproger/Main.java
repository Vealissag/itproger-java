package com.itproger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(sum(num1, num2));
        System.out.println();
        System.out.println();


    }
    private static int sum (int number1, int number2){
        int res = number1 + number2;
        return res;
    }
}