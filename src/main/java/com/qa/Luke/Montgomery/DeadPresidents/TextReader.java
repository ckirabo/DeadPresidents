package com.qa.Luke.Montgomery.DeadPresidents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {

	public ArrayList<String> fileReader(File file) throws IOException {
		String line = null;
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		try {

			while ((line = reader.readLine()) != null) {
				line.split(",");
				//System.out.println(line);
				list.add(line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {

			reader.close();
		}
		return list;

	}

}
