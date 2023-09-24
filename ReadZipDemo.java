package zipping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadZipDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fin  = new FileInputStream("colourssmall.zip");
		InflaterInputStream iin = new InflaterInputStream(fin);
		int ch;
		while((ch = iin.read())!=-1)
		{
			System.out.print((char)ch);
		}
		iin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
