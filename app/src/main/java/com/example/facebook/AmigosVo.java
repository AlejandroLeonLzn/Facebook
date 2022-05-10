package com.example.facebook;


public class AmigosVo {

    private String nombre;
    private int Confi;
    private int Avatar;

    public AmigosVo(String nombre, int Avatar, int Confi) {
        this.nombre = nombre;
        this.Confi = Confi;
        this.Avatar = Avatar;;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConfi() {
        return Confi;
    }

    public void setConfi(int Confi) { this.Confi = Confi; }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int Avatar) {
        this.Avatar = Avatar;
    }


}