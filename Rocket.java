/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
public class Rocket {
    private String stage;
    private int fuel;
    private int altitude;
    private int speed;

    public Rocket() {
        stage = "Pre-Launch";
        fuel = 100;
        altitude = 0;
        speed = 0;
    }

    // Getters and setters for the attributes

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

   public void launchSequence() {
        // ... existing code ...

        // Simulate the mission
        while (altitude < 200 && fuel > 0) {
            // Update rocket status
            altitude += speed;
            fuel -= 10;
            speed += 100;

            // Display real-time updates
            System.out.println("Stage: " + stage + ", Fuel: " + fuel + "%, Altitude: " + altitude + " km, Speed: " + speed + " km/h");

            // Check for stage separation
            if (altitude >= 100 && stage.equals("Stage 1")) {
                stage = "Stage 2";
                System.out.println("Stage 1 complete. Separating stage. Entering Stage 2.");
            }
        }

        // Check mission outcome
        if (altitude >= 200) {
            System.out.println("Orbit achieved! Mission Successful.");
        } else {
            System.out.println("Mission Failed due to insufficient fuel.");
        }
    }
}