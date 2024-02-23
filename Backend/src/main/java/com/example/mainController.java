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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("studentsScene.fxml"));
            AnchorPane studentsParentPane = loader.load();
            studentsParentPane.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
            studentsParentPane.prefHeightProperty().bind(mainPane.heightProperty());
            sceneCarrier.getChildren().setAll(studentsParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Students pane threw an unexpected error");
        }
    }

    public void loadTeachersPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("teachersScene.fxml"));
            AnchorPane teachersParentPane = loader.load();
            teachersParentPane.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
            teachersParentPane.prefHeightProperty().bind(mainPane.heightProperty());
            sceneCarrier.getChildren().setAll(teachersParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Teachers pane threw an unexpected error");
        }
    }

    public void loadGroupsPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("groupsScene.fxml"));
            AnchorPane groupsParentPane = loader.load();
            groupsParentPane.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
            groupsParentPane.prefHeightProperty().bind(mainPane.heightProperty());
            sceneCarrier.getChildren().setAll(groupsParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Groups pane threw an unexpected error");
        }
    }

    public void loadTop10Pane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("top10Scene.fxml"));
            AnchorPane top10ParentPane = loader.load();
            top10ParentPane.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
            top10ParentPane.prefHeightProperty().bind(mainPane.heightProperty());
            sceneCarrier.getChildren().setAll(top10ParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Top 10 pane threw an unexpected error");
        }
    }

    public void loadCreatorsPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("creatorsScene.fxml"));
            AnchorPane creatorsParentPane = loader.load();
            creatorsParentPane.prefWidthProperty().bind(mainPane.widthProperty().multiply(0.77));
            creatorsParentPane.prefHeightProperty().bind(mainPane.heightProperty());
            sceneCarrier.getChildren().setAll(creatorsParentPane);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Creators pane threw an unexpected error");
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