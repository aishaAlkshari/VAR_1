
package inspectionreport;

/**
 *
 * @author saraa
 */
public class ApplicationLayer {
        private final Database db;
    private final ReportGenerator reportGenerator;

    public ApplicationLayer(Database db, ReportGenerator generator) {
        this.db = db;
        this.reportGenerator = generator;
    }

    public void requestReportGeneration(int inspectionId) {
        System.out.println("AppLayer: RequestReportGeneration");

        // Step 1: fetch inspection data
        db.fetchInspectionData(inspectionId);

        // Step 2: generate PDF
        reportGenerator.generatePDF(inspectionId);

        // Step 3: Save report
        db.saveReportRecord(inspectionId);

        // Step 4: respond back
        System.out.println("AppLayer: ReportSubmittedSuccessfully");
    }
}
