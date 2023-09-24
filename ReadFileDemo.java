package read_write_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fin = new FileInputStream("colours.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int ch;
		while((ch = bin.read())!=-1)
		{
			System.out.print((char)ch);
		}
		bin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
