package com.example.facebook;


public class CasitaVo {

    private String nombre;
    private String info;
    private int Avatar;
    private int Publicacion;
    private int lbi1;
    private int lbi2;
    private int lbi3;

    public CasitaVo(String nombre, String info, int Avatar, int Publicacion, int lbi1, int lbi2, int lbi3) {
        this.nombre = nombre;
        this.info = info;
        this.Avatar = Avatar;;
        this.Publicacion = Publicacion;
        this.lbi1 = lbi1;
        this.lbi2 = lbi2;
        this.lbi3 = lbi3;
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


    public int getPublicacion() {
        return Publicacion;
    }

    public void setPublicacion(int Publicacion) {
        this.Publicacion = Publicacion;
    }

    public int getLbi1() { return lbi1; }

    public void setLbi1(int l1){this.lbi1 = lbi1; }

    public int getLbi2() {
        return lbi2;
    }

    public void setLbi2(int lbi2) {
        this.lbi2 = lbi2;
    }

    public int getLbi3() {
        return lbi3;
    }

    public void setLbi3(int lbi3) {
        this.lbi3 = lbi3;
    }
}