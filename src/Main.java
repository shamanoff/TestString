import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String i = "Mark Gold going home";
        System.out.println(i.replace(" ", "%20"));

        String w = "Mark Gold going home";
        String tempW = w.toLowerCase();
        ArrayList<String[]> chars = new ArrayList<>();
        String [] words = tempW.split("\\s+");
        System.out.println(Arrays.toString(words));

    }
}
