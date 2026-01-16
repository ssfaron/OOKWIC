import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Shifter {

    public static List<String> circularlyShift(String filteredTitle){

        // break filtered title up into keywords
        String[] keywords = filteredTitle.split(" ");
        int keywordCount = keywords.length;

        // for each word in filtered title, circularly shift line
        // note: # of times needed to shift each title = # words in that title
        List<String> shiftedTitles = new ArrayList<String>();
        for(int i = 0; i < keywordCount-1; i++){
            String keywordToShift = keywords[0];
            //String[] keywordsToStay = Arrays.copyOfRange(keywords, 1, keywords.length);
            String keywordsToStay = filteredTitle.replace(keywords[0]+" ", "");
            String shiftedTitle = keywordsToStay + " " + keywordToShift;
            shiftedTitles.add(shiftedTitle);
        }

        // output: list of shifted lines
        return shiftedTitles;
    }
}