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
public class UploadPhotographicEvidence {

    public static void main(String[] args) {
        ApplicationLayer appLayer = new ApplicationLayer();
        InspectorApp inspector = new InspectorApp(appLayer);
        inspector.selectPhoto();
    }
}