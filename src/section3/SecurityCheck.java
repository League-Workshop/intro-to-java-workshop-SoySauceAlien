package section3;

import java.nio.file.Files;

import javax.swing.JOptionPane;

public class SecurityCheck {
public static void main(String[] args) {
JOptionPane.showInputDialog( "[WARNING] Verifcation Is Required. Enter Your ID Code [WARNING]");
JOptionPane.showConfirmDialog(null, "Welcome User");
String Answer=JOptionPane.showInputDialog(null, "WARNING. You are entering Classifed Files.Do you wish to proceed? Type Yes or No");
if(Answer.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Enterering Files.This will take a moment.");

}

else {
JOptionPane.showMessageDialog(null, "Exiting User");
}


}



}





