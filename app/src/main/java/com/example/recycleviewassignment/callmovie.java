package com.example.recycleviewassignment;

public class callmovie {

    private String name;
    private String call;
    private String type;
    private int image;

    public callmovie() {
    }

    public callmovie(String name, String call, String type, int image) {
        this.name = name;
        this.call = call;
        this.type = type;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCall() {
        return call;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }
}
