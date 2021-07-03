package Stream.VehicleOwner.Person;

public class ReadFromCSVFile {

    /*

      public static void main(String[] args) throws IOException {

        ArrayList<Person> allPersons = new ArrayList<Person>();

        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader("./src/main/java/Files/testCSV.csv");
            br = new BufferedReader(fr);

            String textLine;
            int counter = 0;
            while ((textLine = br.readLine()) != null){
                counter++;
                if(counter == 1){
                    continue;
                }

                String[] personData = textLine.split(";");
                Person x = new Person(Integer.parseInt(personData[2]), personData[0], personData[1] );
                allPersons.add(x);
                System.out.println(textLine);
            }
        } catch (Exception exc) {
            System.out.println(String.format("Ivyko klaida: %s", exc.getMessage()));
        } finally {
            br.close();
        }
    }
}
     */
}
