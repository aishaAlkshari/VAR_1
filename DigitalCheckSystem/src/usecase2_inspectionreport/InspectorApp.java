/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase2_inspectionreport;

/**
 *
 * @author aisha_alkshari
 */
public class InspectorApp {
    private final ApplicationLayer appLayer;

    public InspectorApp(ApplicationLayer appLayer) {
        this.appLayer = appLayer;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    public void submitInspection(int inspectionId) {
        System.out.println("Inspector: submitting inspection " + inspectionId);
        appLayer.requestReportGeneration(inspectionId);
    }
    
}