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
public class Database {
    
    public void fetchInspectionData(int inspectionId) {
        System.out.println("Database: FetchInspectionData for inspection " + inspectionId);
    }

    public void saveReportRecord(int inspectionId) {
        System.out.println("Database: SaveReportRecord for inspection " + inspectionId);
        System.out.println("Database: Save successful");
    }
    
}