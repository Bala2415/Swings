package read_write_streams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout = new FileOutputStream("colours.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		while((ch=(char)br.read()) != '~')
		{
			bout.write(ch);
		}
		System.out.println("File Created Successfully...");
		bout.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}

}
