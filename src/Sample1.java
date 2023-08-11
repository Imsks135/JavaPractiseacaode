import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Sample1 {

	public static void main(String[] args) {
		//byte cities []= {'M','U','M','B','A','I','\n','V','A',
		//		'R','A','N','A','S','I'};
		RandomAccessFile outfile;
		try
		{
			//outfile=new FileOutputStream("city.txt");
			outfile=new RandomAccessFile("city.txt","rw");
			outfile.seek(outfile.length());
			outfile.writeBytes("Delhi");
			//outfile.write(cities);
			outfile.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}

	}

}