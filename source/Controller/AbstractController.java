package Controller;

import java.awt.event.ActionListener;

import Model.Benutzer;
import View.AbstractView;

public abstract class AbstractController implements ActionListener {
    private Benutzer benutzer;
    private AbstractView view;
}
