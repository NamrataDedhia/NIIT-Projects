package MyCode;
 import java.io.*;
public class FileCopy {

	public static void main(String[] args) {
		
		char []c = new char[2000];
		int cLen = c.length;

		try(FileReader fr = new FileReader("D:\\Namrata\\filecopydemo.txt");
		FileWriter fw = new FileWriter("D:\\Namrata\\democopy.txt"))
		{

		int count =0;// count variable will count the number of chars
		int read =0; //read will store each character in ascii form
		while((read=fr.read(c))!= -1)
		{
		if(read <cLen)
		fw.write(c);
		//fw.write(c, 0, read);
		/*else
		fw.write(c);*/
		count += read;
		}

		System.out.println("Wrote "+count+" chars");	
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}


		}


	}


