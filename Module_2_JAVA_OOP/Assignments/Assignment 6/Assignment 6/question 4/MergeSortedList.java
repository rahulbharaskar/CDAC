package org.collection.Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedList {
	public static List<Integer> mergeSortedList(List<Integer> list1, List<Integer>list2){
		
		List<Integer> mergedlist = new ArrayList<>(list1);
		mergedlist.addAll(list2);
		Collections.sort(mergedlist);
		
		return mergedlist;
		
	}
		
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(30);
        list1.add(50);
        list1.add(70);

        List<Integer> list2 = new ArrayList<>();
        
        list2.add(20);
        list2.add(40);
        list2.add(60);
        list2.add(80);

        List<Integer> mergedList = mergeSortedList(list1, list2);

        System.out.println("Merged Sorted List: " + mergedList);
    }
}


