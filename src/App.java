public class App {


    public static void main(String[] args) throws Exception {
        
        EntriesArray ea = new EntriesArray();
        FileReaderSystem frs = new FileReaderSystem("/home/w/Documents/coding/JAVA/12_LAB/zip.txt"); 
        FileParserSystem fps = new FileParserSystem(frs.getFileReader(), ea);
        EntriesArrayParser eap = new EntriesArrayParser(ea);
        fps.parseEntries();
        System.out.println(eap.findCityData("ghghghghg, ma"));
    }
}
