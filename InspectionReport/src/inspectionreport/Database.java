
package inspectionreport;

public class Database {
    
    public void fetchInspectionData(int inspectionId) {
        System.out.println("Database: FetchInspectionData for inspection " + inspectionId);
    }

    public void saveReportRecord(int inspectionId) {
        System.out.println("Database: SaveReportRecord for inspection " + inspectionId);
        System.out.println("Database: Save successful");
    }
    
}
