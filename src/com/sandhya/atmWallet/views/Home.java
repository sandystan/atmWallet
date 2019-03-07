package com.sandhya.atmWallet.views;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Home extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		Text logo = new Text("ATM Wallet");
		logo.setFont(new Font(25));
		logo.setFill(Color.BLUE);
		gridPane.add(logo, 2, 4);
		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
