import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by DarthVader on 13.09.2016.
 */
public class DuplicateFinderImpl implements DuplicateFinder {
    ProcessingFile pf = new ProcessingFile();

    public static void main(String[] args) {
        String inputFileName = "C://projects/Duplicates/Duplicates/1.txt";
        String outFileName = "C://projects/Duplicates/Duplicates/2.txt";
        CreateFile cf = new CreateFile();
        cf.createNewFile(new File(inputFileName));
        DuplicateFinder d = new DuplicateFinderImpl();
        d.process(new File(inputFileName), new File(outFileName));


    }

    public boolean process(File inputFileName, File outFileName) {
        try {
            pf.startProcessing(inputFileName);
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("false");
            return false;
        }
        FileWorker.write(outFileName, pf.toString());
//        System.out.println(pf);
        System.out.println("true");
        return true;
}
}
