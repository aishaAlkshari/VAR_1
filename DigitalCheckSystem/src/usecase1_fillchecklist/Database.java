/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecase1_fillchecklist;

/**
 *
 * @author aisha_alkshari
 */
public class Database {
    
    public void fetchChecklistTemplate() {
        System.out.println("Database: fetching checklist template...");
        System.out.println("Database: returning checklist items...");
    }

    public void updateChecklistRecord(String answer) {
        System.out.println("Database: updating checklist record with answer: " + answer);
        System.out.println("Database: save success!");
    }
}
