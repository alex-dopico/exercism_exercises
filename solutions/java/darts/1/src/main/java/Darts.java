class Darts {
    private double x;
    private double y;

    public Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int score() {
        double radius = getRadius();

        if (radius > 10.0) {
            return 0;
        } else if (radius > 5.0 && radius <= 10.0) {
            return 1;
        } else if (radius > 1.0 && radius <= 5.0) {
            return 5;
        } else {
            return 10;
        }
    }
}
