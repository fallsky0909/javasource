package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputEx6 {

	public static void main(String[] args) {

		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream(c:\\temp\\iu.mp4");
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(c:\\temp\\iucopy.mp4"))
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\iucopy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				int data = 0;
				
				byte b[] = new byte[8192]; //8kb
				
				long start = System.currentTimeMillis(); //시작시간
				
				while((data=fis.read(b))!=-1) {
					bos.write(b);
					
				}
				
				long end = System.currentTimeMillis(); //종료시간
				
				System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte 걸린 시간 " + (end-start)+"ms");
				
				} catch (Exception e) {
					e.printStackTrace();
		}
		
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\iucopy.mp4")) {
				int data = 0;
				
				long start = System.currentTimeMillis(); //시작시간
				
				while((data=fis.read())!=-1) {
					
				}
				
				long end = System.currentTimeMillis(); //종료시간
				
				System.out.println("걸린 시간 " + (end-start)+"ms");
				
				} catch (Exception e) {
					e.printStackTrace();
		}


	}

	
	
}
