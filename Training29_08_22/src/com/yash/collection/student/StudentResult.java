package com.yash.collection.student;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentResult {

	public static int marksoutof = 500;
	public static int FiftyPercent = 250;
	public static int thirtyfivePercent = 175;
	public static int AboveAvgScore = 250;
	
	public static Student getInfoDetails(String sname,List<Student> list) {
		for (Student student : list) {
			if(sname.equals(student.getSname())) {
				return student;
				}
			}
		return new Student();
	}

	public static void main(String[] args) {
		
		 ArrayList<Student> al=new ArrayList<>();
		 Student s1=new Student(101,"abc","secA",190);
		 Student s2=new Student(102,"xyz","secB",450);
		 Student s3=new Student(103,"pqr","secD",400);
		 Student s4=new Student(104,"lmn","secC",150);
		 
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 al.add(s4);
		
		 System.out.println("rollno whose score less than 50%");
		 List<Integer>ml50=al.stream().filter(mark->mark.totalmarks<FiftyPercent)
				 .map(pm ->pm.rollno).collect(Collectors.toList());
		 
		 
		 System.out.println(ml50);
		 
		 
		 System.out.println("rollno whose score less than 35%");
		 List<Integer>ml35=al.stream().filter(mark->mark.totalmarks<thirtyfivePercent)
				 .map(pm ->pm.rollno).collect(Collectors.toList());
		 
		 
		 System.out.println(ml35);
		 
		 
		 System.out.println("rollno whose score above avarage");
		 
		 List<Integer>mlaboveAVG=al.stream().filter(mark->mark.totalmarks>AboveAvgScore)
				 .map(pm ->pm.rollno).collect(Collectors.toList());
		 
		 
		 System.out.println(mlaboveAVG);
		 
		 Student st=getInfoDetails("xyz",al);
		 System.out.println("Student="+st);

	

//		tudent s2=new Student();
//		 Student s3=new Student();
//		 
//		 
//		 Scanner sc=new Scanner(System.in);
//		 
//		 System.out.println("enter rol no for 1st student");
//		 int rollno=sc.nextInt();
//		 s1.setRollno(rollno);
//		 int rollno1=s1.getRollno();
//		 
//		 
//		 
//		 System.out.println("enter student name");
//		 String sname=sc.nextLine();
//		 s1.setSname(sname);
//		 String sname1=s1.getSname();
//		 
//		 System.out.println("enter class name");
//		 String classname =sc.nextLine();
//		 s1.setClassname(classname);
//		 String classname1=s1.getClassname();
//		 
//		 System.out.println("total mark");
//		 int totalmarks=sc.nextInt();
//		 s1.setTotalmarks(totalmarks);
//		 int totalmarks1=s1.getTotalmarks();
//		 
//		 
//		 System.out.println("enter rol no for 2nd student");
//		 int rollno2=sc.nextInt();
//		 s1.setRollno(rollno2);
//		 int rollno21=s1.getRollno();
//		 
//		 
//		 
//		 System.out.println("enter student name");
//		 String sname2=sc.nextLine();
//		 s1.setSname(sname2);
//		 String sname21=s1.getSname();
//		 
//		 System.out.println("enter class name");
//		 String classname2 =sc.nextLine();
//		 s1.setClassname(classname2);
//		 String classname21=s1.getClassname();
//		 
//		 System.out.println("total mark");
//		 int totalmarks2=sc.nextInt();
//		 s1.setTotalmarks(totalmarks2);
//		 int totalmarks21=s1.getTotalmarks();
//		 
//		 System.out.println("enter rol no for 3rd student");
//		 int rollno3=sc.nextInt();
//		 s1.setRollno(rollno3);
//		 int rollno31=s1.getRollno();
//		 
//		 
//		 
//		 System.out.println("enter student name");
//		 String sname3=sc.nextLine();
//		 s1.setSname(sname3);
//		 String sname31=s1.getSname();
//		 
//		 System.out.println("enter class name");
//		 String classname3 =sc.nextLine();
//		 s1.setClassname(classname3);
//		 String classname31=s1.getClassname();
//		 
//		 System.out.println("total mark");
//		 int totalmarks3=sc.nextInt();
//		 s1.setTotalmarks(totalmarks3);
//		 int totalmarks31=s1.getTotalmarks();
//		 
	}
}
