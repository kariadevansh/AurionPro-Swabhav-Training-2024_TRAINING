package com.apro.fileStreams.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileContentCalculator {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\APRO_TRAINING\\07_Streams_APP\\src\\com\\apro\\fileStreams\\test\\test01.txt");
			
			int ch;
			int ch_count = 0;
			int words = 0;
			int lines = 0;
			try {
				while((ch = fileInputStream.read()) >= -1) {
					char temp = (char)ch;
					if(ch == -1) {
						words++;
						break;
					}
						
					System.out.print((char)ch);
					if(Character.isWhitespace(ch) ) {
						words++;
					}
					if((char)ch == '\n') {
						lines++;
					}
					ch_count++;
				}
				System.out.println("\n ---- The no.of chars in this file are :"+ch_count);
				System.out.println("\n ---- The no.of words in this file are :"+words);
				System.out.println("\n ---- The no.of lines in this file are :"+lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
