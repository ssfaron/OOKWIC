import java.util.List;
import java.util.ArrayList;

public class Shifter {

    public static List<String> circularlyShift(String filteredTitle){

        // break filtered title up into individual keywords
        String[] keywords = filteredTitle.split(" ");
        int keywordCount = keywords.length;

        // for each word in filtered title, circularly shift line
        // note: # of times needed to shift each title = # keywords in that title
        List<String> shiftedTitles = new ArrayList<String>();
        for(int i = 0; i < keywordCount-1; i++){
            String keywordToShift = keywords[0];
            String keywordsToStay = filteredTitle.replace(keywords[0]+" ", "");
            String shiftedTitle = keywordsToStay + " " + keywordToShift;
            shiftedTitles.add(shiftedTitle);

            // make the shifted title the new starting point for the loop
            keywords = shiftedTitle.split(" ");
            filteredTitle = shiftedTitle;
        }

        // output list of shifted titles
        return shiftedTitles;
    }
}