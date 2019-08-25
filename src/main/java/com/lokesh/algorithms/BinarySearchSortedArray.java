package com.lokesh.algorithms;
public class BinarySearchSortedArray{
	public static void main(String [] s)
	{
		int [] sortedArray = new int[]{-3,-2,0,4,5,10,13,15,20,24,25,30,35};
		//int [] sortedArray = new int[]{20};
		int searchElement = -3;
		new BinarySearchSortedArray().binarySearch(sortedArray,searchElement);
	}
	
	public boolean binarySearch(int [] sortedArray, int searchElement){
		int beginIndex = 0;
		int endIndex = sortedArray.length-1;
		boolean elementFound = false;	
		// this variable is not required, but good to have this just to track how efficient this algorthm.
		int numberOfIterations = 0;
		while(beginIndex <= endIndex){
			numberOfIterations = numberOfIterations+1;								
			//Calculating pivot should be (beginIndex + endIndex)/2 enough but to avoid int limit range errors in extreem scenarios we have to calculate pivot in different way.
			//int pivot = (beginIndex + endIndex)/2;
			int pivot = beginIndex + (endIndex - beginIndex)/2;
			if(sortedArray[pivot] == searchElement){
				elementFound = true;
				System.out.println(" Number=["+searchElement+"] is found in given array at index=["+pivot+"], numberOfIterations=["+numberOfIterations+"]...!!");
				break;
			}else if(sortedArray[pivot] > searchElement){
				endIndex = pivot-1;
			}else{
				beginIndex = pivot+1;
			}
		}
		
		if(!elementFound){
			System.out.println("Number=["+searchElement+"] is NOT found in given array...!!, numberOfIterations=["+numberOfIterations+"]...!!");
		}
		
		return elementFound;
	}
}
