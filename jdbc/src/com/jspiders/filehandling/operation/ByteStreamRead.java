package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Files\\demo.txt");
		String data="";
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			int b = -1;
			while((b = fileInputStream.read()) != -1) {
				data += (char)  b;
			}
			System.out.println(data);
			fileInputStream.close();
			
			
		}else {
			System.out.println("File does not exit");
		}
			
		
	}
       
}
