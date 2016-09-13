import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharEncodingDemo {
	private String conca = "--------------------\n";
	public CharEncodingDemo(){


	}
	
	public void create(String[][] map) {
try {
        
    
	  //Character enconding.(1)

        FileOutputStream outputFile = new FileOutputStream("DataBase.txt");
	OutputStreamWriter writer = new OutputStreamWriter(outputFile, "8859_1");
	BufferedWriter bufferedWriter1 = new BufferedWriter(writer);
	PrintWriter printWriter = new PrintWriter(bufferedWriter1, true);
	//System.out.println("Writing using encoding: " + writer.getEncoding());
	

	//Print Java primitive values, one on each line.
		 
	 //printWriter.println("--------------------\n");


	 		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){
		   		conca = conca + map[x][y];
			  	//printWriter.print(map[x][y]);
			}
				//printWriter.println("");
				conca =conca + "\n";
			  
			}
	 
	conca = conca + "--------------------\n";
	 //printWriter.println("--------------------\n");
	 
	  printWriter.println(conca);

	//Create a BufferedReader which uses 8859_1 character enconding
	FileInputStream inputFile = new FileInputStream("DataBase.txt");
	InputStreamReader reader = new InputStreamReader(inputFile, "8859_1");
	BufferedReader bufferedReader = new BufferedReader(reader);
	


	//Read the (exact number of) Java primitive values.
	//in the same order they were written out, one on each line

	
	
	String    c = bufferedReader.readLine();
	



	//Check for end of stream:
	String line = bufferedReader.readLine();

	

	//Close the reader, which also closes the underlying stream
	  bufferedReader.close();

	//Write the values read on the terminal.

	
	
	System.out.println(c);
} catch (IOException e) {
        
    }


		}


}