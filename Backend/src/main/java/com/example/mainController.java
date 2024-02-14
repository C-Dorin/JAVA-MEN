package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class mainController implements Initializable {
    @FXML
    BorderPane mainPane;
    @FXML
    AnchorPane sceneCarrier;
    @FXML
    FlowPane sideMenu;
    @FXML
    Button studentsButton;
    @FXML
    Button teachersButton;
    @FXML
    Button groupsButton;
    @FXML
    Button top10Button;
    @FXML
    Button creatorsButton;

    public void loadStudentsPane(){}
    public void loadTeachersPane(){}
    public void loadGroupsPane(){}
    public void loadTop10Pane(){}
    public void loadCreatorsPane(){}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sideMenu.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.2));
        studentsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        teachersButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        groupsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        top10Button.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        creatorsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
    }
}