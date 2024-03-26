package infy;

import java.util.Scanner;

/*
Add two fractions. Each fraction is an array of size 2 where arr[0] is the numerator and arr[1] is the denominator
(ex- 3/8 and 2/7)

Another solution in GFG:
https://www.geeksforgeeks.org/program-to-add-two-fractions/
 */

public class AddTwoFraction {
    //Time Complexity of gcd function is  O(Log min(num, den));
    private static int gcd(int num, int den ) {
        if(num==0)
            return den;
        return(gcd(den%num, num));
    }

    //time complexity -->O(N);

    private static void addFraction(int[] arr1, int[] arr2) {
        int num = 0;
        int den = 0;

        if(arr1[1]==arr2[1]) {
            num = arr1[0]+arr2[0];   //O(1)
            den = arr1[1];
        }
        else {
            num=arr1[0]*arr2[1]+arr1[1]*arr2[0]; //O(1)
            den = arr1[1]*arr2[1];
        }

        int temp = gcd(num,den);
        int n1= num/temp;
        int d1=  den/temp;

        System.out.println("Result->"+n1+"/"+d1);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[]=new int[2];
        int arr2[]= new int[2];
        System.out.println("Enter numerator and denominator of fraction1");
        for(int i=0;i<2;i++)
            arr1[i]=s.nextInt();
        System.out.println("Enter numerator and denominator of fraction2");
        for(int i=0;i<2;i++)
            arr2[i]=s.nextInt();
        if(arr1[1]==0 || arr2[1]==0) {
            System.out.println("Cannot perform this operations, denominator cannot be 0");

            System.exit(0);
        }

        addFraction(arr1,arr2);

    }

}
