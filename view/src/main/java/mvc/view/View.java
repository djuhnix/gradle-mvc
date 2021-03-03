package mvc.view;

public class View implements IView {
    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
