package com.bridgelabz.dsalgorithmanddsprogrammingproblems;
import java.util.Scanner;
public class PrimeNumberInGivenRange {
		public static void main(String[] args)
		{
			int start=0;
			int end=1000;
			System.out.println("Prime numbers between "+start+" and "+end+" are : ");
			int count;
			//loop for finding and printing all prime numbers between given range
			for(int i = start ; i <= end ; i++)
			{
				//logic for checking number is prime or not
				count = 0;
				for(int j = 1 ; j <= i ; j++)	
				{
					if(i % j == 0)
						count = count+1;
				}
				if(count == 2)
					System.out.println(i);
			}			
		}
	}