class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public int getBattery() {
        return this.battery;
    }

    public boolean batteryDrained() {
        if (this.battery < this.batteryDrain) {
            return true;
        } else {
            this.battery -= batteryDrain;
            return false;
        }
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) { this.distance += this.speed; }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);

        return nitro;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        float ratioBatteryTime = car.getBattery() / Float.valueOf(car.getBatteryDrain());
        float ratioDistanceSpeed = this.getDistance() / Float.valueOf(car.getSpeed());

        return ratioDistanceSpeed > ratioBatteryTime ? false : true;
    }
}
