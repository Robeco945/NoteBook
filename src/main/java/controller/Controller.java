package controller;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.*;
import view.GUI;
import javafx.fxml.FXML;

import java.util.Locale;

public class Controller {

    Map<String, String> notesKeyPair = new HashMap<>();
    @FXML
    private Button Add;
    @FXML
    private TextField Title;
    @FXML
    private TextArea Note;
    @FXML
    private ListView list;

    @FXML
    private void updateNote() {
        System.out.println("updateNote() called");
        String title = Title.getText();
        String note = Note.getText();
        notesKeyPair.put(title,note);
        System.out.println("Title: "+title);
        System.out.println("Note: "+note);
    }
    @FXML
    private void updateList() {
        list.getItems().add(notesKeyPair);
        System.out.println(list.getItems());
    }

    public static void main(String[] args) {
        GUI.launch(GUI.class);
    }
}
