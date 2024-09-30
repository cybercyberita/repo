package Lab2;

import javax.security.auth.kerberos.KerberosKey;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox 
{

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button helloButton;
	Button howdyButton;
	Button chineseButton;
	Button clearButton;
	Button exitButton;

	Label feedbackLabel;

	TextField tf;

	HBox box1;
	HBox box2;


	//student Task #4:
	//  declare an instance of 
	DataManager mainManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() 
	{
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 helloButton = new Button("Hello");
		 howdyButton = new Button("Howdy");
		 chineseButton = new Button("Chinese");
		 clearButton = new Button("Clear");
		 exitButton = new Button("Exit");

		 feedbackLabel = new Label();

		 tf = new TextField();

		//  instantiate the HBoxes
		 box1 = new HBox();
		 box2 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		mainManager = new DataManager();

		//student Task #3:
		//  add the buttons to the other HBox
		box1.getChildren().addAll(helloButton, howdyButton, chineseButton, clearButton, exitButton);
		//  add the label and textfield to one of the HBoxes
		box2.getChildren().addAll(feedbackLabel, tf);
		//  add the HBoxes to this FXMainPanel (a VBox)
		this.getChildren().addAll(box1, box2);

		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());

		Insets inset = new Insets(50);
		HBox.setMargin(helloButton, inset);
		HBox.setMargin(howdyButton, inset);
		HBox.setMargin(chineseButton, inset);
		HBox.setMargin(clearButton, inset);
		HBox.setMargin(exitButton, inset);

		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);

	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event) {
			if(event.getTarget().equals(helloButton)) {
				tf.setText(mainManager.getHello());
			} else if (event.getTarget().equals(howdyButton)) {
				tf.setText(mainManager.getHowdy());
			} else if (event.getTarget().equals(chineseButton)) {
				tf.setText(mainManager.getChinese());
			} else if (event.getTarget().equals(clearButton)) {
				tf.setText("");
			} else if (event.getTarget().equals(howdyButton)) {
				Platform.exit();
				System.exit(0);
			} 
		}
	}
}
	
