package serializations;

import intro.Square;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fin = new FileInputStream("square.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		intro.Square ref;
		while((ref = (Square)oin.readObject())!=null)
		{
			ref.get();
		}
		oin.close();
		System.out.println("File Read Successfully");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
