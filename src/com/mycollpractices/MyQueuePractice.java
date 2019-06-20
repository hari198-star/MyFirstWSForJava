package com.mycollpractices;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class MyQueuePractice {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("hari");
		q.offer("suma");
		q.offer("chuchu");
		q.offer("bubby");
		
		System.out.println(q);
		
		Queue<String> pq = q.stream().collect(Collectors.toCollection(PriorityQueue::new));
		System.out.println(pq);
		
		Collection<Employee> empList = EmployeeUtil.createEmployees();
		empList.forEach(e -> System.out.println(e));
		
		System.out.println("\n\n");
		Queue<Employee> empQueue = empList.stream().
				collect(Collectors.toCollection(PriorityQueue::new));
		empQueue.forEach(e -> System.out.println(e));
		
		System.out.println("\n\n Polling last element in queue : " + empQueue.poll());
		System.out.println("\n\n Polling last element in queue : " + empQueue.poll());
		System.out.println("\n\n Polling last element in queue : " + empQueue.poll());

	}

}
