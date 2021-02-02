package model;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.Serializable;
import java.util.ArrayList;

public class Soldiers implements Runnable , Serializable{
    private String name;
    private double Health;
    private double attack;
    private Integer attackRange;
    private double x;
    private double y;
    private double XSpeed;
    private double YSpeed;
    private boolean isAlive=true;
    private Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Soldiers(String name) {
        this.name = name;
    }

    public Soldiers(String name, double health, double attack, Integer attackRange) {
        this.name = name;
        Health = health;
        this.attack = attack;
        this.attackRange = attackRange;
    }

    public Soldiers() {
    }

    public Soldiers(double health, double attack, Integer attackRange) {
        Health = health;
        this.attack = attack;
        this.attackRange = attackRange;
    }


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public Integer getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(Integer attackRange) {
        this.attackRange = attackRange;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(double XSpeed) {
        this.XSpeed = XSpeed;
    }

    public double getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(double YSpeed) {
        this.YSpeed = YSpeed;
    }

    @Override
    public void run() {

    }

    //    @Override
//    public void run() {
//        while(running) {
//            try{
//                Thread.sleep(10);
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            setEnergy(getEnergy()+1);
//            Platform.runLater(()->{
//                energyBar.setProgress(getEnergy() / 100);
//                livesLab.setText("Health : " + health);
//            });
//            for (Thread thread :threads){
//                try {
//                    if(thread.isInterrupted()){
//                        System.out.println("INTERRUPTED");
//                        threads.remove(thread);
//                    }
//                } catch (Exception e){
//                    System.out.println("UNREMOVABLE");
//                }
//            }
//        }
//        Main.stopGame();
//    }

}
