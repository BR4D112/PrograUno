package MODELS;

public class Time {
    public int hoursToSeconds(int hours){
        return hours*3600;
    }
    public int minutesToSeconds(int minutes){
        return minutes*60;
    }

    public int totalRest(int hoursToSeconds, int minutesToSeconds, int seconds, int secondaryHour, int secondaryMin, int secondarySeconds) {
        return (hoursToSeconds+minutesToSeconds+seconds)-(secondaryHour+secondaryMin+secondarySeconds);
    }
}
