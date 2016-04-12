package fr.demos.formation;

import java.io.Serializable;

public class Climatisation implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private double pression = 0;
	private int tauxHumidite;
	private String nomEmetteur;
	private long datation = System.currentTimeMillis();
	private static final double CST_FARENHEIT_1 = 40, CST_FARENHEIT_2 = 1.8;
	private static final double CST_MERCURE = 0.0295299831;

	//Constructors************************************************************************************************************************
	
	public Climatisation(double temperature, double pres, String nomEmetteur){
		//this.datation = System.currentTimeMillis();
		//this.datation = datation;
		
		this.temperature = temperature; 
		this.pression = pres;
		this.nomEmetteur = nomEmetteur;
	}
	
	public Climatisation(double temperature, String nomEmetteur){
		//this.datation = System.currentTimeMillis();
		//this.datation = datation;
		//this.nomEmetteur = nomEmetteur;
		//this.temperature = temperature;
		this(temperature,0 , nomEmetteur);
	}
	
	
	
	
	//Getters******************************************************************************************************************************
	private double temperature;
	public double getTemperature() {
		return temperature;
	}

	public String getNomEmetteur() {
		return nomEmetteur;
	}

	
	public double getPression() {
		return pression;
	}
	

	public int getTauxHumidite() {
		return tauxHumidite;
	}


	public long getDatation(){
		return datation;
	}
	
	public double getTemperatureFarenheit(){
		return (temperature + CST_FARENHEIT_1)*CST_FARENHEIT_2 - CST_FARENHEIT_1;
	}
	
	public double getPressionPoucesMercure(){
		return Math.rint(pression * CST_MERCURE * 100d)/100d;
	}
	
	
	//Affichage***************************************************************************************************************************
	@Override
	public String toString() {
		return "Climatisation [température en celsius = " + temperature + ", température en Farenheit = " + getTemperatureFarenheit() + "\npression en hectopascal = " + pression + ", pression en pouces de mercure = " + getPressionPoucesMercure() + "\ntaux d'humidité = "  + tauxHumidite
				+ ", " + nomEmetteur + ", date = " + new java.util.Date(datation) + "]";
	}
	
	
}
