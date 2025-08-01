class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String numberDigits = String.valueOf(numberToCheck);
        int resNumber = 0;

        for (char digit : numberDigits.toCharArray()) {
            int intDigit = digit - '0';
            resNumber += Math.pow(intDigit, numberDigits.length());
        }

        return numberToCheck == resNumber;
    }
}
