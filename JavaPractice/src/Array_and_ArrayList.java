import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Array_and_ArrayList {

	public static void main(String[] args) {
		int[] arry = new int[3];

		arry[0] = 10;
		arry[1] = 11;
		arry[2] = 19;

		System.out.println(arry[0]);
		// ----------READ ARRAY USING FOR LOOPS
		for (int i = 0; i < 3; i++) {
			System.out.println(arry[i]);
		}

		for (int i : arry) {
			System.out.println(i);
		}

		// ---------2D ARRAY
		System.out.println("<----------2D ARRAY------------>");
		
		
		int[][] arryDouble = new int[3][2];
		
	//Inserting Values in 2d Array	
		arryDouble[0][0] = 100;
		arryDouble[0][1] = 200;
		arryDouble[1][0] = 300;
		arryDouble[1][1] = 400;
		arryDouble[2][0] = 500;
		arryDouble[2][1] = 600;
		
		// check how many rows on 2d array
		System.out.println("<----------How many rows in 2d Array-------------------->");
		System.out.println(arryDouble.length);
		
		// check how many column on 2d array
		System.out.println("<----------How many column in 2d Array-------------------->");
		
		System.out.println(arryDouble[0].length);

		System.out.println("<----------READ ARRAY ON 2D------------>");
		// -------read 2d array
		for (int i = 0; i < arryDouble.length; i++) {
			for (int j = 0; j < arryDouble[i].length; j++) {
				System.out.println(arryDouble[i][j]);

			}

			String s = "Java Selnium";
			System.out.println(s.substring(0, 3));
		}

		// ---- Array Object
System.out.println("-----------Object Array------------------");
		Object[] obj = new Object[4];

		obj[0] = 22;
		obj[1] = "hello";
		obj[2] = 1.5;
		obj[3] = 394.2494;

		for (int i = 0; i <= obj.length - 1; i++) {
			System.out.println(obj[i]);

		}
		System.out.println(obj[1]);
		
		
		ArrayList <String> arry1 = new ArrayList <String> ();
		arry1.add("Mango");
		arry1.add("Apple");
		arry1.add("Banana");
		arry1.add(3, "oranges");
		
		for(int i = 0;i<=arry1.size();i++) {
			System.out.println(arry1.toString().charAt(i));
		}
		
		
		Collections.sort(arry1);
		System.out.println(arry1);
		
		
		ArrayList al = new ArrayList();  //declaring ArrayList with different data types
		ArrayList <String> abc = new ArrayList<String>();
		//add element with different data types
		al.add("String");
		al.add(89);
		al.add(90.89);
		al.add(true);
		
		System.out.println(al.size());//----> number of lelemnts in arraylist
		
		System.out.println(al);
		
		al.add(1, 100);//add element with index
		System.out.println(al);
		System.out.println(al.get(0));//get value on index
		al.add("python");
		al.add("java");
		System.out.println(al);
		al.set(0, "c#");
		System.out.println(al);
		System.out.println(al.contains("c#"));// check of the element is presents
		System.out.println(al.isEmpty());
		System.out.println(al.subList(0, 3));
		
		//reading the ELEMENT from arraylist
	
		System.out.println("--------ForLoops-----------");
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
	System.out.println("---------ForEach-------------");	
//2.reading element enhance for loops or foreach loops
		
		for(Object lp:al) {
			System.out.println(lp);
		}
		
		System.out.println("---------Iterator------------");
//3 iterator method
		
		Iterator it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//adding all the Element of ArrayList
	System.out.println("-----------ADD ALL METHOD--------------");
	
	ArrayList ab = new ArrayList();
	
	ab.addAll(al);
	ab.addAll(arry1);
	
	
	System.out.println(ab);
	System.out.println("------REMOVE ALL----------");
	ab.removeAll(al);
	System.out.println(ab);
	
	System.out.println("-----------Sort Elements on ArrayList------------");
	
	Collections.sort(ab);
	System.out.println(ab);
	
	System.out.println("Sort Element in reverse order");
	
	Collections.sort(ab,Collections.reverseOrder());
	System.out.println(ab);
	
	System.out.println("------Shuffle element-------");
	Collections.shuffle(ab);
	System.out.println(ab);
	
	System.out.println("-------------CONVERT ARRAYS into Arraylist---------------");
	String []cars1= {"Toyota","Honda","Lexxus"};
	
	for(String car:cars1) {
		System.out.println("This is an regurlar array: "+ car);
	}
	
	System.out.println();
	ArrayList arry6 = new ArrayList(Arrays.asList(cars1));
	System.out.println("This is a convereted ArrayList "+arry6);
	
	
		
//		arry1.add("PINE APPLE");
//		System.out.println(arry1);
//		//arry1.remove(0);
//		System.out.println(arry1.get(1));
//		
//		Collections.shuffle(arry1);
//		System.out.println(arry1);
//		
//		List al1 = new ArrayList();
//		al1.add(89);
	}

	// collection = is a group of object representing a single entity with ready
	// made method
	/*
	 * type of collection interface 1. list interface - insertion ordered of a
	 * object is preserved and duplicate of an object is allowed 2. Set interface-
	 * the insertion order of object is not persevered and duplicate of an object is
	 * not allowed 3. Queue interface- is use when creating an object prior to
	 * processing
	 * 
	 * 
	 */
	// Class on list interface
	/*
	 * 1. ArrayList 2. LinkList 3. Vector and Stack --> legacy classes
	 */

	// Class on Set interface
	/*
	 * 1. HashSet 2. LinkedHashSet
	 */

	// Class of Queue Interface
	/*
	 * 1. priorityQueue
	 */
	// Map Interface - is a group of Object representing keys and values. its not
	// part of collection interface. the "key" cannot be duplicated but the "values" can be duplicated
	/*
	 * Class of HashMap that implemented
	 * 1.HashMap
	 * 2.LinkHasHmap
	 * 3.HashTable
	 * 
	 * 
	 */
; 
	//METHOD IN COLLECTION or common Method for Set,list,queue
	/*1.add()
	 *2.addAll()
	 *3.remove()
	 *4.removeAll()
	 *5.retain()
	 *6.retainAll()
	 *7.clear() 
	 *8.isEmpty
	 *9.size
	 *10.contains
	 *11.containsAll
	 *12.toArray
	 */
	//list method
	/*set()
	 * get() 
	 * add(index, object/) "all the list method can specify index"
	 */


	//ArrayList default allocated space is 10

	//collection class
	/*
	 * Collections.sort()
	 * Collections.shuffle
	 */
}


