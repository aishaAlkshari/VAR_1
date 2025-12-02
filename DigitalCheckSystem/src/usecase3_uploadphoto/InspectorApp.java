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
import java.util.Scanner;

public class InspectorApp {

    private ApplicationLayer app;

    public InspectorApp(ApplicationLayer app) {
        this.app = app;
    }

    public void selectPhoto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter image name: ");
        String image = input.nextLine();

        boolean ok = app.uploadPhoto(image);

        if (ok) {
            System.out.println("Upload Success!");
        } else {
            System.out.println("Upload Failed");
        }
    }
}