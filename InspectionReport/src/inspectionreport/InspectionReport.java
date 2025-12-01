
package inspectionreport;

/**
 *
 * @author saraa
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
