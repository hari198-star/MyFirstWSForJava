package com.mycollpractices;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.System;

public class MyDequeuePractice {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		Queue<Integer> ll = new LinkedList<>();
		
		for(int i=1; i < 100; i++) {
			q.offer(i);
			ll.offer(i);
		}
		
		long startTime = System.currentTimeMillis();
		ll.stream().forEach(i -> System.out.print(" , " + i));
		long endTime = System.currentTimeMillis();
		System.out.println("Time consumed : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		q.stream().forEach(i -> System.out.print(" , " + i));
		endTime = System.currentTimeMillis();
		System.out.println("Time consumed : " + (endTime - startTime));

	}

}
