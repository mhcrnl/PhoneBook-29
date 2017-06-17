import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class PhoneBook {

    public static void main(String[] args) throws Exception {

        String line;											//create variable for keep one line of the csv file
        HashMap <String , String[]> h_map = new HashMap<>();	//create hashmap called h_map
		int count=0;											//get count to know how many lines are in the csv file

        try{

			//openeing a csv file
            BufferedReader br = new BufferedReader(new FileReader("contacts.csv"));

            while ((line = br.readLine()) != null) {			//read line by line in the csv file 
				
                String[] item = line.split(",");				// use comma as separator
				
                h_map.put(item[1], item);						//put firstname as key and item array as value in the hash map
                h_map.put(item[2], item);						//put lastname as key and details array as value in the hash map

				count++;										//increase count by one
            }

        }catch (FileNotFoundException e){						//catch block for catch exception
            System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }

        Scanner s_input = new Scanner(System.in);				//get input from user
		int i =0 , j=0;
		String[] key = new String[count]; 						//create array that have key value which are user inputs

       try{														//try block
           while(s_input.hasNext()){							//get key value until stop by user input
			key[i] = s_input.next();							//put user input to the ker arrray 
            i++;
        }
		
		for(j=0;j<i;j++){										//print details of the file
			System.out.println("First Name: " + h_map.get(key[j])[1] + "\n" + "Last Name: " + h_map.get(key[j])[2] + "\n"+
                       "Phone: " + h_map.get(key[j])[3] + "\n" + "Email: " + h_map.get(key[j])[4] + "\n" + "Company: " + h_map.get(key[j])[5]);
		}

       }catch(NullPointerException e){							//catch block
           System.out.println(e.toString());
       }catch(NoSuchElementException e){
           System.out.println(e.toString());
       }catch(Exception e){
           System.out.println(e.toString());
       }

    }

}
