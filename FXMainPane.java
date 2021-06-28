import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class FXMainPane extends VBox

{

     public void start(Stage stage)

     {     

    	  //student Task #2:
    	  //  declare five buttons, a label, and a textfield
         Button b1 = new Button("Hello");
         Button b2 = new Button("Howdy");
         Button b3 = new Button("Chinese");
         Button b4 = new Button("Clear");
         Button b5 = new Button("Exit");

         Label l = new Label("FeedBack:");

         TextField t = new TextField();     

    	  //  declare two HBoxes
         HBox hb1=new HBox();
         HBox hb2=new HBox();    

    	  //student Task #4:
    	  //  declare an instance of DataManager
         DataManager m =new DataManager();

    	  /**
    	   * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
    	   * wait to add a component to its containing component until the container has
    	   * been created.  This is the only constraint on the order in which the following 
    		  * statements appear.
    	   */

     		//student Task #2:
     		//  instantiate the buttons, label, and textfield
         b1.setOnAction(new EventHandler<ActionEvent>()
         {
             @Override public void handle(ActionEvent ae)
             {        
                   t.setText(m.getHello());    
             }
         });

         b2.setOnAction(new EventHandler<ActionEvent>()
         {
             @Override public void handle(ActionEvent ae)
             {        
             t.setText(m.getHowdy());
             }
         });
         
         b3.setOnAction(new EventHandler<ActionEvent>()
         {
             @Override public void handle(ActionEvent ae)
             {
             t.setText(m.getChineese());
             }
         });

         b4.setOnAction(new EventHandler<ActionEvent>()
         {
             @Override public void handle(ActionEvent ae)
             {
             t.setText(" ");
             }
         });

         b5.setOnAction(new EventHandler<ActionEvent>()
         {
             @Override public void handle(ActionEvent ae)
             {        
             System.exit(0);
             }
         });
     		//  instantiate the HBoxes
         VBox vb =new VBox(50);
         vb.setAlignment(Pos.CENTER);
         Insets inset=new Insets(20, 20, 20, 20);

     		//student Task #4:
     		//  instantiate the DataManager instance
         vb.setSpacing(10);

     		//  set margins and set alignment of the components
         VBox.setMargin(t, new Insets(20, 20, 20, 20));
         VBox.setMargin(b1, new Insets(20, 20, 20, 20));
         VBox.setMargin(b2, new Insets(20, 20, 20, 20));
         VBox.setMargin(b3, new Insets(20, 20, 20, 20));
         VBox.setMargin(b4, new Insets(20, 20, 20, 20));
         VBox.setMargin(b5, new Insets(20, 20, 20, 20));

     		//student Task #3:
     		//  add the label and textfield to one of the HBoxes
         hb1.setAlignment(Pos.CENTER);
         hb1.getChildren().addAll(l,t,hb2);
         
     		//  add the buttons to the other HBox
         ObservableList<Node> listVal = vb.getChildren();
         listVal.addAll(t, b1,b2,b3,b4,b5,hb1);     

     		//  add the HBoxes to this FXMainPanel (a VBox)
          Scene scenes = new Scene(vb);
          stage.setScene(scenes);
          stage.show();
          
      	//Task #4:
      	//  create a private inner class to handle the button clicks

     }

}  