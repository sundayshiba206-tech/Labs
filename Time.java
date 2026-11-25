//Sunday Shiba
//EDU/LIS/24/098
//Library and Information Science
//TASK 2.4

/**
 * A simple class to convert a total number of seconds into hours, minutes, and seconds.
 */

public class Time {
    public static void main(String[] args) {
        int totalSeconds = 10000;

        int hours   = totalSeconds / 3600;            // whole hours
        int minutes = (totalSeconds % 3600) / 60;     // leftover → whole minutes
        int seconds = totalSeconds % 60;              // leftover seconds

        System.out.println(totalSeconds + " seconds = "
                + hours + " h " + minutes + " min " + seconds + " s");
    }
}
