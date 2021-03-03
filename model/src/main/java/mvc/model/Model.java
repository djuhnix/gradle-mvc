package mvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel {
    protected static final String FILE = "message.txt";
    @Override
    public String getMessage() {
        String path = Model.class.getResource(FILE).getFile();

        try(BufferedReader br = new BufferedReader(
                new FileReader(path)
        )) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR: " + e.getMessage();
        }
    }
}
