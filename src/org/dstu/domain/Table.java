package org.dstu.domain;

public class Table extends Сharacteristic {
    private String form;
    private String type;
    private int legs = 4;

    public Table() {
    }

    public Table(String[] line) {
        super(line[2], line[3], line[1]);
        form = line[4];
        type = line[5];
        legs = Integer.parseInt(line[6]);
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Стол: ");
        builder.append(super.toString());
        builder.append(" | Форма: ");
        builder.append(form);
        builder.append(" | Тип: ");
        builder.append(type);
        builder.append(" | Количесвто ножек: ");
        builder.append(legs);
        return builder.toString();
    }
}
