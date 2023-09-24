package zipping;
// InflaterInputStream
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class ZipFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout = new FileOutputStream("colourssmall.zip");
		DeflaterOutputStream dout = new DeflaterOutputStream(fout);
		FileInputStream fin = new FileInputStream("colours.txt");
		
		int ch;
		while((ch = fin.read())!=-1)
		{
			fout.write((char)ch);
		}
		System.out.println("Zip File Created..");
		dout.close();
		fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
