import java.util.List;
import java.util.ArrayList;

public class Controller {

    public static void main(String[] args){

        // handle inputs
        List<String> titles = new ArrayList<String>();
        List<String> omissions = new ArrayList<String>();

        // REMOVE THIS //
        titles.add("Of Mice and Men");
        titles.add("Great Expectations");
        titles.add("The Great Gatsby");

        omissions.add("of");
        omissions.add("and");
        omissions.add("the");
        // REMOVE THIS //

        // filter inputs
        Filter filter = new Filter();
        List<String> filteredTitles = new ArrayList<String>();
        for(String title : titles){
            String filteredTitle = filter.selectKeywords(title, omissions);
            filteredTitles.add(filteredTitle);
        }

        // shift inputs
        Shifter shifter = new Shifter();
        List<String> allShiftedTitles = new ArrayList<String>();
        for(String filteredTitle : filteredTitles){
            List<String> shiftedTitles = shifter.circularlyShift(filteredTitle);
            allShiftedTitles.addAll(shiftedTitles);
        }

        // alphabetize inputs
        Alphabetizer alphabetizer = new Alphabetizer();
        List<String> alphabetizedTitles = alphabetizer.sort(filteredTitles, allShiftedTitles);

        // output results
        for(String title : alphabetizedTitles){
            System.out.println(title);
        }
    }
}
