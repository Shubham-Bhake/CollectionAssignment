package com.yash.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	
public static void main(String[] args) {
	
	HashMap<String,Integer>HM=new HashMap<String,Integer>();
	
	HM.put("Warora", 1000);
	HM.put("Nagpur", 10000);
	HM.put("Pune", 15000);
	HM.put("Mumbai", 20000);
	
	
System.out.println("printing all keys and value");

HM.forEach((k,v)->System.out.println((k+" "+v)));

 
System.out.println("sorted HASHMAP");

HM.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


//HM.entrySet().stream().sorted(Map.Entry<String,Integer>comparingBykey()).forEach(System.out::println);



}

}
