import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SqueakyClean {
    public static String clean(String identifier) {
        String base = identifier.replaceAll("\\s", "_");
        StringBuilder sb = new StringBuilder();

        Matcher matcher = Pattern.compile("-(\\w)").matcher(base);

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }

        matcher.appendTail(sb);
        
        String base_2 = sb.toString();
        String res = base_2.replaceAll("4", "a")
            .replaceAll("3", "e")
            .replaceAll("0", "o")
            .replaceAll("1", "l")
            .replaceAll("7", "t")
            .replaceAll("[^a-zA-Z_]", "");

        return res;
    }
}