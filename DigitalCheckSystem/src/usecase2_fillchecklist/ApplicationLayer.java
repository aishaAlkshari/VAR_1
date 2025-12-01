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
public class ApplicationLayer {
    private final Database db;

    public ApplicationLayer(Database db) {
        this.db = db;
    }

    public void requestChecklistItems() {
        System.out.println("Application Layer requesting checklist items...");
        db.fetchChecklistTemplate();
    }

    public void displayChecklist() {
        System.out.println("Checklist is displayed to inspector.");
    }

    public void saveChecklistItem(String answer) {
        System.out.println("Saving checklist item...");
        db.updateChecklistRecord(answer);
    }
}

