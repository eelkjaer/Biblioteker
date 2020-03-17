package Model;

import java.util.ArrayList;

public class Controller {
    public Controller(){}

    public ArrayList<Library> lib;

    public void importLibs(String filePath, String filter){
        ImportFromFile importFile = new ImportFromFile();

        try {
            lib = importFile.importLibarysFromFile(filePath, filter);
        } catch (Exception e){
            System.out.println("ERROR: " + e.toString());
        }
    }
}
