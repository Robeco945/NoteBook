package controller;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.*;
import model.Note;
import model.Notebook;
import view.GUI;
import javafx.fxml.FXML;



public class Controller {

    private Notebook notebook = new Notebook();

    Map<String, String> notesKeyPair = new HashMap<>();
    @FXML
    private Button Add;
    @FXML
    private TextField Title;
    @FXML
    private TextArea Note;
    @FXML
    private ListView<Note> list;

    @FXML
    private void addNote() {
        String title = Title.getText();
        String content = Note.getText();

        if (title.isEmpty() || content.isEmpty()) {
            System.out.println("Title or content is empty!");
            return;
        }

        Note newNote = new Note(title, content);

        notebook.addNote(newNote);

        list.getItems().add(newNote);

        Title.clear();
        Note.clear();
    }
}
