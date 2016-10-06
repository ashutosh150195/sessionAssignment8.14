package com.java.assignmenteight.four;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountVowels {
	
	public static FileReader fr ;
	
	public static void main(String[] args) {
		try {
			fr = new FileReader("F:/SourceCoding/acadglig/src/com/java/assignmenteight/three/FileReadingWriting.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(countVowelInFile());
	}

	private static int countVowelInFile() {
		// TODO Auto-generated method stub
		int number = 0, counter ;
		try {
			while ((counter = fr.read()) != (-1)) {
				if (counter == 65 || counter == 69 || counter == 73 || counter == 79 || counter == 85
						|| counter == 97 || counter == 101 || counter == 105 || counter == 111 || counter == 117) {
					++number;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}

}
