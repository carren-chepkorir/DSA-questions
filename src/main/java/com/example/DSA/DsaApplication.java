package com.example.DSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.in;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		//LINEAR SEARCH ALGORITHM
		//defining the array and the targeted value

		SpringApplication.run(DsaApplication.class, args);
		int[] nums={18,13,16,12,-8,10,-6};
		int target=12;
		int answer=linearSearch2(nums,target);
		System.out.println(answer);

	}
	//we use for loop here to search for the targeted value
	//if the value is found ,return an index
	//return -1 if the value is not found
	public static int linearSearch(int arr[],int target){
		if(arr.length==0){
			return -1;

		}
		for (int index = 0; index <arr.length ; index++) {
			//check for element at every index if it is =target
			int element=arr[index];
			if (element==target){
				return index;
			}

		}
return -1;

	}
	//if you ant to return the element itself,,,we use the advance for loop
	public static int linearSearch2(int arr[],int target){
		if(arr.length==0){
			return -1;

		}
		for (int element:arr) {
			//check for element at every index if it is =target
			if (element==target){
				return element;
			}

		}
		return -1;

	}

}
