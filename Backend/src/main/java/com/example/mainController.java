package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class MainController implements Initializable {
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

    public void loadStudentsPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("studentsPane.fxml"));
            AnchorPane top10Pane = loader.load();
            sceneCarrier.getChildren().setAll(top10Pane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    public void loadTeachersPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("teachersPane.fxml"));
            AnchorPane top10Pane = loader.load();
            sceneCarrier.getChildren().setAll(top10Pane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    public void loadGroupsPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("groupsPane.fxml"));
            AnchorPane top10Pane = loader.load();
            sceneCarrier.getChildren().setAll(top10Pane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    public void loadTop10Pane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("top10Pane.fxml"));
            AnchorPane top10ParentPane = loader.load();
            Top10Controller top10Controller = loader.getController();
            top10ParentPane.prefWidthProperty().bind(sceneCarrier.widthProperty());
            top10ParentPane.prefHeightProperty().bind(sceneCarrier.heightProperty());
            top10Controller.setFlexibleWidths();
            sceneCarrier.getChildren().setAll(top10ParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    public void loadCreatorsPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("creatorsPane.fxml"));
            AnchorPane top10Pane = loader.load();
            sceneCarrier.getChildren().setAll(top10Pane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Side menu buttons flexibility
        sideMenu.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.23));
        studentsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        teachersButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        groupsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        top10Button.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        creatorsButton.prefWidthProperty().bind(sideMenu.prefWidthProperty().subtract(10));
        sideMenu.minWidthProperty().bind(mainPane.widthProperty().multiply(0.01).add(108));
        
        // Scene carrier flexibility
        sceneCarrier.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
        sceneCarrier.prefHeightProperty().bind(mainPane.heightProperty());
    }
}