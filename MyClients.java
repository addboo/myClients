
package myclients;

import java.util.Scanner; 
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errorsimport java.io.File; 

public class MyClients 
{
    public static void main(String[] args) 
    { 
        int c;
        
        do
        {
            c = menu();
            
            if(c == 1)
                newClient();
            if(c == 2)
                listClients();
            if(c == 3)
                deleteClient(); 
        }
        while(c != 4);
    }
    
    public static int menu()
    {
        System.out.println("MENU MyClients v.1");
        System.out.println("-------------------------");
        System.out.println("1. Εισαγωγή Πελάτη");
        System.out.println("2. Λίστα Πελατών");
        System.out.println("3. Διαγραφή Πελάτη");
        System.out.println("4. Έξοδος");
        System.out.println();
        System.out.print("Επιλογή: ");
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        
        return choice;
    }
    
    public static void newClient()
    {
        System.out.println("\nΕΙΣΑΓΩΓΗ ΝΕΟΥ ΠΕΛΑΤΗ");
        System.out.println("--------------------");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Όνομα : ");
        
        String first_name = in.nextLine();
        
        System.out.print("Επώνυμο : ");

        String last_name = in.nextLine();

        System.out.print("E-mail : ");

        String email = in.nextLine();
        
        
        try 
        {
          FileWriter myWriter = new FileWriter("myclients.csv");

          myWriter.write(first_name + ',' + last_name + ',' + email);
          myWriter.close();

          System.out.println("\n\nSuccessfully wrote to the file.\n\n");
        } 
        catch (IOException e) 
        {
          System.out.println("\n\nERROR: An error occurred.\n\n");
          e.printStackTrace();
        }

    }

    public static void listClients()
    {
        System.out.println("\n -Lists Clients \n");
    }
    
    public static void deleteClient()
    {
        System.out.println("\n -Delete Client \n");
    }
    
}
