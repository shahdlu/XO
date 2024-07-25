
package xo;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;


public class FXMLDocumentController implements Initializable {
    @FXML
    public Button b3;
    @FXML
    public Button b2;
    @FXML
    public Button b1;
    @FXML
    public Button b6;
    @FXML
    public Button b5;
    @FXML
    public Button b4;
    @FXML
    public Button b9;
    @FXML
    public Button b8;
    @FXML
    public Button b7;
    @FXML
    public Label label;
    public String check ;
    public boolean count = false;
    
    @FXML
    private AnchorPane pane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void b1action(ActionEvent event) { //button one action
       if ("".equals(b1.getText())){ // if the button text is empty
            if (wingame()== true)
                b1.setDisable(true);
            b1.setText("o"); // set text to o
           endgame();// check if it's the end or no

       } else {  
               label.setText(" already chosen ");
                label.setVisible(true);
              }
      
    }
    
    @FXML
    public void b3action(ActionEvent event) { // button three action
        if ("".equals(b3.getText())){
            if (wingame()== true)
                b3.setDisable(true);
            b3.setText("o");
            
            endgame();  
        } else {
                label.setText(" already chosen ");
                label.setVisible(true);
              }
    }
    @FXML
    public void b2action(ActionEvent event) {   // button two action
        if ("".equals(b2.getText())){
             if (wingame()== true)
                b2.setDisable(true);
            b2.setText("o");
        endgame();
       }  else {
                
                 label.setText(" already chosen ");
                 label.setVisible(true);
                }
    }

    @FXML
    public void b6action(ActionEvent event) {   // button six action
        if ("".equals(b6.getText())){
            wingame();
            b6.setText("o"); 
            endgame();
       } else {
                    label.setText(" already chosen ");
                    label.setVisible(true);
        }
    }

    @FXML
    public void b5action(ActionEvent event) {        // button five action
        if ("".equals(b5.getText())){
            wingame();
            b5.setText("o");
            endgame();
       } else {     
                    label.setText(" already chosen ");
                    label.setVisible(true);
                }
    }

    @FXML
    public void b4action(ActionEvent event){ // button four action
        if ("".equals(b4.getText())){
            wingame();
            b4.setText("o");
            endgame();
           } else {
                    label.setText(" already chosen ");
                    label.setVisible(true);
                }
    }

    @FXML
    public void b9action(ActionEvent event) { // button nine action
        if ("".equals(b9.getText())){
            wingame();
            b9.setText("o");
            endgame();
         } else {          
                    label.setText(" already chosen ");
                    label.setVisible(true);
                    }  
    }

    @FXML
    public void b8action(ActionEvent event) { // button eight action
        if ("".equals(b8.getText())){
            wingame();
            b8.setText("o");
            
            endgame();
       } else {
                    label.setText(" already chosen ");
                    label.setVisible(true);
                }
    }

    @FXML
    public void b7action(ActionEvent event) { // button seven action
        if ("".equals(b7.getText())){
            wingame();
            b7.setText("o");
            endgame();
       }  else {
                    label.setText(" already chosen ");
                    label.setVisible(true);
                }
    }

       public String computertrun () { // make random  button number to choose from 0:9 
        Random random = new Random();
        int btnnum = random.nextInt(10);
        if (btnnum !=0){ // except 0 
            String valueOf = String.valueOf(btnnum); // convert num to string
            check = "b"+ valueOf ;   //  to check if what button number want by computer
            }
            return check ; // return the name of button
        }
       
       
        public  void computerplay () {
            computertrun (); // call the random 
         
            switch (check){ 
                case "b1": 
                    if ("".equals(b1.getText())){
                        wingame();
                       b1.setText("x");
                       break;
                    }else {
                        endgame();
                        break;
                        
                     }
                case "b2":
                    if ("".equals(b2.getText())){
                        wingame();
                        b2.setText("x");
                        break;
                    }else {
                        endgame();
                        break;
                     }
                case "b3":
                    if ("".equals(b3.getText())){
                        wingame();
                        b3.setText("x");
                        break;
                    }else {
                        endgame();
                        break;
                     }
                case "b4":
                    if ("".equals(b4.getText())){
                        wingame();
                    b4.setText("x");
                    break;
                    }else {
                        endgame();
                        break;
                     }
                case "b5":
                    if ("".equals(b5.getText())){
                        wingame();
                    b5.setText("x"); 
                    break;
                    }else {
                        endgame();
                        break;
                    }
                case "b6":
                    if ("".equals(b6.getText())){
                    wingame();
                    b6.setText("x");
                    break;
                    }else {
                        endgame();
                        break;
                    }
                case "b7":        
                    if ("".equals(b7.getText())){
                    wingame();
                    b7.setText("x"); 
                    break;
                    }else {
                        endgame();
                        break;
                    }
                case "b8": 
                    if ("".equals(b8.getText())){
                    wingame();
                    b8.setText("x");
                    break;
                   }else {
                        endgame();
                        break;
                 }
                case "b9":         
                    if ("".equals(b9.getText())){
                       wingame();
                       b9.setText("x");
                       break;
                    }else {
                        endgame();
                        break;
                      }
                default: 
                    endgame();
           } 
       
             
        }
        
        
     public void endgame () { // check if there is any empty place ?
        if ("".equals(b1.getText()) || "".equals(b2.getText())|| "".equals(b3.getText()) || "".equals(b4.getText()) || 
             "".equals(b5.getText()) || "".equals(b6.getText()) || "".equals(b7.getText()) ||
             "".equals(b8.getText()) || "".equals(b9.getText())) {
                    computertrun();
                    computerplay();
                    wingame();
        }else { // there is no place then this an equal game 
                    b1.setDisable(true);
                    b2.setDisable(true);
                    b3.setDisable(true);
                    b4.setDisable(true);
                    b5.setDisable(true);
                    b6.setDisable(true);
                    b7.setDisable(true);
                    b8.setDisable(true);
                    b9.setDisable(true);

                    count = true ; // this is the end of game (comes one time )
                    if (count ==true){ 
                    label.setText(" game end ");
                    label.setVisible(true);
                    }else { // if the game continue after end once
                        JOptionPane.showMessageDialog(null," something went wrong");
                    }
             
             }
       
}
     
   public boolean wingame ()  { // check if there is 3 cells have the same value 
        if (b1.getText() == "x" && b2.getText() == "x" && b3.getText() == "x" ||b1.getText() == "x" && b4.getText() == "x" && b7.getText() == "x"
                || b1.getText() == "x" && b5.getText() == "x" && b9.getText() == "x" || b3.getText() == "x" && b5.getText() == "x" && b7.getText() == "x"
                || b3.getText() == "x" && b6.getText() == "x" && b9.getText() == "x" ||b7.getText() == "x" && b8.getText() == "x" && b9.getText() == "x"
                || b2.getText() == "x" && b5.getText() == "x" && b8.getText() == "x" ||b4.getText() == "x" && b5.getText() == "x" && b6.getText() == "x"){
                   label.setText(" computer Win "); // if the X always for computer
                   label.setVisible(true);
                    b1.setDisable(true);
                    b2.setDisable(true);
                    b3.setDisable(true);
                    b4.setDisable(true);
                    b5.setDisable(true);
                    b6.setDisable(true);
                    b7.setDisable(true);
                    b8.setDisable(true);
                    b9.setDisable(true);
                    return true ; // there is a winner 
   } else if (b1.getText() == "o" && b2.getText() == "o" && b3.getText() == "o" ||b1.getText() == "o" && b4.getText() == "o" && b7.getText() == "o"
                || b1.getText() == "o" && b5.getText() == "o" && b9.getText() == "o" || b3.getText() == "o" && b5.getText() == "o" && b7.getText() == "o"
                || b3.getText() == "o" && b6.getText() == "o" && b9.getText() == "o" ||b7.getText() == "o" && b8.getText() == "o" && b9.getText() == "o"
                || b2.getText() == "o" && b5.getText() == "o" && b8.getText() == "o" ||b4.getText() == "o" && b5.getText() == "o" && b6.getText() == "o"){
                   label.setText(" Winner  "); // if O always for player
                   label.setVisible(true);
                    b1.setDisable(true);
                    b2.setDisable(true);
                    b3.setDisable(true);
                    b4.setDisable(true);
                    b5.setDisable(true);
                    b6.setDisable(true);
                    b7.setDisable(true);
                    b8.setDisable(true);
                    b9.setDisable(true);
                   return true ;// there is a winner 
   } else
        return false ; // no winner yet
   } 
     
   
    
  


}
          
    
