package com.example;

import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Top10Controller implements Initializable {
    @FXML
    AnchorPane top10ParentPane;
    @FXML
    TextField labelField;

    public void setFlexibleWidths() {
        this.labelField.prefWidthProperty().bind(top10ParentPane.widthProperty());
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelField.setEditable(false);
        labelField.setMouseTransparent(true);
    }
}
