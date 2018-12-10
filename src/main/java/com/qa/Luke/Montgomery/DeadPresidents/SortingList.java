package com.qa.Luke.Montgomery.DeadPresidents;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingList {

	public ArrayList<President> sortList(ArrayList<String> list) {

		ArrayList<President> presidents = new ArrayList<President>();

		for (String string : list) {
			
			String[] string1 = string.split("\t");
			
			for (int i = 0; i < string1.length; i++) {
				string1[i] = string1[i].trim();
				string1[i] = string1[i].replaceAll(",", "");

			}

			if (string1[3].equals("")) {

				presidents.add(new President(string1));

			} else {

				presidents.add(new DeadPresident(string1));

			}
			
		}
		
		System.out.println(presidents);
		return presidents;
	}

}
