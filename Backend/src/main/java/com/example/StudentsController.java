package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

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
    @FXML
    TextArea viewArea;

    public void displayStudents(){
        viewArea.setText("Student#1: ");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonsBox.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        addStudentButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        expelStudentButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        viewStudentsButton.prefWidthProperty().bind(studentsParentPane.widthProperty().multiply(0.18));
        nameLabel.prefWidthProperty().bind(studentsParentPane.widthProperty());
    }
}