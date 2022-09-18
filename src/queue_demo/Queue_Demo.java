package queue_demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue_Demo {

	public static void main(String[] args) {
		
//		LinkedList pq= new LinkedList();		//also can use LinkedList
		PriorityQueue pq= new PriorityQueue();		
		
		pq.add('A');
		pq.add('B');
		pq.add('C');
		pq.offer('C');
//		pq.offer(100);		//hetrogenous is not allowed or different data type
		System.out.println(pq);		//insertion order, duplicate allowed
		
//		pq.removeAll(pq);	//if pq is empty: element will return exception and peek(): will return null
		System.out.println( pq.element());		//get the head of element
		System.out.println( pq.peek());
		
		pq.remove(); 	//remove head queue and return queue
		System.out.println(pq);
		
		pq.poll();		//remove head queue and return queque
		System.out.println(pq);
		
		Iterator it=pq.iterator();		//read reach element
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
