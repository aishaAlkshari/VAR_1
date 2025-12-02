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
public class InspectionReport {

    public static void main(String[] args) {
        Database db = new Database();
        ReportGenerator generator = new ReportGenerator();
        ApplicationLayer app = new ApplicationLayer(db, generator);
        InspectorApp inspector = new InspectorApp(app);

        inspector.submitInspection(101); 
    }
    
}