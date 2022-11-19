package wtf.ejemplo.Models;

public class Animal {
    private String cod_anim;
    private String nom_anim;
    
    public Animal() {
    }
    public Animal(String cod_anim, String nom_anim) {
        this.cod_anim = cod_anim;
        this.nom_anim = nom_anim;
    }
   
    public String getCod_anim() {
        return cod_anim;
    }
    public void setCod_anim(String cod_anim) {
        this.cod_anim = cod_anim;
    }
    public String getNom_anim() {
        return nom_anim;
    }
    public void setNom_anim(String nom_anim) {
        this.nom_anim = nom_anim;
    }
}
