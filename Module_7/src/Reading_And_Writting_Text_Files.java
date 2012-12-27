import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Reading_And_Writting_Text_Files {

//Create a file using java
	//write something into it
	//read it back
	
	public static void main(String[] args) throws IOException {
	//creating
	File f = new File("c:\\testing\\temp.tex");
	f.createNewFile();
	
	//writing
	
	FileWriter w = new FileWriter("c:\\testing\\temp.tex");
	BufferedWriter out = new BufferedWriter(w);
	out.write("Hello we are writing in a file");
	out.newLine();
	out.write("This is a new Line");
	out.flush();
		
	//Reading
	
	FileReader r = new FileReader("c:\\testing\\temp.tex");
	BufferedReader bfr = new BufferedReader(r);
	String x="";
	while((x = bfr.readLine()) != null){
		System.out.println(x);
	}
	
	}

}
