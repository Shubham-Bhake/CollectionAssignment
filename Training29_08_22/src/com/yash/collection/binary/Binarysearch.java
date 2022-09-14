package com.yash.collection.binary;

public class Binarysearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int Search= 6;
		int first=0;
		int last=a.length-1;
		int middle=(first+last)/2;
		
		while(first<=last) {
			if (a[middle]== Search ) {
				System.out.println("element is at"+middle+"position");
				break;
			}
			else if(a[middle]<Search) {
				first=middle+1;
				
			}
			else{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("element not found");
		}
	}

}
