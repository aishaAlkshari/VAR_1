/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 *
 * @author aisha_alkshari
 */

import usecase2_fillchecklist.*;

public class MainSystem {
    
    public static void main(String[] args) {

        Database db = new Database();
        ApplicationLayer app = new ApplicationLayer(db);
        InspectorApp inspector = new InspectorApp(app);

        inspector.openChecklist();
        app.displayChecklist();
        inspector.fillAnswer("Yes");
    }
}
