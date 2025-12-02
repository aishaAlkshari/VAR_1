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

public class FillStorage {

        
    public String storeFile (String imageName){
        
        String link = "http:/uploads/" + imageName;
        return link;
    }
    }
