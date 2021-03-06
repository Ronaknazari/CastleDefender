package view;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.EnemySolider;
import model.SelectedSolider;

import java.util.*;

public class Level1 {
    private static ArrayList<EnemySolider> enemySoliders=new ArrayList<>();
    private static ArrayList<Circle> enemyCircles=new ArrayList<>();
    private static ArrayList<Circle> ourCircles=new ArrayList<>();
    private static Group root;
    private static Map<Circle, SelectedSolider> circleOurSoliderMap=new HashMap<>();
    private static Map<Circle,EnemySolider> circleRedSoliderHashMap=new HashMap<>();
    private static Scene scene;
    private static boolean isWin;
    public static void setIsWin(boolean isWin) {
        Level1.isWin = isWin;
    }
    public static boolean isWin() {
        return isWin;
    }
    public static Stage startLevel1(ImageView imageViewContainer, ImageView imageViewTruck,ImageView backGround){
        Stage stage=new Stage();
        root=new Group(backGround);
//        for (int i=0;i<100;i++){
//            PlayerR redSolider=new PlayerR(1000,500,1);
//            redSolider.setAlive(true);
//            enemySoliders.add(redSolider);
//        }
//        for (int i=100;i<180;i++){
//            PlayerG graySolider=new PlayerG(1000,800,1);
//            graySolider.setAlive(true);
//            enemySoliders.add(graySolider);
//        }
//        EnemySolider bossLevel1=new EnemySolider(8000,5000,1);
//        bossLevel1.setAlive(true);
//        enemySoliders.add(bossLevel1);
//        Circle circle1=new Circle(50,Color.WHITE);
//        circle1.setCenterX(400);circle1.setCenterY(400);
//        //round1();
//        boolean b=false;
//        for (EnemySolider enemySolider:circleRedSoliderHashMap.values()){
//          if (enemySolider.isAlive()&&Main.container.getDurability()>=0&&Main.temp.getDurability()>=0)
//              b=true;
//        }
//        if (b){
//            System.out.println("You Wine!");
//            setIsWin(true);
//        }
        imageViewContainer.setTranslateX(970);
        imageViewContainer.setTranslateY(140);
        imageViewTruck.setTranslateX(965);
        imageViewTruck.setTranslateY(370);
        scene=new Scene(root,1100,700);
        root.getChildren().addAll(imageViewContainer,imageViewTruck);
        stage.setScene(scene);
        return stage;
    }
}
