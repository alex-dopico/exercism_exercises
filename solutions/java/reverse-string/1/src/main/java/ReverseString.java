class ReverseString {
    private String reversed;
    
    String reverse(String inputString) {
        int counter = inputString.length() - 1;
        reversed = "";
        
        while (counter >= 0) {
            reversed += inputString.charAt(counter);
            counter--;
        }
        
        return reversed;
    }
}
