import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args)throws IOException{
		String str="File Handling in Java using"+"FileWrite and FileReader";
		FileWriter fw=new FileWriter("output.txt");
		for(int i=0;i<str.length();i++)
			fw.write(str.charAt(i));
		fw.close();
	}

}
