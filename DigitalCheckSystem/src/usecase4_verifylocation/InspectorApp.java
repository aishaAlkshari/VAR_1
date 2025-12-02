/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase4_verifylocation;

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

    public void verifyLocation() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter inspector latitude: ");
        double lat = input.nextDouble();

        System.out.print("Enter inspector longitude: ");
        double lon = input.nextDouble();

        String result = app.verify(lat, lon);

        System.out.println("Result: " + result);
    }
}