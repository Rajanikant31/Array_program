package com.company;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int i, n, b, flag=0;
        System.out.println("Enter number of elements to store:");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " +n+ "Elements");
        for (i=0;i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter an element which have to be search: ");
        b = sc.nextInt();
        for (i=0; i<n; i++)
        {
            if(a[i] == b)
            {
                System.out.println("Element is found");
                flag=1;
                break;
            }

        }
        if(flag==0)
        {
            System.out.println("Element is not found");
        }
    }
}