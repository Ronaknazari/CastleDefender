package model;

import javafx.scene.control.Label;

public class SelectedSolider extends Soldiers {
    private int level=1;
    private boolean isEnabled;
    private Label label;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public SelectedSolider(String name, double health, double attack, Integer attackRange, Integer fieldOfView) {
        super(name, health, attack, attackRange);
        this.fieldOfView = fieldOfView;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Integer getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(Integer fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public SelectedSolider(String name) {
        super(name);
    }

    private Integer fieldOfView;

    @Override
    public double getXSpeed() {
        return 4;
    }

    @Override
    public void setXSpeed(double XSpeed) {
        super.setXSpeed(XSpeed);
    }

    @Override
    public double getYSpeed() {
        return 4;
    }

    @Override
    public void setYSpeed(double YSpeed) {
        super.setYSpeed(YSpeed);
    }
}