class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int input) {
        int squareOfSumResult = 0;

        do {
            squareOfSumResult += input;
            input--;
        } while (input > 0);

        return (int)Math.pow(squareOfSumResult, 2);
    }
    
    public int computeSumOfSquaresTo(int input) {
        int sumOfSquareResult = 0;

        do {
            sumOfSquareResult += (int)Math.pow(input, 2);
            input--;
        } while (input > 0);

        return sumOfSquareResult;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
