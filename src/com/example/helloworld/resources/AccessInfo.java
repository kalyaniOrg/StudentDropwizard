package com.example.helloworld.resources;

import java.util.ArrayList;
import java.util.List;
import com.example.helloworld.core.Student;

public class AccessInfo {
	
	public static List<Student> getUsers()
	{
		Student s=new Student(1,"kalyani","pune");
    	Student s1=new Student(2,"abc","nashik");
    	Student s2=new Student(3,"pqr","mumbai");
    	ArrayList<Student> a=new ArrayList<Student>();
    	a.add(s);
    	a.add(s1);
    	a.add(s2);
    	return a;
	}
	
	public static Student getUser(long id)
	{
		ArrayList<Student> a=(ArrayList<Student>) getUsers();
       	for(Student stud:a)
    	{
    		if(id==stud.getId())
    			return stud;
    	}
    	return null;
	}
}
