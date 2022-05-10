package com.example.facebook;

public class TiendaVo {

    private String nombre;
    private String info;
    private String lugar;
    private int Avatar;

    public TiendaVo(String nombre, String info, String lugar, int Avatar) {
        this.nombre = nombre;
        this.info = info;
        this.lugar = lugar;
        this.Avatar = Avatar;;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String info) {
        this.lugar = lugar;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int Avatar) {
        this.Avatar = Avatar;
    }


}
