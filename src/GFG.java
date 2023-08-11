import java.io.*;
public class GFG {

	public static void main(String[] args)throws IOException {
		
       FileReader sourceStream=null;
       try {
    	   sourceStream=new FileReader("test.txt");
    	   int temp;
    	   while((temp=sourceStream.read())!=-1);
       }
       finally {
    	   if(sourceStream!=null)
    		   sourceStream.close();
       }
	}

}
