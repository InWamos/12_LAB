import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSystem {

    private String pathToFile;

    public FileReaderSystem(String pathToFile) {

        this.pathToFile = pathToFile;

    }

    public BufferedReader getFileReader() {

        try {
            final BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            return reader;

        } catch ( IOException e ) {

            return null;

        }

    }

}
