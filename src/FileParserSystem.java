import java.io.BufferedReader;
import java.io.IOException;

public class FileParserSystem {
    
    
    private BufferedReader reader;
    private EntriesArray entriesArray;

    public FileParserSystem(BufferedReader reader, EntriesArray entriesArray) {

        this.reader = reader;
        this.entriesArray = entriesArray;

    }

    private String[] parseLine(String lineToParse) {

        String[] parsedLine;
        lineToParse = lineToParse.trim();
        parsedLine = new String[lineToParse.split(",").length];
        
        for(int i = 0; i < parsedLine.length; i++) {
            if(i == 4 || i == 7 || i == 8) continue;
            parsedLine[i] = lineToParse.split(",")[i];
        }

        return parsedLine;
    }

    public EntriesArray parseEntries() {

        String line;
        String[] parsedLine;
        try {

            while((line = reader.readLine()) != null) {

                parsedLine = parseLine(line);

                for(String element : parsedLine) {

                    if(element != null) {
                        entriesArray.add(element);
                    }
                    
                }

            }

            reader.close();
            return entriesArray;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
