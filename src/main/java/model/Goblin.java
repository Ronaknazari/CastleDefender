package model;

public class Goblin extends Army{
    public Goblin(int health, int damage, int range, int energy, int speed) {
        super(health, damage, range, energy, speed);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public int getRange() {
        return super.getRange();
    }

    @Override
    public void setRange(int range) {
        super.setRange(range);
    }

    @Override
    public int getEnergy() {
        return super.getEnergy();
    }

    @Override
    public void setEnergy(int energy) {
        super.setEnergy(energy);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void move(Army army) {
        Thread knightThread = new Thread(this::move);
        knightThread.start();
        while(knightThread.isAlive()) {
            if (army.getHealth()==0){
                System.out.println("Goblin is Dead...");
                break;
            }else if(army.getHealth()!=0 && army.getEnergy()==0){
                //knight.remove();
                try {
                    knightThread.wait(10,10);
                    army.setEnergy(army.getEnergy()-1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
