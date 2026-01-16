import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Filter {

    public static String selectKeywords(String title, List<String> omissions){

        // break title up into individual words
        String[] splitTitle = title.split(" ");
        List<String> titleWords = new ArrayList<>(Arrays.asList(splitTitle));

        // remove words in omissions list and keep keywords
        List<String> keyTitleWords = new ArrayList<String>();
        for(String word : titleWords){
            if(omissions.contains(word) || omissions.contains(word.toLowerCase())){
                continue;
            } else{
                keyTitleWords.add(word);
            }
        }

        // rejoin keywords into one string
        String filteredTitle = String.join(" ", keyTitleWords);

        // return keywords
        return filteredTitle;
    }
}
