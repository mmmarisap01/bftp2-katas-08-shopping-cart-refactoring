public class Main {

    public static void main(String[] args) {

        StoreApplication storeApplication = new StoreApplication();

        boolean quit = false;

        while (!quit) {
            storeApplication.printInfoMessage();

            storeApplication.readCommand();

            if (storeApplication.isQuit()) {
                quit = true;
            }

        }
    }
}
