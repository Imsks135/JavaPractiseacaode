import java.io.*;
public class Sample {

	public static void main(String[] args) {
		byte cities []= {'M','U','M','B','A','I','\n','V','A',
				'R','A','N','A','S','I'};
		FileOutputStream outfile=null;
		try
		{
			outfile=new FileOutputStream("city.txt");
			outfile.write(cities);
			outfile.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}

	}

}
