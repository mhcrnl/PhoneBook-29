/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author mhcrnl
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Salut din Agenda Telefonica!");
        
        String csvFile = "contacts.csv";
        String line = "";
        String csvSplitBy = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while((line = br.readLine()) != null){
                //utilizarea virgulei ca separator
                String[] country = line.split(csvSplitBy);
                System.out.println("Nume:  "+country[1]+" "+country[2]);
                System.out.println("Nr.Tel:  "+country[3]+" Email: "+country[4]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Programul s-a executat cu succes!");
    }
    
}
