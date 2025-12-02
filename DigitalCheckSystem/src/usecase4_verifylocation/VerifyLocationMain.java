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
public class VerifyLocationMain {
    public static void main(String[] args) {
        ApplicationLayer app = new ApplicationLayer();
        InspectorApp inspector = new InspectorApp(app);
        inspector.verifyLocation();
    }
}
