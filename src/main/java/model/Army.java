package model;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Army extends Thread implements Runnable , Serializable{
    private final ArrayList<Thread> threads = new ArrayList<>();
    private ArrayList <Soldiers> soldiers = new ArrayList<>();
    private final ArrayList <Tower> towers = new ArrayList<>();

    private int health;
    private int damage;
    private int range;
    private int energy;
    private int speed;

    public Army(int health, int damage, int range, int energy, int speed) {
        this.health = health;
        this.damage = damage;
        this.range = range;
        this.energy = energy;
        this.speed = speed;
    }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

    public int getDamage() { return damage; }

    public void setDamage(int damage) { this.damage = damage; }

    public int getRange() { return range; }

    public void setRange(int range) { this.range = range; }

    public int getEnergy() { return energy; }

    public void setEnergy(int energy) { this.energy = energy; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    @Override
    public void run() {
        while(true) {
            try{
                Thread.sleep(10);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
           setEnergy(getEnergy()-1);
//            Platform.runLater(()->{
//                energy.setEnergy(getEnergy() / 100);
//                health.setText("HEALTH : " + health);
//            });
            for (Thread thread :threads){
                try {
                    if(thread.isInterrupted()){
                        System.out.println("interrupt");
                        threads.remove(thread);
                    }
                } catch (Exception e){
                    System.out.println("NOT REMOVED");
                }
            }
        }
       // Main.stopGame();
    }

    public void move(){
        System.out.println("The obj is moving...");
    }

    public abstract void move(Army army);
    public ArrayList <Thread> getThreads(){
        return threads;
    }

    public void addThreads(Thread thread){
        threads.add(thread);
    }
    ////////////////************FILEEEEEEEEEEEEEEE****************/////////////

//    public static void save(Serializable data, String fileName) throws Exception {
//        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
//            oos.writeObject(data);
//        }
//    }
//    public static Object load(String fileName) throws Exception {
//        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
//            return ois.readObject();
//
//        }
//
//    }
}
