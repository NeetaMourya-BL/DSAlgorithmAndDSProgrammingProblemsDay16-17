package com.bridgelabz.dsalgorithmanddsprogrammingproblems;
import java.io.*;  
import java.util.*;  
public class PrimeNumberAnagramAndPalindromNumber {
	  
	//create FindAllPalPrimeNumber class to get all the ORE number in the given range  
	  
	    //main() method start  
	    public static void main(String args[])  
	    {  
	        int startRange=0, endRange=1000;
	        System.out.println("The PalPrime Numbers between" + startRange + " and " + endRange + "are:");  
	        for(int i = startRange; i <= endRange; i++){  
	            if(checkPalPrimeNumber(i))  
	                System.out.println(i);  
	        }  
	    }  
	    static boolean checkPalPrimeNumber( int number){  
	          
	        //declare and initialize variables   
	        int temp, rem, i;  
	        int count = 0;  
	        int sum = 0;  
	          
	        //store number in a temporary variable temp  
	        temp = number;  
	          
	        //use for loop check whether number is prime or not  
	        for(i = 1; i <= temp; i++)  
	        {  
	            if(temp%i == 0)  
	            {  
	                count++;    //increment counter when the reminder is 0  
	            }  
	        }  
	          
	        //use while loop to check whether the number is palindrome or not  
	        while(number > 0)  
	        {  
	            // get last digit of the number  
	            rem = number%10;  
	              
	            // store the digit last digit  
	            sum = sum*10+rem;   
	              
	            // extract all digit except the last  
	            number = number/10;   
	        }  
	          
	        //check whether the number is palindrome and Prime or not  
	        if(temp == sum && count == 2)  
	            return true;  
	        else  
	            return false;  
	    }  
	}  