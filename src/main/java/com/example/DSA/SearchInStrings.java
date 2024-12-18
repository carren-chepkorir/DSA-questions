package com.example.DSA;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Carren";
        char target='C';
        Boolean answer=searchInStrings2(name,target);
        System.out.println(answer);

    }
     static boolean searchInStrings(String str,char target){
        if (str.length()==0){
            return false;
        }
         for (int i = 0; i < str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }
         }
         return false;
    }
    static boolean searchInStrings2(String str,char target){
        if (str.length()==0){
            return false;
        }
        //To use for loop we must convert string into an array
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
