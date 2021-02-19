import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FormattedNamesm {

    public static void main(String[] args) {
    	//try and catch for full name file
		try {
			//creating files
	        File filein = new File ("input.txt");
	        File fileout = new File ("output.txt");
	        //creating scanner
			Scanner in = new Scanner(filein);
			//creating printer
			PrintWriter printer = new PrintWriter(fileout);
			System.out.println(args[0]);
			//while loop to read scanner
			 while(in.hasNextLine()) {
		        	String line = in.nextLine();
		        	//uppercase the line by splitting
		        	String[] newLine = line.split(" +");
		        	String firstLetter = newLine[1];
		        	firstLetter = firstLetter.toUpperCase() + ".";
		        	newLine[1] = firstLetter;
		        	line = String.join(" ", newLine);
		        	System.out.println("this is the input file: "+ line);
		        	//write line in output
		        	printer.write(line);
		        	System.out.println("this is the output file: " + line);
		        	}
			  //closing scanner and printer
			  in.close();
			  printer.close();
			  } catch (FileNotFoundException e) {
			    System.out.println("File (input.txt) was not found");
			e.printStackTrace();
		}
		
		//try and catch for Middle initial file
		try {
			//creating files
	        File filein = new File ("inputm.txt");
	        File fileout = new File ("outputm.txt");
	        //creating scanner
			Scanner in = new Scanner(filein);
			//printer for output file
			PrintWriter printer = new PrintWriter(fileout);
			System.out.println(args[0]);
			//while loop to read scanner
			 while(in.hasNextLine()) {
		        	String line = in.nextLine();
		        	//upperclass by splitting
		        	String[] newLine = line.split(" +");
		        	String firstLetter = newLine[1];
		        	firstLetter = firstLetter.toUpperCase() + ".";
		        	newLine[1] = firstLetter;
		        	line = String.join(" ", newLine);
		        	System.out.println("this is the inputm file: "+ line);
		        	//write line in output
		        	printer.write(line);
		        	System.out.println("this is the outputm file: " + line);
		        	}
			  //closing scanner and printer 
			  in.close();
			  printer.close();
			  } catch (FileNotFoundException e) {
			    System.out.println("File (inputm.txt) was not found");
			e.printStackTrace();
		}
    }
} 