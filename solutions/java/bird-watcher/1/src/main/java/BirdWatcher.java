
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int[] birdsOfTheWeek = getLastWeek();

        if (birdsOfTheWeek.length == 0) {
            return 0;
        } else {
            return birdsOfTheWeek[birdsOfTheWeek.length - 1];
        }
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length -1]++;
        
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount : getLastWeek()) {
            if (birdCount == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        int[] birdsPerDay = getLastWeek();
        int counter = (numberOfDays > 7 || numberOfDays < 0) ? birdsPerDay.length : numberOfDays;

        for (int i = 0; i < counter; i++) {
            result += birdsPerDay[i];
        }

        return result;
    }

    public int getBusyDays() {
        int busyDays = 0;
        int[] birdsPerDay = getLastWeek();

        for (int birdCount : birdsPerDay) {
            if (birdCount >= 5) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
