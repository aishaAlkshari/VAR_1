/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase2_fillchecklist;

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

    public void openChecklist() {
        System.out.println("Inspector opened checklist.");
        appLayer.requestChecklistItems();
    }

    public void fillAnswer(String answer) {
        System.out.println("Inspector filled answer: " + answer);
        appLayer.saveChecklistItem(answer);
    }
}
