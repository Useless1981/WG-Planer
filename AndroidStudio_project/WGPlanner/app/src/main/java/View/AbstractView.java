package java.View;

import java.awt.event.ActionListener;

import java.Controller.AbstractController;
import java.DAO.AbstractDAO;
import java.Model.Benutzer;

public abstract class AbstractView implements ActionListener {
    private AbstractController controller;
    private Benutzer benutzer;
    private AbstractDAO dao;
}
