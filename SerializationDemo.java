package serializations;

import intro.Square;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout = new FileOutputStream("square.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		Square ref;
		for(int i=1; i<=5; i++)
		{
			ref = new Square();
			ref.set();
			oout.writeObject(ref);
		}
		System.out.println("Object Written in the file successfully");
		oout.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
