package com.mycompany.uploadphotographicevidence;

public class ApplicationLayer {
    FileStorage storage = new FileStorage();
    Database db = new Database();
    
    public boolean uploadPhoto(String name){
        String link = storage.storeFile(name);
        return db.recordSavePhoto(link);
        
    }
}
