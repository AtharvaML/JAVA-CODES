package com.Exception;


import java.util.Scanner;

class ATM1{
	void transaction() throws Exception{
		System.out.println("connection ATM establish");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		try {
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			throw(e);
		}
		finally {
		System.out.println("connection 3 terminated");
		}
	}
}

class Bank1{
	void banking() {
		System.out.println("connection BANK establish");
		ATM1 card=new ATM1();
		try {
		card.transaction();
		}
		catch(Exception e) {
			System.out.println("It will be handled");
		}
		System.out.println("connection Bank terminated");
		
	}
}
public class FinallyKeyword{

	public static void main(String[] args) {
		
		Bank1 b=new Bank1();
		b.banking();
	
	}

}

//Valid and Invalid syntaxes of try,catch and finally

//INVALID
//1)Try{
//    }

//2) catch{
//      }

//3) finally {
//        }

// 4) catch{
//  }
// finally{
//     }


//VALID
//1)TRY{
//   }
//   finally {
//      }

//2)try {
//     }
//   catch{
//    }

//3)try {
//   }
//  catch{
//   }
//  finally {
//     }

//4)Nested try catch
// try {
//  try {
//  }
//  catch{
//  }
//   }
//  catch{
//   } 

// 5) try nested catch
// try {
//  }
//  catch{
//  try {
//  }
//  catch{
//  }
//}

// 6) try catch nested finally
// try {
//   }
//  catch{
//  }
//  finally {
//  try {
//  }
//  catch{
//  }
//  }