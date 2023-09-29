package home.assignment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Intersection {

	public static void main(String[] args) {
		List <Integer>list1 = new ArrayList<Integer>();
		int arr1[] = {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		List<Integer>input1 = new LinkedList<Integer>();
			List<Integer>input2 = new LinkedList<Integer>();
		
		for(int num : arr1){
			input1.add(num);
			}
		for(int num :arr2)
		 {
			input2.add(num);
	
				}
		List<Integer>intersection = new LinkedList<Integer>(input1);
		intersection.retainAll(input2);
		System.out.println(intersection);
		}
		
		
		
		
	}

	