package View;

import java.awt.event.ActionListener;

import Controller.AbstractController;
import DAO.AbstractDAO;
import Model.Benutzer;

public abstract class AbstractView implements ActionListener {
    private AbstractController controller;
    private Benutzer benutzer;
    private AbstractDAO dao;
}
