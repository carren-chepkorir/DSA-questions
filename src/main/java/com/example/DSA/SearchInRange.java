package com.example.DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int num[]={1,28,46,90,35,11,34};
        int target=350;
        int answer=searchInRange(num,target,1,4);
        System.out.println(answer);

    }
    public static int searchInRange(int arr[],int target,int start,int end){
     if (arr.length==0){
         return -1;
     }
        for (int index = start; index <=end ; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            }


        }
        return -1;
    }
}
