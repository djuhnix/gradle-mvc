package mvc.model;

import java.io.*;

public class Model implements IModel {
    protected static final String FILE = "message.txt";
    @Override
    public String getMessage() {
        InputStream inputFile = Model.class.getResourceAsStream(FILE);

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(inputFile)
        )) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR: " + e.getMessage();
        }
    }
}
