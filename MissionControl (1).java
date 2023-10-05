/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import java.util.Scanner;

public class MissionControl {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        Satellite satellite = new Satellite();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Pre-launch checks
        System.out.println("Type start_checks to initiate system checks:");
        userInput = scanner.nextLine();
        if (userInput.equals("start_checks")) {
            System.out.println("System checks initiated...");
            // Perform system checks here
            System.out.println("System checks complete.");
        } else {
            System.out.println("Invalid input. Aborting mission.");
            return;
        }

        // Launch
        System.out.println("Type launch to begin the mission:");
        userInput = scanner.nextLine();
        if (userInput.equals("launch")) {
            System.out.println("Mission launched!");
            rocket.launchSequence();
        } else {
            System.out.println("Invalid input. Aborting mission.");
            return;
        }

        // Simulate the mission and display real-time updates
        while (true) {
            System.out.println("Type fast_forward X to advance the simulation by X seconds:");
            userInput = scanner.nextLine();

            if (userInput.startsWith("fast_forward")) {
                String[] inputParts = userInput.split(" ");
                int seconds = Integer.parseInt(inputParts[1]);

                // Simulate the mission for the specified number of seconds
                for (int i = 0; i < seconds; i++) {
                     rocket.setAltitude(rocket.getAltitude() + rocket.getSpeed());
            rocket.setFuel(rocket.getFuel() - 10);
            rocket.setSpeed(rocket.getSpeed() + 100);

            // Display real-time updates
            System.out.println("Stage: " + rocket.getStage() + ", Fuel: " + rocket.getFuel() + "%, Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h");

            // Check for stage separation
            if (rocket.getAltitude() >= 100 && rocket.getStage().equals("Stage 1")) {
                rocket.setStage("Stage 2");
                System.out.println("Stage 1 complete. Separating stage. Entering Stage 2.");
            }
                }

                // Display real-time updates
                System.out.println("Rocket status: Stage - " + rocket.getStage() + ", Fuel - " + rocket.getFuel() + "%, Altitude - " + rocket.getAltitude() + " km, Speed - " + rocket.getSpeed() + " km/h");
                System.out.println("Satellite status: ..."); // Add satellite status updates

            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}