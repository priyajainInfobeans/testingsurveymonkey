package com.Inheritance;

public class ReturningValue {
	int length;
	  int breadth;

	  void setLength(int len)
	  {
	  length = len;
	  }

	  int getLength()
	  {
	  return length;
	  }

	}

	class RectangleDemo {
	  public static void main(String args[]) {

		  ReturningValue r1 = new ReturningValue();

	  r1.setLength(20);

	  int len = r1.getLength();

	  System.out.println("Length of Rectangle : " + len);

	  }
	}


