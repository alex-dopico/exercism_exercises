public class Lasagna {
    private final int MINUTES_IN_OVEN = 40;
    
    public int expectedMinutesInOven() {
        return this.MINUTES_IN_OVEN;
    };

    public int remainingMinutesInOven(int minutesSpentInOven) {
        return expectedMinutesInOven() - minutesSpentInOven;
    };
    
    public int preparationTimeInMinutes(int numberOfLayers) {
        return 2 * numberOfLayers;
    };
    
    public int totalTimeInMinutes(int numberOfLayers, int minutesSpentInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesSpentInOven;
    };
}
