package org.dstu.domain;

public class Сhair extends Сharacteristic {
    private String color;
    private int weight = 5;
    private String upholstery;

    public Сhair() {
    }

    public Сhair(String[] line) {
        super(line[2], line[3], line[1]);
        color = line[4];
        weight = Integer.parseInt(line[5]);
        upholstery = line[6];
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getUpholstery() {
        return upholstery;
    }

    public void setUpholstery(String upholstery) {
        this.upholstery = upholstery;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Стул. ");
        builder.append(super.toString());
        builder.append(" | Обивка: ");
        builder.append(upholstery);
        builder.append(" | Цвет: ");
        builder.append(color);
        builder.append(" | Вес: ");
        builder.append(weight);
        return builder.toString();
    }
}
