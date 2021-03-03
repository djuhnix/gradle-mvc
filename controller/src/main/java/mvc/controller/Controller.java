package mvc.controller;

import mvc.model.IModel;
import mvc.view.IView;

public class Controller {
    private final IModel model;
    private final IView view;

    public Controller(IModel model, IView view) {
        if (model == null) throw new NullPointerException("model is null");
        if (view == null) throw new NullPointerException("view is null");

        this.model = model;
        this.view = view;
    }

    public void run() {
        view.display(model.getMessage());
    }
}
