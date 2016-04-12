package fr.demos.formation.essais;
import fr.demos.formation.Climatisation;

public class TestClimatisation {
	        // point d'entrée "magique"
			
			
	public static void main(String[] args) {
		// déclarer et allouer un objet "Climatisaiton"
		Climatisation clim203 = new Climatisation(25, "salle 203");
	
		
		
		// initialiser ses composants (sauf le nom de l'émetteur)
//		clim203.nomEmetteur = "salle 203";
//		clim203.temp = 25;
//		clim203.pression = 1013;
//		clim203.tauxHumidite = 30;
//		clim203.datation = 8000;
//		
		// affichez-le en utilisant System.out.println
//		System.out.println(clim203.nomEmetteur);
//		System.out.println("Pression = "+ clim203.pression);
//		System.out.println("tauxHumidité = " + clim203.tauxHumidite);
//		System.out.println("température = " + clim203.temp);
//		System.out.println("datation = " + clim203.datation);
//
////		
//		System.out.println();
//		System.out.println("**********************************************************************************************************");
//		System.out.println();
////		
////		
//		Climatisation clim204 = new Climatisation();
////		// initialiser ses composants (sauf le nom de l'émetteur)
////		clim204.nomEmetteur = "salle 204";
////		clim204.temp = 23;
////		clim204.pression = 1013;
////		clim204.tauxHumidite = 60;
		Climatisation clim204 = new Climatisation(23, 30, "salle 204");
//		//clim204.datation = 8000;
//		System.out.println(clim204.nomEmetteur);
//		System.out.println("Pression = "+ clim204.pression);
//		System.out.println("tauxHumidité = " + clim204.tauxHumidite);
//		System.out.println("température = " + clim204.temp);
//		System.out.println("datation = " + clim204.datation);
	
		System.out.println(clim203);
		System.out.println("************************************************************************************************************");
		System.out.println(clim204);
	 }
}

