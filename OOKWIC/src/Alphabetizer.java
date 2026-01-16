import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Alphabetizer {

    public static List sort(List<String> filteredTitles, List<String> allShiftedTitles) {

        // join the lists of filtered and shifted titles
        List<String> allProcessedTitles = new ArrayList<String>();
        allProcessedTitles.addAll(filteredTitles);
        allProcessedTitles.addAll(allShiftedTitles);

        // sort the list of all filtered+shifted titles in alphabetical order
        Collections.sort(allProcessedTitles);

        // output list of alphabetized lines
        return allProcessedTitles;
    }
}
