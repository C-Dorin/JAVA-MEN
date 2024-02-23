package com.example;

import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Top10Controller implements Initializable {
    @FXML
    AnchorPane top10ParentPane;
    @FXML
    Label nameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameLabel.prefWidthProperty().bind(top10ParentPane.widthProperty());
    }
}