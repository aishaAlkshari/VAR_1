
package verifylocation;

import java.util.Scanner;

/**
 *
 * @author noma
 */
public class VerifyLocation {

    /**
     * @param args the command line arguments
     */
  
    public String checkLocation(double inspectorLat, double inspectorLon, double officialLat, double officialLon){

        double differenceLat = Math.abs(inspectorLat - officialLat);
        double differenceLon = Math.abs(inspectorLon - officialLon);

        if (differenceLat < 0.01 && differenceLon < 0.01){
            return "Location Verified";
        } 
        else{
            return "Location Mismatch";
        }
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        VerifyLocation v = new VerifyLocation();

        System.out.print("Enter inspector latitude: ");
        double inspectorLat = input.nextDouble();

        System.out.print("Enter inspector longitude: ");
        double inspectorLon = input.nextDouble();

        double officialLat = 21.5435;
        double officialLon = 39.1720;

        String result = v.checkLocation(inspectorLat, inspectorLon, officialLat, officialLon);

        System.out.println("\nResult: " + result);
    }
    
}
