import Model.Controller;

public class Main {

    public static void main(String[] args) {
        Controller view = new Controller();
        //Filter format:
        // xxxx-xxxx
        // Ex. 4000-4600
        //view.importLibs("Data/bibliotek2.csv", "4000-4600");
        view.importLibs("Data/bibliotek2.csv","1000-9000");

        System.out.println(view.lib);
    }
}
