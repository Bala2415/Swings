package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File ref = new File("C:\\Users\\LCE\\Desktop\\bala");
		File ref1 = new File("C:\\Users\\LCE\\Desktop\\Akshiya\\Home.docx");
		System.out.println(ref.exists());
		if(ref.isDirectory())
			System.out.println("Dir");
		else
			System.out.println("File");
		System.out.println(ref1.canRead());
		System.out.println(ref1.canWrite());
		System.out.println(ref1.canExecute());
		String con[] = ref.list();
		for(String x : con)
			System.out.println(x);
		/*
		File ref2 = new File("C:\\Users\\LCE\\Desktop\\sun");
		ref2.mkdir();
		*/
		
		File ref2 = new File("C:\\Users\\LCE\\Desktop\\friends.txt");
		/*ref2.createNewFile();
		*/
		ref2.renameTo(new File("C:\\Users\\LCE\\Desktop\\dears.txt"));
	}	
	}
