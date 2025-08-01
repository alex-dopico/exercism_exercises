class IsogramChecker {
    boolean isIsogram(String phrase) {
        String cleanPhrase = phrase.replace("-", " ")
            .replace(" ", "")
            .toLowerCase()
            .trim();

        for (int i = 0; i < cleanPhrase.length() - 1; i++) {
            String actualChar = Character.toString(cleanPhrase.charAt(i));
            
            if (cleanPhrase.substring(i+1).contains(actualChar)) {
                return false;
            }
        }

        return true;
    }
}
