import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Filter {

    public static String selectKeywords(String title, List<String> omissions){

        // break title up into words
        String[] splitTitle = title.split(" ");
        List<String> titleWords = new ArrayList<>(Arrays.asList(splitTitle));

        // remove insignificant words
        List<String> keyTitleWords = new ArrayList<String>();
        for(String word : titleWords){
            if(omissions.contains(word) || omissions.contains(word.toLowerCase())){
                continue;
            } else{
                keyTitleWords.add(word);
            }
        }

        String filteredTitle = String.join(" ", keyTitleWords);

        // return keywords
        return filteredTitle;
    }
}
