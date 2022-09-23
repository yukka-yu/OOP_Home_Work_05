package home5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Presentor presentor = new Presentor(new View());
        presentor.Button();
    }
}