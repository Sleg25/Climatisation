package fr.demos.exos.Taille;
import java.awt.Color;

public class Chemise {
	String nomModele = "";
	Color couleur = Color.WHITE;
	Taille taille;
	
	public Chemise(String nomModele, Color couleur, Taille taille){
		this.nomModele = nomModele;
		this.couleur = couleur;
		this.taille = taille;
	}
	


	public String toString() {
		return "Chemise [nomModele = " + nomModele + ", couleur = " + couleur + ", taille = " + taille + "]";
	}
}
