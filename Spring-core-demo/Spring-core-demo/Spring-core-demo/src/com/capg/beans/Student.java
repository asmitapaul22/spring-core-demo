package com.capg.beans;

public class Student {
  int stdId;
  String stdName;
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public Student()
{
	
}

//business logic method


public void displayStudentInfo() {
	// TODO Auto-generated method stub
	System.out.println(stdId + " " + stdName);
}
  
}
