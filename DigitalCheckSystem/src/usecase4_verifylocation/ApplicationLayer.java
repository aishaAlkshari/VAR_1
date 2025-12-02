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
public class ApplicationLayer {

    private LocationService locator = new LocationService();

    public String verify(double inspectorLat, double inspectorLon){
        
        double officialLat = 21.5435;
        double officialLon = 39.1720;
        
        return locator.checkLocation(inspectorLat, inspectorLon, officialLat, officialLon);
    }
}