package com.example.DSA;
//leetcode quiz

public class MaxWealth {
    public static void main(String[] args) {
        //person==row
        //accounts==colums
        int [][] bankAccounts={{5,6,7,8,9},{5,6,7,8,9}};
        int finalAnswer=maxWealth(bankAccounts);
        System.out.println(finalAnswer);

    }
  static int maxWealth(int [][] accounts){
        int answ=Integer.MIN_VALUE;
        for (int [] account:accounts){
            int sum=0;
            for (int intValue:account){
           sum+=intValue;
           if (sum>answ){
               answ=sum;
           }

            }
            return answ;

        }
        return -1;

    }
}
