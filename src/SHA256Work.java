import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Антон on 04.04.2014.
 */

public class SHA256Work {
    public static void main(String[] args) {
        String inputFileName;
        String outputFileName;
        if (args.length == 1) {
            inputFileName = args[0];
            outputFileName = null;
        }
        else if (args.length==2){
            inputFileName = args[0];
            outputFileName = args[1];
        }
        else{
            System.out.println("Illegal arguments. Call:  SHA256Work source_file target_file");
            return;
        }

        byte[] fileReplica=null;
        int fileSize;
        try (FileInputStream input = new FileInputStream(inputFileName)) {
            fileSize = input.read(fileReplica);
            if (fileSize==-1){
                System.out.println("File is empty");
                return;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
