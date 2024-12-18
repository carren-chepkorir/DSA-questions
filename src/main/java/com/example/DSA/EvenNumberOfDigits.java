package com.example.DSA;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] array={12,345,4,6,7896};
        int answer=findEvenNumbers(array);
        System.out.println(answer);

    }
      static int findEvenNumbers (int[] nums){
      int count=0;
      for (int num:nums){
      if (even(num)){
          count++;
      }

  }
      return count;
      }
    static boolean even (int num){
      int numberOfDigits=  findDigitsInNumber(num);
      if (numberOfDigits % 2==0){
          return true;
      }
return  false;
    }
    static int findDigitsInNumber (int number){
        int count=0;
        while (number>0){
            count++;
            number=number/10;

        }
        return count;
    }

}
