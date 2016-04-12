import java.awt.Color;

import fr.demos.exos.Taille.Chemise;
import static fr.demos.exos.Taille.Taille.XXL;;



public class TestEnum {

	public static void main(String[] args) {
	Chemise touteNeuve = new Chemise("funky", new Color(255,123,156) , XXL);
		
		System.out.println(touteNeuve);
	}
}
