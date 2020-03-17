import Model.*;

public class Main {

    public static void main(String[] args) {
        Controller view = new Controller();
        view.importLibs("Data/biblioteker-test.csv");

        System.out.println(view.lib);
    }
}
