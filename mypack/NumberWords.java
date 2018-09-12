package mypack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberWords {

public static void countWords () {
    String textFileLocation ="D:\\nik.txt";
   
    Map<String,Integer> n = new HashMap<>();
    

    try {
    	List<String> words=null;
    	
    	BufferedReader br = new BufferedReader(new FileReader(new File(textFileLocation)));
    	String line = null;
    	while((line = br.readLine()) !=null)
    	{
    		words = null;
    		System.out.println("Line : "+line); 
    		
    		 words = Arrays.asList(line.split("\\s"));
    		 System.out.println(words);
    		 for(String newword: words)
    	    	{
    	    		if(n.containsKey(newword))
    	    		{
    	    			int no=n.get(newword);
    	    			n.put(newword,++no);
    	    		}
    	    		else
    	    			n.put(newword, 1);
    	    	}
    	}
    	
    System.out.println(n);
    	
        
    } catch (IOException ioException) {

        ioException.printStackTrace();
    }
}

    public static void main (String args[])
    {
        countWords();
        
    }
    
}
    