package com.ercan.OpenClosed.example2.after;


import com.ercan.OpenClosed.example2.after.impl.DescComparator;

public class MainApp {
    public static void main(String[] args) {

        int arr[]={3,2,4,1,5,6};

        ArrayUtil.sort(arr,new DescComparator());

        System.out.println("Values in the array : ");

        for (int a:arr){
            System.out.println(a);
        }

    }
}
