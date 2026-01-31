package com.collections;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(100);
		ts.add(75);
		ts.add(50);
		ts.add(25);
		ts.add(125);
		ts.add(150);
		ts.add(175);
		
		System.out.println(ts);
		System.out.println("-------Upper-------");
		System.out.println(ts.ceiling(75));
		System.out.println("---------------");
		System.out.println(ts.higher(75));
		System.out.println("---------------");
		System.out.println(ts.ceiling(70));
		System.out.println("---------------");
		System.out.println(ts.higher(70));
		
		
		
		System.out.println("------Lower------");
		System.out.println(ts.floor(75));
		System.out.println("---------------");
		System.out.println(ts.lower(75));
		System.out.println("---------------");
		System.out.println(ts.floor(74));
		System.out.println("---------------");
		System.out.println(ts.lower(74));
		
		System.out.println("---------------");
		System.out.println(ts);
		System.out.println("-----HeadSet-------");
		System.out.println(ts.headSet(75));
		System.out.println("-----tailSet-------");
		System.out.println(ts.tailSet(75));
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		
		p.add(12);
		p.add(12);
	    

		System.out.println(p);
	}

}

//Skewed binary Search tree
//for binary search tree if data is giving in ascending order then it become Skewed binary search tree
// it is not using for seraching skewed binary search using red black algorithm 

//Tree set internal stores data in balance binary search tree amd when data is retrieve in order traversal technique would be applied on the balance binary search tree and data will be displayed ascending order we can say that tree set stores the data in ascending order

//additional methods in treeSet

//HashSet
// As shown in the above diagram Searching is very efficent if we use hashSet but as see in the above program the output of the program can be predict this is because storage of data is purely depends on the hash function 
//Searcing has to efficent and if iserstion order to be presvered then, insert of hash set we has to make use of linked hash set

//LinkedHashSet
//it is very efficent in searching and preserving insertion order of data

//Classes       |Internal Data Structure      |Is insertion order preserve | Is Duplicate allowed| Is Null Insertion permitted
// ArrayList    | Dyanamic array list         | Yes                        | Yes                 | Yes 
// LinkedList   | Doubly Linked list          | Yes                        | Yes                 | Yes
// Queue        | Doubly ended queue          | Yes                        | Yes                 | Yes
// PriorityQueue| Mean Heap                   | No                         | Yes                 | 
// TreeSet      | Balanced Binary Search Tree | NO                         | No                  | No
// HashSet      | Hashing And Hash Table      | No                         | No                  | No
// LinkedHashSet| Hashing And LinkedHash Table| Yes                        | No                  | NO



