package com.example.demo4;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class kanva extends Application {

    @Override
    public void start(Stage primaryStage) {
        ObservableList<Task> tasks = FXCollections.observableArrayList();
        TableView<Task> tableView = new TableView<>(tasks);


        TableColumn<Task, String> taskColumn = new TableColumn<>("Tâches");
        taskColumn.setCellValueFactory(cellData -> cellData.getValue().tacheNameProperty());
        taskColumn.setMinWidth(200);

        TableColumn<Task, Boolean> faireColumn = new TableColumn<>("À faire");
        faireColumn.setCellValueFactory(cellData -> cellData.getValue().toDoProperty());
        faireColumn.setCellFactory(CheckBoxTableCell.forTableColumn(faireColumn));
        faireColumn.setEditable(true);
        faireColumn.setMinWidth(100);

        TableColumn<Task, Boolean> coursColumn = new TableColumn<>("En cours");
        coursColumn.setCellValueFactory(cellData -> cellData.getValue().inProgressProperty());
        coursColumn.setCellFactory(CheckBoxTableCell.forTableColumn(coursColumn));
        coursColumn.setEditable(true);
        coursColumn.setMinWidth(100);


        TableColumn<Task, Boolean> termineColumn = new TableColumn<>("Terminé");
        termineColumn.setCellValueFactory(cellData -> cellData.getValue().doneProperty());
        termineColumn.setCellFactory(CheckBoxTableCell.forTableColumn(termineColumn));
        termineColumn.setEditable(true);
        termineColumn.setMinWidth(100);

        tableView.setEditable(true);

        tableView.getColumns().addAll(taskColumn, faireColumn, coursColumn, termineColumn);


        TextField taskField = new TextField();
        taskField.setPromptText("Nom de la tâche");

        Button addButton = new Button("Ajouter ligne");
        addButton.setOnAction(e -> {
            String taskName = taskField.getText();
            if (!taskName.isEmpty()) {
                tasks.add(new Task(taskName, false, false, false));
                taskField.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "écrire une tache!!!", ButtonType.OK);
                alert.showAndWait();
            }
        });

        VBox vbox = new VBox(10, tableView, taskField,addButton);

        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tableau d'évolution");
        primaryStage.show();
    }

    public static class Task {
        private final SimpleStringProperty taskName;
        private final SimpleBooleanProperty toDo;
        private final SimpleBooleanProperty inProgress;
        private final SimpleBooleanProperty done;

        public Task(String tacheName, boolean faire, boolean cours, boolean terminé) {
            this.taskName = new SimpleStringProperty(tacheName);
            this.toDo = new SimpleBooleanProperty(faire);
            this.inProgress = new SimpleBooleanProperty(cours);
            this.done = new SimpleBooleanProperty(terminé);
        }

        public String getTacheName() {
            return taskName.get();
        }

        public void setTacheName(String taskName) {
            this.taskName.set(taskName);
        }

        public SimpleStringProperty tacheNameProperty() {
            return taskName;
        }

        public boolean àfaire() {
            return toDo.get();
        }

        public void setfaire(boolean toDo) {
            this.toDo.set(toDo);
        }

        public SimpleBooleanProperty toDoProperty() {
            return toDo;
        }

        public boolean cours() {
            return inProgress.get();
        }

        public void setInProgress(boolean inProgress) {
            this.inProgress.set(inProgress);
        }

        public SimpleBooleanProperty inProgressProperty() {
            return inProgress;
        }

        public boolean isDone() {
            return done.get();
        }

        public void setDone(boolean done) {
            this.done.set(done);
        }

        public SimpleBooleanProperty doneProperty() {
            return done;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
