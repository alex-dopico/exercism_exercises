class MicroBlog {
    public String truncate(String input) {
        if (input.codePointCount(0, input.length()) < 6) {
            return input;
        } else {
            return input.substring(0, input.offsetByCodePoints(0, 5));
        }
    }
}
