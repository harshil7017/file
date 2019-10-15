package files;

import java.io.File;
import java.io.IOException;

public class createfile {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile=new File("pd.txt");
		
		
		try
		{
		if(myfile.createNewFile())
		{
			System.out.println("new file created:"+myfile.getName());
			System.out.println("new file created:"+myfile.canRead());
			System.out.println("new file created:"+myfile.getAbsolutePath());
			
		}
		else
		{
			System.out.println("File already exists");
		}
		}
		catch(Exception e)
		{
			
		}

	}

}
