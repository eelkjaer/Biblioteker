package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportFromFile {
    //postnr(0),by(1),kortnavn(2),væsensnavn(3),adresse(4),latitude(5),bibliotekstype(6),id(7),longitude(8),navn(9)
    //2750,Ballerup,Ballerup Bibliotek,Ballerup Bibliotekerne,Banegårdspladsen 1,55.729601,Folkebibliotek,715100,12.359601,Ballerup Bibliotek

    ArrayList<Library> libs = new ArrayList<>();

    public ArrayList<Library> importLibarysFromFile(String filePath, String filter) throws FileNotFoundException {
        File fh = new File(filePath);
        if (fh.exists()) {
            Scanner file = new Scanner(fh);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] lineArr = line.split(";");
                try {
                    Library tmpLib = new Library(Double.parseDouble(lineArr[7]),
                            Integer.parseInt(lineArr[0]), Double.parseDouble(lineArr[5]), Double.parseDouble(lineArr[8]),
                                                lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[6], lineArr[9]);



                    String tmpSplit[] = filter.split("-");
                    int[] postalSplit = {Integer.parseInt(tmpSplit[0]),Integer.parseInt(tmpSplit[1])};

                    if(filter != null && !filter.isEmpty()){
                        if (postalSplit[0] <= Integer.parseInt(lineArr[0]) && Integer.parseInt(lineArr[0]) <= postalSplit[1]) {
                            libs.add(tmpLib);
                        }
                    } else {
                        libs.add(tmpLib);
                    }
                } catch (Exception e){
                    System.out.println("ERROR: " + e.toString());
                }
            }
        }
        return libs;
    }

}
