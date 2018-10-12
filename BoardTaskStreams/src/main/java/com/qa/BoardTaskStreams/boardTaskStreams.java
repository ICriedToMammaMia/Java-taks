package com.qa.BoardTaskStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class boardTaskStreams {

	public static void main(String[] args) {

		unique();

	}

	static List<Integer> myList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void print() {

		myList.stream().forEach(System.out::println);

	}

	public static void evens() {

		List<Integer> evens = myList.stream().filter(myList -> myList % 2 == 0).collect(Collectors.toList());
		evens.stream().forEach(System.out::println);
	}

	public static void x10() {

		myList.stream().map(myList -> myList * 10).forEach(System.out::println);
	}

	public static void onlyHighest() {

		Integer maximum = myList.stream().max(Integer::compare).get();
		System.out.println(maximum);

	}

	public static void onlylowest() {

		Integer minimum = myList.stream().min(Integer::compare).get();
		System.out.println(minimum);

	}

	public static void squared() {
		myList.stream().map(myList -> myList * myList).forEach(System.out::println);
	}
	
	public static void unique() {
		List<Integer> unique = myList.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		
	}

}
