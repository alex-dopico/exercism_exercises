public class LogLevels {
    public static String message(String logLine) {
        String[] logParts = logLine.split(":");
        return logParts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] logParts = logLine.split("]");
        return logParts[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine).concat(" (").concat(logLevel(logLine)).concat(")");
    }
}
