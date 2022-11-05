

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import java.io.IOException;


public class GUI extends Application{
@Override
        public void start(Stage stage) throws IOException{
    //labels
    Label FirstLine;
    Label SecondLine;
    Button Confirm;
    Button Back;
    GridPane grid = new GridPane();
    Scene scene = new Scene(grid,1550,750);

    FirstLine = new Label("President");
    SecondLine = new Label("Choose: ");
    Confirm= new Button("Confirm");
    Back= new Button("Back");

    grid.addColumn(0,Back);
    grid.setHgap(10);
    grid.addColumn(1);
    grid.addColumn(2,Confirm);
    grid.setGridLinesVisible(true);

    stage.setScene(scene);
    stage.setTitle("Voting Machine");
    stage.show();

}


}
