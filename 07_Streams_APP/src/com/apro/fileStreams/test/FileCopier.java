package com.apro.fileStreams.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\APRO_TRAINING\\07_Streams_APP\\src\\com\\apro\\fileStreams\\test\\test01.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\APRO_TRAINING\\07_Streams_APP\\src\\com\\apro\\fileStreams\\test\\test02.txt");
			int ch;
			try {
				while((ch = fileInputStream.read()) != -1) {
					fileOutputStream.write(ch);
				}
				System.out.println("file copied successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
