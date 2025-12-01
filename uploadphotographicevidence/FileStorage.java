package com.mycompany.uploadphotographicevidence;

public class FileStorage {
    public String storeFile (String imageName){
        String link = "http:/uploads/" + imageName;
        return link;
    }
}
