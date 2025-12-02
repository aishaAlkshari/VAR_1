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

public class ApplicationLayer {
    FillStorage storage = new FillStorage();
    Database db = new Database();
    
    public boolean uploadPhoto(String name){
        String link = storage.storeFile(name);
        return db.recordSavePhoto(link);
        
    }

    
}