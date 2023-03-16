package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;

public class FileInputEx3 {

	public static void main(String[] args) {
		//FileInputEx1.java를 읽어서 화면 출력
		//행 번호와 같이 출력(FileReader, Writer)
		try(FileReader reader = new FileReader(".\\src\\io\\FileEx1.java");
			PrintStream out = System.out) {
			
			int data = 0;
			int row = 1; //행번호
			
			System.out.print(row+"   ");
			
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
				
				if(data=='\n') {
					row++;
					System.out.println(row+"   ");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
