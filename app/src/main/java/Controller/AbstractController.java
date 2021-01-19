package java.Controller;

import java.awt.event.ActionListener;

import java.Model.Benutzer;
import java.View.AbstractView;

public abstract class AbstractController implements ActionListener {
    private Benutzer benutzer;
    private AbstractView view;
}
