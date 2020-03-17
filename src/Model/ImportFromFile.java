package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportFromFile {
    //postnr(0),by(1),kortnavn(2),væsensnavn(3),adresse(4),latitude(5),bibliotekstype(6),id(7),longitude(8),navn(9)
    //2750,Ballerup,Ballerup Bibliotek,Ballerup Bibliotekerne,Banegårdspladsen 1,55.729601,Folkebibliotek,715100,12.359601,Ballerup Bibliotek

    ArrayList<Library> libs = new ArrayList<>();

    public ArrayList<Library> importLibarysFromFile(String filePath) throws FileNotFoundException {
        File fh = new File(filePath);
        int numberofLibs = 0;
        if (fh.exists()) {
            Scanner file = new Scanner(fh);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] lineArr = line.split(",");
                try {
                    Library tmpLib = new Library(Double.parseDouble(lineArr[7]),
                            Double.parseDouble(lineArr[0]), Double.parseDouble(lineArr[5]), Double.parseDouble(lineArr[8]),
                                                lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[6], lineArr[9]);

                    libs.add(tmpLib);

                    numberofLibs++;
                } catch (Exception e){
                    System.out.println("ERROR: " + e.toString());
                }
            }
        }
        return libs;
    }

}
