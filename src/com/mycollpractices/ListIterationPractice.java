package com.mycollpractices;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIterationPractice {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		List<String> al = new ArrayList<>();
		al.add("hari");
		al.add("bubby");
		al.add("suma");
		al.add("chuchu");
		
		Collections.shuffle(al, new Random());
		
		System.out.println(al);
		
		Collections.sort(al, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		
		System.out.println(al);
		
		for(ListIterator iter = al.listIterator(al.size()); iter.hasPrevious(); ) {
			System.out.println(iter.previous());			
		}
		
		java.security.MessageDigest md = MessageDigest.getInstance("MD5");
		md.update("http://www.educative.io/distributed.php?id=design".getBytes());
		System.out.println(md.digest());
		
		StringBuffer hexString = new StringBuffer();
		byte[] digest = md.digest();
		
		md.update("http://www.educative.io/distributed.php%3Fid%3Ddesign".getBytes());
		byte[] digest2 = md.digest();
		System.out.println(digest2);
		
		if(digest.equals(digest2)) {
			System.out.println("Both are same...");
		}
	    
		String base64String = Base64.getEncoder().encodeToString(digest);
		System.out.println("Base64 string : " + base64String + "  length = " +base64String.length());
	}

}
