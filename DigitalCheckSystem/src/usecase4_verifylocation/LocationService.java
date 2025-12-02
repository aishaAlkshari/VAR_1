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
public class LocationService {

    public String checkLocation(double inspectorLat, double inspectorLon, 
                                double officialLat, double officialLon){

        double differenceLat = Math.abs(inspectorLat - officialLat);
        double differenceLon = Math.abs(inspectorLon - officialLon);

        if (differenceLat < 0.01 && differenceLon < 0.01){
            return "Location Verified";
        } 
        else{
            return "Location Mismatch";
        }
    }
}
