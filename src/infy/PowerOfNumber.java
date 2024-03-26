package infy;

import java.util.Scanner;
/*
Given base and exponent, find the power

input:2, 8
output:256.0

input:  15    0
output:  1.0

input: 5  -2
output: 0.04

 */
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        double res=1;

        for(int i=0;i<Math.abs(exp);i++)
            res*=base;

        if(exp<0)
            res=1/res;
        System.out.println(res);
    }
}
