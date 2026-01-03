package com.Exception;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		 try {
		System.out.println("Connection terminate");
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter value 1");
        int a=sc.nextInt();
        System.out.println("please value 2 to divide");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        
        System.out.println("please enter size of an array");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        
        System.out.println("please enter index no. array");
        int n=sc.nextInt();
        arr[n]=999;
        }
        catch(ArithmeticException e) {
        	System.out.println("Arithmethic exception handled");
        }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("ArrayIndexOutOfBoundsException handled");
		 }
		 catch(NegativeArraySizeException e)
		 {
			 System.out.println("NegativeArraySizeException handled");
		 }
        System.out.println("connection terminated");
	}

}

// An exception refers to a mistake which happens during execution time due to faulty input provided by the user
// an exception when it occurs results in abrupt termination program 
// In java when exception occurs an object of that exception is generated the control along with the exception object is thrown out of the program and handed to rts(run time system)
// the RTS goes to the method which throws the exception and look for it user define exception handler 
// as shown in the above program if the programmer does not provided any user define exception handler there RTS will hand over the exception object to the default exception handler
// the advantage of default exception handler is that the exception object does not reach the object and hence the system crash is prevented
// however the major drawback of the default exception handler is that it is not able to avoid abrupt termination of program to overcome this problem the programmer must provide the user define exception handler
// as seen in the above program regardless the type of exception we receive the same msg this is because we are using a single catch block. This disadvantage can be overcome by making the use of multiple catch block