package controller;

import ir.ac.kntu.Main;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.SelectedSolider;
import model.Players;
import view.Level1;
import view.View;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static javafx.scene.paint.Color.WHITE;


public class Controller {
    public static Stage runLevel1() throws FileNotFoundException {
        Stage stage=new Stage();
        Image backGround=new Image(new FileInputStream("./src/main/java/grass.jpg"));
        ImageView grass=new ImageView(backGround);
        grass.setX(0);
        grass.setY(0);
        grass.setFitHeight(700);
        grass.setFitWidth(1100);

        Image image=new Image(new FileInputStream("./src/main/java/firstLevelMenu.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0); imageView.setFitHeight(700);
        imageView.setFitWidth(1100);

        imageView.setPreserveRatio(true);
        Main.setLabelToOurSolider();

        Image tower1Image=new Image(new FileInputStream("./src/main/java/tower2.jpg"));
        ImageView imageViewTower1=new ImageView(tower1Image);
        imageViewTower1.setX(-100);
        imageViewTower1.setY(-100);

        Image tower2Image=new Image(new FileInputStream("./src/main/java/tower2.jpg")); //tower
        ImageView imageViewTower2=new ImageView(tower2Image);
        imageViewTower2.setX(-900);
        imageViewTower2.setY(100);


        ArrayList<Label> labels=new ArrayList<>();
//        labels.add(Main.ourSolider1.getLabel());
//        labels.add(Main.ourSolider2.getLabel());
//        labels.add(Main.ourSolider3.getLabel());
//        labels.add(Main.ourSolider4.getLabel());
//        labels.add(Main.ourSolider5.getLabel());
//        labels.add(Main.ourSolider6.getLabel());
       // labels.add(Main.ourSolider7.getLabel());
        labels.add(Main.selectedSolider8.getLabel());
        labels.add(Main.selectedSolider9.getLabel());
        labels.add(Main.selectedSolider10.getLabel());
        labels.add(Main.selectedSolider11.getLabel());
//        labels.add(Main.ourSolider12.getLabel());
//        VBox vBox=new VBox(Main.ourSolider1.getLabel(),Main.ourSolider2.getLabel(),Main.ourSolider3.getLabel(),Main.ourSolider4.getLabel());
//        vBox.setSpacing(20);
        HBox hBox =new HBox(Main.selectedSolider8.getLabel(),Main.selectedSolider9.getLabel(),Main.selectedSolider10.getLabel() , Main.selectedSolider11.getLabel());
        hBox.setTranslateY(510);
        hBox.setSpacing(40);

        Label label1=new Label("These are your soldiers");
        label1.setTranslateX(190);
        label1.setTranslateY(430);
        label1.setFont(Font.font("CamBria", FontWeight.BOLD, 50));
        label1.setTextFill(Color.DARKBLUE);

  //      label1.setFont(Font.font("Cambria",50));


        Label label2=new Label("Tap to start");
        label2.setTranslateX(60);
      //  label2.setFont(Font.font("Cambria",50));
        label2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
        label2.setTextFill(Color.SNOW);
        label2.setTranslateY(180);
        label2.setOnMouseEntered(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label2.setScaleY(1.2);
                label2.setScaleX(1.2);
            }
        });
        label2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label2.setScaleY(1);
                label2.setScaleX(1);
            }
        });
        label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Level1.startLevel1(imageViewTower1,imageViewTower2,grass).show();
            }
        });
        for (Label label:labels){
            for (SelectedSolider selectedSolider :Main.selectedSoliders){
                if (label.getText().equals(selectedSolider.getName())&& selectedSolider.isEnabled()) {

                    label.setTextFill(Color.WHITE);
                    label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent mouseEvent) {
                            label.setScaleY(1.2);
                            label.setScaleX(1.2);
                        }
                    });
                    label.setOnMouseExited(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent mouseEvent) {
                            label.setScaleY(1);
                            label.setScaleX(1);
                        }
                    });
                }
            }
        }
        Group group=new Group(imageView);
        group.getChildren().addAll(hBox,label1,label2);
        Scene scene=new Scene(group,900,600,Color.BLACK);
        stage.setScene(scene);
        return stage;
    }


//    public static Stage runLevel2() throws FileNotFoundException {
//        Stage stage=new Stage();
//        Image backGround=new Image(new FileInputStream("./src/main/java/grass2.jpg"));
//        ImageView khak=new ImageView(backGround);
//        khak.setX(0);
//        khak.setY(0);
//        khak.setFitHeight(700);
//        khak.setFitWidth(1100);
//        Image image=new Image(new FileInputStream("./src/main/java/mnm3.jpg"));
//        ImageView imageView = new ImageView(image);
//        imageView.setX(0);
//        imageView.setY(0);
//        imageView.setFitHeight(600);
//        imageView.setFitWidth(900);
//        imageView.setPreserveRatio(true);
//        Main.setLabelToOurSolider();
//        Image containerImage=new Image(new FileInputStream("./src/main/java/container.png"));  //tower
//        ImageView imageViewContainer=new ImageView(containerImage);
//        Image vanImage=new Image(new FileInputStream("./src/main/java/v.PNG"));
//        ImageView imageViewVan=new ImageView(vanImage);
//        ArrayList<Label> labels=new ArrayList<>();
////        labels.add(Main.ourSolider1.getLabel());
////        labels.add(Main.ourSolider2.getLabel());
////        labels.add(Main.ourSolider3.getLabel());
////        labels.add(Main.ourSolider4.getLabel());
//        //labels.add(Main.ourSolider5.getLabel());
//        // labels.add(Main.ourSolider6.getLabel());
//        //labels.add(Main.ourSolider7.getLabel());
//         labels.add(Main.selectedSolider8.getLabel());
//         labels.add(Main.selectedSolider9.getLabel());
//         labels.add(Main.selectedSolider10.getLabel());
//         labels.add(Main.selectedSolider11.getLabel());
//        // labels.add(Main.ourSolider12.getLabel());
////        VBox vBox=new VBox(Main.ourSolider1.getLabel(),Main.ourSolider2.getLabel(),Main.ourSolider3.getLabel(),Main.ourSolider4.getLabel());
////        vBox.setSpacing(10);
//        HBox hBox =new HBox(Main.selectedSolider8.getLabel(),Main.selectedSolider9.getLabel(),Main.selectedSolider10.getLabel(),Main.selectedSolider11.getLabel());
//        hBox.setTranslateY(510);
//        hBox.setSpacing(15);
//        Label label1=new Label("These are your team members ");
//        label1.setTranslateX(320);label1.setTextFill(Color.WHITE);label1.setFont(Font.font("Cambria",20));
//
//
//        Label label2=new Label("Tap to start!");
//        label2.setTranslateX(100);
//        label2.setFont(Font.font("Cambria",50));
//        label2.setTextFill(Color.WHITE);
//        label2.setTranslateY(30);
//        label2.setOnMouseEntered(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                label2.setScaleY(1.2);
//                label2.setScaleX(1.2);
//            }
//        });
//        label2.setOnMouseExited(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                label2.setScaleY(1);
//                label2.setScaleX(1);
//            }
//        });
//        label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                Level2.startLevel2(imageViewContainer,imageViewVan,khak).show();
//            }
//        });
//        for (Label label:labels){
//            for (SelectedSolider ourSolider:Main.selectedSoliders){
//                if (label.getText().equals(ourSolider.getName())&& ourSolider.isEnabled()) {
//            label.setTextFill(Color.WHITE);
//            label.setOnMouseEntered(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent mouseEvent) {
//                    label.setScaleY(1.2);
//                    label.setScaleX(1.2);
//                }
//            });
//            label.setOnMouseExited(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent mouseEvent) {
//                    label.setScaleY(1);
//                    label.setScaleX(1);
//                }
//            });
//                }
//            }
//        }
//        Group group=new Group(imageView);
//        group.getChildren().addAll(hBox,label1,label2);
//        Scene scene=new Scene(group,900,600,Color.BLACK);
//        stage.setScene(scene);
//        return stage;
//    }
public static Stage runLevel2() throws FileNotFoundException {
    Stage stage=new Stage();
    Image backGround=new Image(new FileInputStream("./src/main/java/grass.jpg"));
    ImageView grass=new ImageView(backGround);
    grass.setX(0);
    grass.setY(0);
    grass.setFitHeight(700);
    grass.setFitWidth(1100);

    Image image=new Image(new FileInputStream("./src/main/java/firstLevelMenu.jpg"));
    ImageView imageView = new ImageView(image);
    imageView.setX(0);
    imageView.setY(0); imageView.setFitHeight(700);
    imageView.setFitWidth(1100);

    imageView.setPreserveRatio(true);
    Main.setLabelToOurSolider();

    Image tower1Image=new Image(new FileInputStream("./src/main/java/tower2.jpg"));
    ImageView imageViewTower1=new ImageView(tower1Image);
    imageViewTower1.setX(-100);
    imageViewTower1.setY(-100);

    Image tower2Image=new Image(new FileInputStream("./src/main/java/tower2.jpg")); //tower
    ImageView imageViewTower2=new ImageView(tower2Image);
    imageViewTower2.setX(-900);
    imageViewTower2.setY(100);


    ArrayList<Label> labels=new ArrayList<>();
//        labels.add(Main.ourSolider1.getLabel());
//        labels.add(Main.ourSolider2.getLabel());
//        labels.add(Main.ourSolider3.getLabel());
//        labels.add(Main.ourSolider4.getLabel());
//        labels.add(Main.ourSolider5.getLabel());
//        labels.add(Main.ourSolider6.getLabel());
    // labels.add(Main.ourSolider7.getLabel());
    labels.add(Main.selectedSolider8.getLabel());
    labels.add(Main.selectedSolider9.getLabel());
    labels.add(Main.selectedSolider10.getLabel());
    labels.add(Main.selectedSolider11.getLabel());
//        labels.add(Main.ourSolider12.getLabel());
//        VBox vBox=new VBox(Main.ourSolider1.getLabel(),Main.ourSolider2.getLabel(),Main.ourSolider3.getLabel(),Main.ourSolider4.getLabel());
//        vBox.setSpacing(20);
    HBox hBox =new HBox(Main.selectedSolider8.getLabel(),Main.selectedSolider9.getLabel(),Main.selectedSolider10.getLabel() , Main.selectedSolider11.getLabel());
    hBox.setTranslateY(510);
    hBox.setSpacing(40);

    Label label1=new Label("These are your soldiers");
    label1.setTranslateX(190);
    label1.setTranslateY(430);
    label1.setFont(Font.font("CamBria", FontWeight.BOLD, 50));
    label1.setTextFill(Color.DARKBLUE);

    //      label1.setFont(Font.font("Cambria",50));


    Label label2=new Label("Tap to start");
    label2.setTranslateX(60);
    //  label2.setFont(Font.font("Cambria",50));
    label2.setFont(Font.font("Verdana", FontWeight.BOLD, 50));
    label2.setTextFill(Color.SNOW);
    label2.setTranslateY(180);
    label2.setOnMouseEntered(new EventHandler<MouseEvent>()
    {
        @Override
        public void handle(MouseEvent mouseEvent) {
            label2.setScaleY(1.2);
            label2.setScaleX(1.2);
        }
    });
    label2.setOnMouseExited(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            label2.setScaleY(1);
            label2.setScaleX(1);
        }
    });
    label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {
            Level1.startLevel1(imageViewTower1,imageViewTower2,grass).show();
        }
    });
    for (Label label:labels){
        for (SelectedSolider selectedSolider :Main.selectedSoliders){
            if (label.getText().equals(selectedSolider.getName())&& selectedSolider.isEnabled()) {

                label.setTextFill(Color.WHITE);
                label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        label.setScaleY(1.2);
                        label.setScaleX(1.2);
                    }
                });
                label.setOnMouseExited(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        label.setScaleY(1);
                        label.setScaleX(1);
                    }
                });
            }
        }
    }
    Group group=new Group(imageView);
    group.getChildren().addAll(hBox,label1,label2);
    Scene scene=new Scene(group,900,600,Color.BLACK);
    stage.setScene(scene);
    return stage;
}


    public static Stage missionMenu(ImageView imageView1){
        View.mediaPlayer.stop();
        View.mediaPlayer1.play();
        Group root1=new Group(imageView1);
        Stage stage=new Stage();
        Label level1=new Label("\t\t\t\tLevel 1");
        level1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                level1.setScaleX(1.2);
                level1.setScaleY(1.2);
            }
        });
        level1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                level1.setScaleX(1);
                level1.setScaleY(1);
            }
        });
        level1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try {
                    Controller.runLevel1().show();
                }catch (FileNotFoundException e){
                    e.getStackTrace();
                }
            }
        });
        level1.setTextFill(Color.BLACK);
        level1.setFont(Font.font("Cambria",50));
        Label level2=new Label("\t\t\t\tLevel 2");
        level2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                level2.setScaleX(1.2);
                level2.setScaleY(1.2);
            }
        });
        level2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                level2.setScaleX(1);
                level2.setScaleY(1);
            }
        });
        level2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (Level1.isWin()) {
                    try {
                        Controller.runLevel2().show();
                    } catch (FileNotFoundException e) {
                        e.getStackTrace();
                    }
                }
            }
        });
        level2.setTextFill(Color.BLACK);
        level2.setFont(Font.font("Cambria",50));
        VBox vBox=new VBox(level1,level2);
        root1.getChildren().addAll(vBox);
        Scene scene1=new Scene(root1,900,600);
        stage.setScene(scene1);
        return stage;
    }
    public static Stage SavedGameMenu(ImageView imageView2) throws FileNotFoundException{
        Group root=new Group(imageView2);
        Stage stage=new Stage();
        Main.setLabelToOurSolider();
        ArrayList<Label> labels=new ArrayList<>();
//        labels.add(Main.ourSolider1.getLabel());
//        labels.add(Main.ourSolider2.getLabel());
//        labels.add(Main.ourSolider3.getLabel());
//        labels.add(Main.ourSolider4.getLabel());
//        labels.add(Main.ourSolider5.getLabel());
//        labels.add(Main.ourSolider6.getLabel());
 //       labels.add(Main.ourSolider7.getLabel());
        labels.add(Main.selectedSolider8.getLabel());
        labels.add(Main.selectedSolider9.getLabel());
        labels.add(Main.selectedSolider10.getLabel());
        labels.add(Main.selectedSolider11.getLabel());
//        labels.add(Main.ourSolider12.getLabel());
       // HBox hBox=new HBox(Main.ourSolider1.getLabel(),Main.ourSolider2.getLabel(),Main.ourSolider3.getLabel(),Main.ourSolider4.getLabel());
        HBox hBox1=new HBox(Main.selectedSolider8.getLabel(),Main.selectedSolider9.getLabel(),Main.selectedSolider10.getLabel(),Main.selectedSolider11.getLabel());
       // hBox.setTranslateY(400);
        hBox1.setTranslateY(500);
        for (Label label:labels){
            label.setTextFill(Color.WHITE);
            label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleY(1.2);
                    label.setScaleX(1.2);
                }
            });
            label.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleY(1);
                    label.setScaleX(1);
                }
            });
            label.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    for (SelectedSolider selectedSolider : Main.selectedSoliders){
                        if (label.getText().equals(selectedSolider.getName())){
                            selectedSolider.setEnabled(true);
                            label.setTextFill(Color.GREENYELLOW);
                        }
                    }
                }
            });
            label.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    for (SelectedSolider selectedSolider : Main.selectedSoliders){
                        if (label.getText().equals(selectedSolider.getName())){
                            selectedSolider.setEnabled(false);
                            label.setTextFill(Color.WHITE);
                        }
                    }
                }
            });
        }
        Label label1=new Label("Choose the team member then ");
        label1.setTranslateX(320);label1.setTextFill(Color.CYAN);label1.setFont(Font.font("Cambria",20));label1.setTranslateY(20);
        Label label2=new Label("Click!");
        label2.setTranslateX(380);label2.setFont(Font.font("Cambria",50));label2.setTextFill(Color.WHITE);label2.setTranslateY(35);
        label2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label2.setScaleY(1.2);
                label2.setScaleX(1.2);
            }
        });
        label2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label2.setScaleY(1);
                label2.setScaleX(1);
            }
        });
        label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        });
       // root.getChildren().addAll(hBox,hBox1,label1,label2);
        Scene scene=new Scene(root,900,421);
        stage.setScene(scene);
        return stage;
    }
    public static Stage trainMenu(ImageView imageView3) throws FileNotFoundException{
        Group root=new Group(imageView3);
        Stage stage=new Stage();
        Main.setLabelToOurSolider();
       // HBox hBox =new HBox(Main.ourSolider1.getLabel(),Main.ourSolider2.getLabel(),Main.ourSolider3.getLabel(),Main.ourSolider4.getLabel());
        HBox hBox1 =new HBox(Main.selectedSolider8.getLabel(),Main.selectedSolider9.getLabel(),Main.selectedSolider10.getLabel(),Main.selectedSolider11.getLabel());
        hBox1.setTranslateY(100);
        //hBox.setSpacing(25);
      //  hBox1.setSpacing(25);
        ArrayList<Label> labels=new ArrayList<>();
        Text inf=new Text();
        Text news=new Text();
        Text upgrade=new Text();
        root.getChildren().addAll(inf,news,upgrade);
        //labels.add(Main.ourSolider1.getLabel());labels.add(Main.ourSolider2.getLabel());labels.add(Main.ourSolider3.getLabel());labels.add(Main.ourSolider4.getLabel());
        //labels.add(Main.ourSolider5.getLabel());
        // labels.add(Main.ourSolider6.getLabel());
         //labels.add(Main.ourSolider7.getLabel());
         labels.add(Main.selectedSolider8.getLabel());
         labels.add(Main.selectedSolider9.getLabel());
         labels.add(Main.selectedSolider10.getLabel());
         labels.add(Main.selectedSolider11.getLabel());
        // labels.add(Main.ourSolider12.getLabel());
        for (Label label:labels){
            label.setTextFill(Color.WHITE);
            label.setFont(Font.font("Cambria",15));
            label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleX(1.2);
                    label.setScaleY(1.2);
                }
            });
            label.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    for (SelectedSolider selectedSolider :Main.selectedSoliders){
                        if (label.getText().equals(selectedSolider.getName())) {
                            inf.setText(selectedSolider.getName()+"  Level : "+ selectedSolider.getLevel()+"   Health : "+ selectedSolider.getHealth()+"   Attack : "+ selectedSolider.getAttack());
                            inf.setTranslateY(400);
                            inf.setFont(Font.font("Cambria",30));
                            inf.setFill(Color.WHITE);
                            news.setText("You need "+10* selectedSolider.getLevel()+"$ to level up And you have "+Main.totalMoney+"$");
                            news.setTranslateY(430);
                            news.setFont(Font.font("Cambria",22));
                            news.setFill(Color.WHITE);
                            upgrade.setText("Level Up!");
                            upgrade.setTranslateY(480);
                            upgrade.setTranslateX(100);
                            upgrade.setFont(Font.font("Cambria",30));
                            upgrade.setFill(Color.CYAN);
                            upgrade.setOnMouseEntered(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    upgrade.setScaleX(1.2);
                                    upgrade.setScaleY(1.2);

                                }
                            });
                            upgrade.setOnMouseExited(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    upgrade.setScaleX(1);
                                    upgrade.setScaleY(1);
                                }
                            });
                            upgrade.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (Main.totalMoney>=10* selectedSolider.getLevel()){
                                        Main.totalMoney-=10* selectedSolider.getLevel();
                                        selectedSolider.setLevel(selectedSolider.getLevel()+1);
                                        selectedSolider.setAttack(selectedSolider.getAttack()*0.04+ selectedSolider.getAttack());
                                        selectedSolider.setHealth(selectedSolider.getHealth()*0.04+ selectedSolider.getHealth());
                                        inf.setText(selectedSolider.getName()+"  Level : "+ selectedSolider.getLevel()+"   Health : "+ selectedSolider.getHealth()+"   Attack : "+ selectedSolider.getAttack());
                                        news.setText("You need "+10* selectedSolider.getLevel()+"$ to level up And you have "+Main.totalMoney+"$");
                                    }
                                }
                            });
                        }
                    }
                }
            });
            label.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleX(1);
                    label.setScaleY(1);
                }
            });
        }
        Scene scene=new Scene(root,900,600);
       // root.getChildren().addAll(hBox,hBox1);
        stage.setScene(scene);
        return stage;
    }
    public static Stage SoldiersMenu(ImageView imageView4) throws FileNotFoundException{
        Group root=new Group(imageView4);
        Stage stage=new Stage();
        Main.setLabelToStudding();

        HBox hBox=new HBox(Main.container.getLabel());
        hBox.setTranslateX(100);
        hBox.setTranslateY(50);
        hBox.setSpacing(20);
        root.getChildren().addAll(hBox);

        Text ArcherText , knightText , GoblinText , ShieldText;
        ArcherText = new Text( 125,400 , "Archer\n" +
                "Energy : 15\n" +
                "Health : 300\n" +
                "Speed : 1\n" +
                "Damage : 200\n" +
                "Range : 2");
        ArcherText.setFont(Font.font("Cambria",25));
        ArcherText.setFill(WHITE);
        root.getChildren().add(ArcherText);

        knightText = new Text( 300 , 400 ,"Knight\n" +
                "Energy : 30\n" +
                "Health : 600\n" +
                "Speed : 2\n" +
                "Damage : 400\n" +
                "Range : 1" );
        knightText.setFont(Font.font("Cambria",25));
        knightText.setFill(WHITE);
        root.getChildren().add(knightText);

        GoblinText = new Text( 700 , 400 ,"Goblin \n" +
                "Energy : 10\n" +
                "Health : 200\n" +
                "Speed : 3\n" +
                "Damage : 250\n" +
                "Range : 1");
        GoblinText.setFont(Font.font("Cambria",25));
        GoblinText.setFill(WHITE);
        root.getChildren().add(GoblinText);

        ShieldText = new Text( 500 , 400 ,"Shield\n" +
                "Energy : 10\n" +
                "Health : 1000\n" +
                "Speed : 1\n" +
                "Damage : 150\n" +
                "Range : 1");

        ShieldText.setFont(Font.font("Cambria",25 ));
        ShieldText.setFill(WHITE);
        root.getChildren().add(ShieldText);

        ArrayList<Label> studding=new ArrayList<>();
        Text inf=new Text();
        Text news=new Text();
        Text upgrade=new Text();
        root.getChildren().addAll(inf,news,upgrade);
        studding.add(Main.container.getLabel());studding.add(Main.temp.getLabel());studding.add(Main.v.getLabel());
        for (Label label:studding){
            label.setTextFill(Color.WHITE);
            label.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleX(1.2);
                    label.setScaleY(1.2);
                }
            });
            label.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    label.setScaleX(1);
                    label.setScaleY(1);
                }
            });
            label.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    for (Players players1 :Main.players){
                        if (label.getText().equals(players1.getLabel().getText())){
                            inf.setText(" Level : "+ players1.getLevel()+" Durability : "+ players1.getDurability());
                            inf.setTranslateY(220);
                            inf.setFont(Font.font("Cambria",28));
                            inf.setFill(Color.DEEPPINK);
                            news.setText(" You have : "+100* players1.getLevel()+"$  Needed : "+Main.totalMoney+"$");
                            news.setTranslateY(255);
                            news.setFont(Font.font("Cambria",22));
                            news.setFill(Color.LIGHTPINK);
                            upgrade.setText("Level Up!");
                            upgrade.setTranslateY(320);
                            upgrade.setTranslateX(50);
                            upgrade.setFont(Font.font("Cambria",40));
                            upgrade.setFill(Color.LIGHTSTEELBLUE);
                            upgrade.setOnMouseEntered(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    upgrade.setScaleX(1.2);
                                    upgrade.setScaleY(1.2);
                                }
                            });
                            upgrade.setOnMouseExited(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    upgrade.setScaleX(1);
                                    upgrade.setScaleY(1);
                                }
                            });
                            upgrade.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (Main.totalMoney>=100* players1.getLevel()){
                                        Main.totalMoney-=100* players1.getLevel();
                                        players1.setLevel(players1.getLevel()+1);
                                        players1.setDurability(0.1* players1.getDurability()+ players1.getDurability());
                                        inf.setText(" Level : "+ players1.getLevel()+" Durability : "+ players1.getDurability());
                                        news.setText(" You have : "+100* players1.getLevel()+"$  Needed : "+Main.totalMoney+"$");
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        Scene scene=new Scene(root,900,600);
        stage.setScene(scene);
        return stage;

            }
    }