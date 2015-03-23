/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientFunc;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author 竹子
 */
public class addPatient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println("1");
           Scanner scanIn = new Scanner(System.in);
            String name = scanIn.nextLine();
            String ID = scanIn.nextLine();
            int id = Integer.parseInt(ID);
            String username = scanIn.nextLine();
            String pswd = scanIn.nextLine();
            String gender = scanIn.nextLine();
            addpatientfunc add = new addpatientfunc();
            add.addPerson(name,id, username, pswd, gender);
            add.close();
        }catch(Exception e)
        {
            
        }

    }
    
}
