import java.io.File;
import java.util.*;

/**
 * Created by DarthVader on 13.09.2016.
 */
public class CreateFile {
    List<String> createdFile = new ArrayList<>(Arrays.asList("ccc", "ccc", "lll", "bbb", "bbb", "aaa", "aaa",
            "nnn", "jjj", "ddd", "ddd", "ppp", "ooo"));
    public void createNewFile(File inputFileName){
        for (int i = 0; i <= createdFile.size() - 1; i++) {
            FileWorker.write(inputFileName, createdFile.get(i) + '\r' + '\n');
        }
    }


}
