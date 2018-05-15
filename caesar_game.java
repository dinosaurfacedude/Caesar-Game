//class name: CS 2 section 2
//Author: Daniel Jones
//IDE used: Jgrasp
//OS used: Windows 10
//Assignment #11
//last modified: 04/29/2018
//This program launches a window, asks the user to decifer a cypher,
//and opens a command prompt window that says if they succeeded or not.

import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class caesar_game extends Application {
   
   public static void main(String[] args){
  
  launch(args);
  }
  
  @Override
  public void start(Stage primaryStage){
  String thing = new String();
  Button button = new Button("Submit");
  button.setLayoutX(600);
  button.setLayoutY(500);
  Pane layout = new Pane();
  
   TextField field = new TextField();
   primaryStage.setTitle("secret message");
   Text instructions_2 = new Text(100, 40, "The top alphabet is the normal alphabet.");
   Text instructions_3 = new Text (100, 70,"The bottom is the encrypted alphabet.");
   Text instructions_4 = new Text (100, 100,"Look at the command line to see whether.");
   Text instructions_5 = new Text (100, 130,"your answer was correct or not.");
   Text instructions = new Text(75, 450, "Please enter your deciphered sentence into the text box.");
   Text alpha = new Text(75, 300, "a  b  c  d  e  f  g  h  i   j  k   l  m  n  o  p  q  r   s   t  u  v  w  x  y  z");
    Text code = new Text(75, 350, "e  f  g  h   i   j  k   l m  n  o  p  q  r  s  t   u  v   w   x  y  z  a  b  c  d");
   Text secret = new Text(110, 520, "xli geoi mw e pmi");
 
   code.setFont(Font.font(20));
   alpha.setFont(Font.font(20));
   secret.setFont(Font.font("Papyrus", 40));
   instructions.setFont(Font.font("Felix Titling", 20));
   instructions_2.setFont(Font.font("Felix Titling", 20));
   instructions_3.setFont(Font.font("Felix Titling", 20));
   instructions_4.setFont(Font.font("Felix Titling", 20));
   instructions_5.setFont(Font.font("Felix Titling", 20));
   String answer = new String();
   field.setLayoutX(400);
   field.setLayoutY(500);
  
   button.setOnAction(e -> {
   things(field);
  
  }
  );
   layout.getChildren().add(alpha);
   layout.getChildren().add(instructions_2);
   layout.getChildren().add(instructions_3);
   layout.getChildren().add(instructions_4);
   layout.getChildren().add(instructions_5);
   layout.getChildren().add(code);
   layout.getChildren().add(instructions);
   layout.getChildren().add(button);
   layout.getChildren().add(field);
   layout.getChildren().add(secret);
   Scene scene = new Scene(layout, 800, 700);
   primaryStage.setScene(scene);
   primaryStage.show();
  }
  
   public static void things(TextField field){
   String answer = new String();
   Scanner quitornot = new Scanner(System.in);
   int quitnum = 1;
  
   answer = field.getText();
  
  
   if(answer.equalsIgnoreCase("the cake is a lie")){
       System.out.println("message decoded.");
 }
   else{
   System.out.println("message decryption failed");
 }
 }
 }


