/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        orientation = null;
        solarPanelsActive = false;
        dataCollected = 0;
    }

    public void rotate(String direction) {
        orientation = direction;
    }

    public void activatePanels() {
        solarPanelsActive = true;
    }

    public void deactivatePanels() {
        solarPanelsActive = false;
    }

    public void collectData() {
        if (solarPanelsActive) {
            dataCollected += 10;
        }
    }

    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        satellite.rotate("South");
        satellite.activatePanels();
        satellite.collectData();
        System.out.println(satellite.dataCollected);  // Output: 10
    }
}