package com.projetAngular.stylos.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Stylo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(nullable = false, updatable = false)
    private Long id;
    private String nom;
    private boolean edition;
    private Collection collection;
    private double prix;
    private ArrayList<String> couleurs;
    private String description;
    private String imageUrl;

    public Stylo() {}

    public Stylo(Long id, String nom, boolean edition, Collection collection, double prix, ArrayList<String> couleurs, String description, String imageUrl) {
        this.id = id;
        this.nom = nom;
        this.edition = edition;
        this.collection = collection;
        this.prix = prix;
        this.couleurs = couleurs;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEdition() {
        return edition;
    }

    public void setEdition(boolean edition) {
        this.edition = edition;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ArrayList<String> getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(ArrayList<String> couleurs) {
        this.couleurs = couleurs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", edition=" + edition +
                ", collection=" + collection +
                ", prix=" + prix +
                ", couleurs=" + couleurs +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
