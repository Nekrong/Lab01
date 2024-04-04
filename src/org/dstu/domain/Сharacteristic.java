package org.dstu.domain;

public abstract class Сharacteristic implements Furniture {
    private String material;
    private String country;
    private String manufacturer;

    public Сharacteristic() {
    }

    public Сharacteristic(String material, String country, String manufacturer) {
        this.material = material;
        this.country = country;
        this.manufacturer = manufacturer;
    }

    public Сharacteristic(String[] line) {
        manufacturer = line[1];
        material = line[2];
        country = line[3];
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Material: ");
        builder.append(material);
        builder.append(" | Country: ");
        builder.append(country);
        builder.append(" | Manufacturer: ");
        builder.append(manufacturer);
        return builder.toString();
    }
}
