package com.example.facebook;


public class notiVo {

    private String nombre;
    private String info;
    private int Avatar;

    public notiVo(String nombre, String info, int Avatar) {
        this.nombre = nombre;
        this.info = info;
        this.Avatar = Avatar;;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int Avatar) {
        this.Avatar = Avatar;
    }


}