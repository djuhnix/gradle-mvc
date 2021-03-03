package mvc;

import mvc.controller.Controller;
import mvc.model.Model;
import mvc.view.View;

public class MVC {
    public static void main(String[] args) {
        Controller controller = new Controller(
                new Model(),
                new View()
        );
        controller.run();
    }
}
