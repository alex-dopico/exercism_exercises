public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        switch (speed) {
            case 1,2,3,4:
                return 221 * speed;
            case 5,6,7,8:
                return (221 * speed) * 0.9;
            case 9:
                return (221 * 9) * 0.8;
            case 10:
                return (221 * 10) * 0.77;
            default:
                return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
