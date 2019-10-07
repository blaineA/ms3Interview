import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;  


public class Main {  
    
 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub  
        connect.connect();
        String fileName="C:\\Users\\Blaine Adams\\Downloads\\ms3Interview.csv";  

        try {    
        BufferedReader br = new BufferedReader( new FileReader(fileName));    
            StringTokenizer st = null;    
            int lineNumber = 0, tokenNumber = 0;    

            while( (fileName = br.readLine()) != null)    
            {    

                if(lineNumber++ == 0)  
                   continue;                  

                //break comma separated line using ","    
                st = new StringTokenizer(fileName, ",");    

                while(st.hasMoreTokens())    
                {    
                    //display csv values    
                    tokenNumber++;    
                    System.out.print(st.nextToken() + '\t'); 
                }    

                //new line    
                System.out.println(" ");    

                //reset token number    
                tokenNumber = 0;  

            }
            
            System.out.println(lineNumber + "number of records recieved");
            System.out.println(lineNumber + "number of records sucessfull");
            System.out.println( "number of records failed");
            
        } catch (FileNotFoundException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();
        } catch (IOException e) {    
            // TODO Auto-generated catch block    
            e.printStackTrace();    
        }
        
    }
}
/**Having a hard time figuring out how to iterate through the csv data for this application
I established connection to the DB and created a table within the DB itself with the ten columns
* Then we need to get the data from the csv file itself
* Next, we need to find a way to iterate (for loop) through that data to find the errors
*       Do we check the null. Since I set the table up in the DB that the column cant be null.
*       If it hits a null we can add that to the counter.
*           Run into a problem if the entry is the wrong entry how do we check that.
*           Problem would hit in the last column. Not sure hot to resolve that. 
* Once we fine those errors we ++ to a counter for failed
* If row has no errors ++ to counter for successful
* Then restart till done. 
* Once we exit the loop we System print the counters.
**/
