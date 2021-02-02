package ir.ac.kntu;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.paint.Color;

import model.*;
import view.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static javafx.scene.paint.Color.*;

public class Main extends Thread implements Runnable {
    public static long totalMoney=100;
    public static String []arg;
    public static ArrayList<SelectedSolider> selectedSoliders =new ArrayList<>();

    public static SelectedSolider selectedSolider8 =new SelectedSolider("Archer",4500,4500,2,1);
    public static SelectedSolider selectedSolider9 =new SelectedSolider("Knight",4500,1800,2,3);
    public static SelectedSolider selectedSolider10 =new SelectedSolider("Shield",4500,4500,2,4);
    public static SelectedSolider selectedSolider11 =new SelectedSolider("Goblin",4200,4000,2,1);

    public static ArrayList<Players> players =new ArrayList<>();
    public static V v =new V(6000);
    public static C container=new C(3000);
    public static Temp temp =new Temp(5000);



    public static void main(String args[]) {
        try {
            MySocket.run();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
//        @Override
//        public void start(Stage primaryStage) {
//            initSet(primaryStage);
//            primaryStage.setTitle("Castle Defender");
//            primaryStage.show();
//        }
        arg=args;
        //selectedSoliders.add(ourSolider7);
        selectedSoliders.add(selectedSolider8);
        selectedSoliders.add(selectedSolider9);
        selectedSoliders.add(selectedSolider10);
        //selectedSoliders.add(ourSolider5);selectedSoliders.add(ourSolider6);selectedSoliders.add(ourSolider7);selectedSoliders.add(selectedSolider8);selectedSoliders.add(selectedSolider9);selectedSoliders.add(selectedSolider10);
        selectedSoliders.add(selectedSolider11);
        //selectedSoliders.add(ourSolider12);
        players.add(v);
        players.add(container);
        players.add(temp);
        View.main();
    }
    public static void setLabelToOurSolider() throws FileNotFoundException {

        Image ImageOfArcher=new Image(new FileInputStream("./src/main/java/newArcher.jpg"));
        ImageView imageViewArcher=new ImageView(ImageOfArcher);
        imageViewArcher.setFitHeight(80);
        imageViewArcher.setFitWidth(85);
        Label ArcherName=new Label("Archer",imageViewArcher);
        ArcherName.setFont(Font.font(25));
        ArcherName.setTextFill(Color.YELLOW);
        Main.selectedSolider8.setLabel(ArcherName);

        Image ImageOfKnight=new Image(new FileInputStream("./src/main/java/knight.jpg"));
        ImageView imageViewOfKnight=new ImageView(ImageOfKnight);
        imageViewOfKnight.setFitHeight(80);
        imageViewOfKnight.setFitWidth(95);
        Label KnightName=new Label("Knight",imageViewOfKnight);
        KnightName.setFont(Font.font(25));
        KnightName.setTextFill(Color.YELLOW);
        Main.selectedSolider9.setLabel(KnightName);

        Image ImageOfShield=new Image(new FileInputStream("./src/main/java/Shield1.jpg"));
        ImageView imageViewOfShield=new ImageView(ImageOfShield);
        Label ShieldName=new Label("Shield",imageViewOfShield);
        ShieldName.setFont(Font.font(25));
        ShieldName.setTextFill(Color.YELLOW);
        Main.selectedSolider10.setLabel(ShieldName);

        Image ImageOfGoblin=new Image(new FileInputStream("./src/main/java/goblin.jpg"));
        ImageView imageViewOfGoblin=new ImageView(ImageOfGoblin);
        Label GoblinName=new Label("Goblin",imageViewOfGoblin);
        GoblinName.setTextFill(Color.YELLOW);
        GoblinName.setFont(Font.font(25));

        Main.selectedSolider11.setLabel(GoblinName);
    }

    public static void setLabelToStudding() throws FileNotFoundException{
        Image image1=new Image(new FileInputStream("./src/main/java/AllSoldoers.jpg"));
        ImageView imageView1=new ImageView(image1);
        imageView1.setFitWidth(700);
        imageView1.setFitHeight(300);

        imageView1.setX(60);
        imageView1.setY(50);
        Label contLabel=new Label("                                              Archer\n" +
                "                                                                   Energy : 15\n" +
                "                                                             Health : 300\n" +
                "                                                             Speed : 1\n" +
                "                                                             Damage : 200\n" +
                "                                                               Range : 2",imageView1);
        contLabel.setFont(Font.font("Cambria" , 30));
        contLabel.setTranslateX(-10);
        contLabel.setTranslateX(20);
        contLabel.setTextFill(WHITE);
        Main.container.setLabel(contLabel);

        Image image2=new Image(new FileInputStream("./src/main/java/newShield.jpg"));
        ImageView imageView2=new ImageView(image2);

        imageView2.setFitWidth(116);
        imageView2.setFitHeight(180);

        Label truckLabel=new Label("Knight\n" +
                "Energy : 30\n" +
                "Health : 600\n" +
                "Speed : 2\n" +
                "Damage : 400\n" +
                "Range : 1",imageView2);
        truckLabel.setFont(Font.font("Cambria" , 30));
        truckLabel.setTextFill(WHITE);
        Main.temp.setLabel(truckLabel);


        Image image3=new Image(new FileInputStream("./src/main/java/goblin.jpg"));
        ImageView imageView3=new ImageView(image3);
        imageView3.setX(30);
        imageView3.setY(50);
        Label vanLabel=new Label("V",imageView3);
        Main.v.setLabel(vanLabel);
    }
    //****************Main Thread*****************************************////

//    public void gameThread(Stage stage) {
//        Thread thread = new Thread(() -> {
//            while(player1.getLives() != 0 && player2.getLives() != 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (Exception e){
//                    System.out.println(e);
//                }
//            }
//            Platform.runLater(() -> {
//                BorderPane pane = new BorderPane();
//                VBox box = new VBox(10);
//                Scene scene = new Scene(pane,500, 500);
//                Label label;
//                if(player1.getLives()!=0) {
//                    label = new Label(player1.getName()+" win! ");
//                }
//                else {
//                    label = new Label(player2.getName() + " win! ");
//                }
//                Button button = new Button(" return ");
//                box.getChildren().addAll(label, button);
//                box.setAlignment(Pos.CENTER);
//                pane.setCenter(box);
//                try {
//                    Thread.sleep(2000);
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//                stage.setScene(scene);
//                stage.centerOnScreen();
//                button.setOnAction(event -> initSet(stage));
//            });
//        });
//        thread.start();
//    }
}
