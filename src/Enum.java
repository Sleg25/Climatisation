
public class Enum {

	public enum TauxTaxe{
		// liste des instances légales
		REDUIT(5.5) , NORMAL(19.6), LUXE(33.3) ;
		
		
		final double valeur ; // Champ d'instance
		// ce constructeur NE FAIT PAS PARTIE DE l'A.P.I.
		// seul le code de la classe peut créer des instances légales
		
		
		TauxTaxe(double vl) { this.valeur = vl ; }
		
		
		public double getValeur() { return this.valeur ; }
	}
}
