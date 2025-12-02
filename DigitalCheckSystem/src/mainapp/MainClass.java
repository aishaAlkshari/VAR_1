/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

/**
 *
 * @author aisha_alkshari
 */

import java.util.Scanner;
import usecase1_fillchecklist.*;
import usecase2_inspectionreport.*;
import usecase3_uploadphoto.*;
import usecase4_verifylocation.*;

public class MainClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Municipal Inspection System ");

        //VERIFY LOCATION 

        System.out.println("\n Verify Inspector Location");

        VerifyLocation locationChecker = new VerifyLocation();

        System.out.print("Enter inspector latitude: ");
        double inspectorLat = input.nextDouble();

        System.out.print("Enter inspector longitude: ");
        double inspectorLon = input.nextDouble();

        double officialLat = 21.5435;
        double officialLon = 39.1720;

        String locResult = locationChecker.checkLocation(inspectorLat, inspectorLon, officialLat, officialLon);
        System.out.println("Location Result: " + locResult);

        if (!locResult.equals("Location Verified")) {
            System.out.println("System: Location mismatch → cannot proceed.");
            return;
        }


        //FILL CHECKLIST

        System.out.println("\n Fill Checklist");

        Checklist checklist = new Checklist();
        checklist.addItem("Food cleanliness");
        checklist.addItem("Store license");
        checklist.addItem("Fire safety");

        System.out.println("Checklist Items:");
        checklist.showItems();



        //UPLOAD PHOTO

        System.out.println("\n Upload Photographic Evidence");

        input.nextLine(); //clear buffer
        System.out.print("Enter photo file name: ");
        String photoName = input.nextLine();

        usecase3_uploadphoto.ApplicationLayer photoApp = new usecase3_uploadphoto.ApplicationLayer();
        boolean uploaded = photoApp.uploadPhoto(photoName);

        if (uploaded) {
            System.out.println("Photo Upload: Success");
        } else {
            System.out.println("Photo Upload: Failed");
        }



        //GENERATE INSPECTION REPORT

        System.out.println("\n Generate Inspection Report");

        Database db = new Database();
        ReportGenerator generator = new ReportGenerator();
        ApplicationLayer app = new ApplicationLayer(db, generator);
        InspectorApp inspector = new InspectorApp(app);

        inspector.submitInspection(101);

        System.out.println("\n INSPECTION PROCESS COMPLETED SUCCESSFULLY");
    }
}