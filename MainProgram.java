import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class MainProgram  {
    private static int secondsPassed = 0;

    public static void main(String[] args) {
        // Create a timer
        Timer timer = new Timer();

        // Create a TimerTask (you can implement your logic in this task)
        TimerTask simulationTask = new TimerTask() {
            @Override
            public void run() {
                secondsPassed++;

                // Your simulation logic goes here
                System.out.println("Timer" + formatTime(secondsPassed));

                // Check if the simulation has reached the desired duration (e.g., 10 minutes)
                if (secondsPassed >= TimeUnit.MINUTES.toSeconds(10)) {
                    System.out.println("Simulation completed.");
                    cancel(); // Stop the timer task
                    timer.cancel(); // Stop the timer
                }
            }
        };

        // Schedule the TimerTask to run every 100 milliseconds (adjust the delay and period as needed)
        timer.schedule(simulationTask, 0, 10); // 0 ms delay, 100 ms period (0.1 seconds)
    }

    private static String formatTime(int seconds) {
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) % 60;
        long remainingSeconds = seconds % 60;
    
        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}

