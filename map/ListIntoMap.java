package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListIntoMap {
	public static void main(String[] args) {

		List<Integer> keys = new ArrayList<>();
		keys.add(1);
		keys.add(2);
		keys.add(3);

		List<String> value = new ArrayList<>();
		value.add("rahul");
		value.add("puja");
		value.add("diksha");

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < keys.size(); i++) {
			map.put(keys.get(i), value.get(i));
		}
//		System.out.println(map);
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
	}
}
