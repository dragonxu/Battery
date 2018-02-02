package com.battery;

/**
 * Created by szl on 2018/1/31.
 * 描述车载硬件设备
 */

public class Vehicle {
    private int id; // 与数据库对应的id
    private String number; // 硬件设备唯一的编号
    private String brand; // 汽车的品牌
    private String model; // 汽车的型号
    private String plate; // 汽车的车牌号码
    private User admin; // 硬件设备的管理员用户
    private double longitude; // 经度
    private double latitude; // 纬度
    private Battery battery; // 汽车搭载的电池
    private double life; // 电池的续航里程

    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }
}
