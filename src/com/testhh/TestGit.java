package com.testhh;

import java.io.FileWriter;

public class TestGit {
	
	
		
		public static void main(String[] args) {
			try {
				FileWriter fw= new FileWriter("C:\\InputDemoTest\\Test.txt");
				
				fw.write("Hi govind................fjeSgjrhjgjkrdgkjldrhjlidrgjr");
				
				fw.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Success");
		
		
		

	}


}
