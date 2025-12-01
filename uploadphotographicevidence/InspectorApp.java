package com.mycompany.uploadphotographicevidence;
import java.util.Scanner;

public class InspectorApp {
    public void selectPhoto(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter image name: ");
        String image = input.nextLine();
        
        ApplicationLayer app = new ApplicationLayer();
        boolean ok = app.uploadPhoto(image);
        if(ok){
            System.out.println("Upload Success!");
        } else{
            System.out.println("Upload Failed");
        }
    }
}
