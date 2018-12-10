package com.qa.Luke.Montgomery.DeadPresidents;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		TextReader t = new TextReader();
		File file = new File("presidents.txt");
		SortingList s = new SortingList();
		ArrayList<String> list = new ArrayList<String>();
		
		try {

			list = t.fileReader(file);
			
			for (String string : list) {
				//System.out.println(string);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		list.remove(0);
		s.sortList(list);
		
	}
}
