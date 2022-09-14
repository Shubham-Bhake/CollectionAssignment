package com.yash.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestListDessending {
public static void main(String[] args) {
		
		
		ArrayList<Integer>al= new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(3);
		
		System.out.println("printing original list");
		
		for(int Ab:al) {
			System.out.println(Ab);
		}
		
		System.out.println("sorted list with desendings");
		
		al.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}

}


