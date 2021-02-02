package model;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;
import java.io.FileInputStream;


public class Tower implements Runnable, Serializable {
    private int health;
    private int damage;
    private int range;

    private Image image;
    private ImageView imageView;
    private boolean alive;


    public Tower(int health, int damage, int range) {
        this.health = health;
        this.damage = damage;
        this.range = range;
        try {
            FileInputStream fis = new FileInputStream(String.valueOf(image));
            this.image = new Image(fis);
            this.imageView = new ImageView(this.image);
            imageView.setFitHeight(600);
            imageView.setFitWidth(600);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

    public int getDamage() { return damage; }

    public void setDamage(int damage) { this.damage = damage; }

    public int getRange() { return range; }

    public void setRange(int range) { this.range = range; }


    public ImageView getImageView() {
        return imageView;
    }

    public void dead(){
        this.alive = false;
        Platform.runLater(()->{
            Object map = null;
            //map.removeFromMap(this.towerPane);
        });
       // this.removeTower();
    }

//    public void shoot(Soldier soldier){
//        if(soldier != null){
//            soldier.takeDamage(damage);
//        }
//    }

    @Override
    public void run() {
        while(alive){
            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
            if(alive) {
                int player;
              //  shoot(tile.soldierFinder(range,1 - player));
            }
        }
    }

    @Override
    public String toString() {
        return "Tower{" +
                "health=" + health +
                ", damage=" + damage +
                ", range=" + range +
                ", image=" + image +
                ", imageView=" + imageView +
                ", alive=" + alive +
                '}';
    }

}
