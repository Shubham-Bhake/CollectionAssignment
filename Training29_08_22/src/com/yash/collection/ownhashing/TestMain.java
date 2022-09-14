package com.yash.collection.ownhashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {



        Employee e1 = new Employee(201, "akshay", 1000, "sr.Enginner", "kolhapur");
           Employee e2 = new Employee(202, "sumit", 2000, "sr.Enginner", "Wardha");
           Employee e3 = new Employee(204, "Shubham", 2300, "IT", "Warora");
           Employee e4 = new Employee(203, "Ingole", 5000, "Admin", "Amravati");
           Employee  e5 = new Employee(205, "lavish", 4000, "It", "Nagpur");
          
           //ArrayList<Employee>list=new ArrayList<>();
         Set<Employee> list = new HashSet<>();
           list.add(e1);
           list.add(e2);
           list.add(e3);
           list.add(e4);
           list.add(e5);



        for (Employee e : list) {
               System.out.println(e);
           }
    
//        for(int i=0;i<list.size();i++) {
//        	System.out.println(list.indexOf(e3));
//        }
}
}
