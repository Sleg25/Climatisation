

import fr.demos.formation.Climatisation;

public class TestTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperatureCumulee = 0, temperatureMoyenne; 
		double pressionCumulee = 0, pressionMoyenne;
		
		

		Climatisation[] tabClim = {
                    new Climatisation(25 , 1065, "salle 203"),
                    new Climatisation(26 , "salle 204"),
                    new Climatisation(27 , "salle 205"),
                    new Climatisation(28 , 1050, "salle 206"),
		};
	
//		System.out.println("Second élément");
//		System.out.println(tabClim[1]);
//		System.out.println("******************************************************************************************************************************");
//		System.out.println("Avant dernier élément");
//		System.out.println(tabClim[tabClim.length-1]);
//		System.out.println("******************************************************************************************************************************");
//		System.out.println("Test de la boucle for each");
//		
		//variable pour calculer la moyenne de pression en excluant les objets sans pression.
		int i = 0;
		for(Climatisation tab : tabClim){
			temperatureCumulee = temperatureCumulee + tab.getPression();
			
			if(tab.getPression() != 0){
				i++;
				pressionCumulee = pressionCumulee + tab.getPression();
			}
		}
		
		
		temperatureMoyenne = temperatureCumulee/tabClim.length;
		pressionMoyenne = pressionCumulee/i;
		
		System.out.println("Température moyenne = " + temperatureMoyenne);
		System.out.println("Pression moyenne = " + pressionMoyenne);

	}

	
}
