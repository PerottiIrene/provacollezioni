package provacollezioni;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestLetturaScritturaJava {

	public static void main(String[] args) throws IOException {
		
		File fileCreato = new File("C:\\corso_java_2022\\ws__eclipse\\provacollezioni\\provaLetturaScrittura.txt");
		if (fileCreato.createNewFile()) {
	        System.out.println("File creato: " + fileCreato.getName());
	      } else {
	        System.out.println("File gia esistente");
	      }
		
		FileWriter writer = new FileWriter(fileCreato); 
		writer.write("prova funzionamento"); 
		writer.flush();
		writer.close();
		
		Scanner read = new Scanner(fileCreato);
	    while (read.hasNextLine())
	      System.out.println(read.nextLine());
	    read.close();
	}

}
