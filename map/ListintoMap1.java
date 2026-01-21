package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListintoMap1 {

	public static void main(String[] args) {
		List<String> keys = new ArrayList<String>();
		keys.add("name");
		keys.add("City");
		keys.add("age");
		keys.add("mobileNo");
		
		List<String> value = new ArrayList<String>();
		
		value.add("rahul");
		value.add("sangli");
		value.add("18");
		value.add("2266554411");
		List<String> value1 = new ArrayList<String>();
		value1.add("ganesh");
		value1.add("pune");
		value1.add("15");
		value1.add("5544221122");
		
		
		
		
		Map<String,String> map = new HashMap<String, String>();
		for(int i =0;i<keys.size();i++) {
			map.put(keys.get(i),value.get(i));
		}
//		System.out.println(map);
	
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}
		
		System.out.println("   -----   ");
		Map<String,String> map1 = new HashMap<String, String>();
		
		for(int i =0;i<keys.size();i++) {
			map1.put(keys.get(i),value1.get(i));
		}
//		System.out.println(map);
	
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}
	}
}
