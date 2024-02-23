package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.AnchorPane;

public class StudentsController implements Initializable {
    @FXML
    AnchorPane studentsParentPane;
    @FXML
    Button addStudentButton;
    @FXML
    Button expelStudentButton;
    @FXML
    Button viewStudentsButton;
    @FXML
    VBox buttonsBox;
    @FXML
    Label nameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonsBox.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        addStudentButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        expelStudentButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        viewStudentsButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        nameLabel.prefWidthProperty().bind(studentsParentPane.widthProperty());
    }
}