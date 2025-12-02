/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase3_uploadphoto;

/**
 *
 * @author aisha_alkshari
 */
import java.io.FileWriter;
import java.io.IOException;

public class Database {
    
    public boolean recordSavePhoto(String photoURL){
        
        try{
            FileWriter writer = new FileWriter("photo_records.txt", true);
            writer.write("Saved photo: " +photoURL + "\n");
            writer.close();
            return true;
            
        } catch (IOException e){
            return false;
        }
    }  
}
