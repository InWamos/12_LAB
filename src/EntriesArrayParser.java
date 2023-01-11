public class EntriesArrayParser {
    private EntriesArray ea;

    public EntriesArrayParser(EntriesArray ea) {
        this.ea = ea;
    }

    public String findCityData(String cityName) {

        String[] queryParsed = cityName.trim().split(", ");
        Object[] eaValues = ea.getEntriesArray();
        
        for(int i = 0; i < eaValues.length; i++) {
            
            if(
                String.valueOf(eaValues[i])
                .toLowerCase()
                .startsWith(queryParsed[0].toLowerCase())
                && String.valueOf(eaValues[i + 1])
                .toLowerCase()
                .startsWith(queryParsed[1].toLowerCase())
                ) {

                return(
                    "City found!"
                    + "\nTown: " + String.valueOf(eaValues[i]).trim() + ", " + String.valueOf(eaValues[i + 1])
                    + ", " + String.valueOf(eaValues[i - 1])
                    + " (Area Code: " + String.valueOf(eaValues[i + 2])
                    + ", Time Zone: " + String.valueOf(eaValues[i + 4])
                    + "\nCounty: " + String.valueOf(eaValues[i + 3]).trim()
                    + ", population " + String.valueOf(eaValues[i + 5]));

            }
        }
        return "No such city";
    }
}
