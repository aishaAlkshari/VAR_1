package com.mycompany.uploadphotographicevidence;

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
