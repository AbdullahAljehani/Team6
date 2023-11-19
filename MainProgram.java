import java.util.Timer;
import java.util.TimerTask;
import java.util.List;  

public class MainProgram {
    private static DeliveryDriver deliveryDriver;  
    private static int secondsPassed = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();
        
        FadingRectangle.launch(FadingRectangle.class, args);
        

       
        TimerTask simulationTask = new TimerTask() {
            @Override
            public void run() {
                secondsPassed++;

                
                System.out.println("Timer " + formatTime(secondsPassed));

               
                if (allDelivered()) {
                    System.out.println("All packages delivered. Simulation completed.");
                    timer.cancel();
                }
            }
        };

        
        timer.schedule(simulationTask, 0, 10); 
    }

  

    private static boolean allDelivered() {
        List<Package> packages = deliveryDriver.getPackages();

        for (Package aPackage : packages) {
            if (!aPackage.isDelivered) {
                return false; 
            }
        }
        return true; 
    }

    private static String formatTime(int seconds) {
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}
