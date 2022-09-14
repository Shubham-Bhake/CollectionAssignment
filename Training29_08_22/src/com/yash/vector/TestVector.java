package com.yash.vector;

import java.util.Vector;
import java.util.stream.Collectors;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector<Integer>vl=new Vector<>();
		vl.add(1);
		vl.add(2);
		vl.add(5);
		vl.add(6);
		vl.add(4);
		vl.add(3);
		
		System.out.println("orging vector");
		for(int Vec:vl) {
			System.out.println(Vec);
		}
		
		System.out.println("sorted vector");
		vl.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
