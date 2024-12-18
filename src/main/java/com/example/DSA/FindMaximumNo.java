package com.example.DSA;

public class FindMaximumNo {
    public static void main(String[] args) {
        int[] arr={12,18,6,90,36,98,3};
        System.out.println(minValue(arr));
    }
    //assuming an array is not empty
    //find the minimum value
    public  static  int minValue(int[]nums){
        //it will start comparing with the value at index 0 which have assumed as my minimum value as it loops
        int answer=nums[0];
        //looping comparison starts at index 1
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]<answer){
                //comparing if the curret index num[i] is less than the assumed minimum value which
                // is already defined as answer and update it
                answer=nums[i];
                return answer;
            }

        }
        return -1;


    }
}
