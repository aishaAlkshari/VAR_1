

package inspectionreport;


public class InspectorApp {
    private final ApplicationLayer appLayer;

    public InspectorApp(ApplicationLayer appLayer) {
        this.appLayer = appLayer;
    }

    public void submitInspection(int inspectionId) {
        System.out.println("Inspector: submitting inspection " + inspectionId);
        appLayer.requestReportGeneration(inspectionId);
    }
    
}
