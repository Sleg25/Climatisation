package fr.demos.exos;

public class Addition {

	public static void main(String[] args){
		// boucle sur args r�cup�rer les entiers (Integer.parserInt)
		int ad = 0;

		try{
		for(String i : args){
			ad = ad + Integer.parseInt(i);
			}
		System.out.println(ad);
		}catch (NumberFormatException erreur){
			System.out.println("Une saisie n'est pas correcte. Tu ne comprends rien � ce que tu fais teub� !!!!!!!!!!!!!!!!!!!!");
		}	
	}
}
