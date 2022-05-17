package museum;

import java.util.ArrayList;
import java.util.Collections;

import museum.abstracts.Art;
import museum.models.Painting;
import museum.models.Sculpture;

public class Museum {
	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(new Painting("The Light in the Dark", "Tim Dobertt", "A candle melting in the dark in a bare hand", "oil on canvas"));
		museum.add(new Painting("Garden Delights", "NiceBleed", "A Astronaut fading into the flowers", "pastel paint"));
		museum.add(new Painting("Wetlands Black Water Lily Pads", "unkown", "Lily pads are a fixture in ponds, still waters in the Okefenokee where the water is black from the tannins, the decaying vegetation creates.", "oil painting"));
		museum.add(new Sculpture("Pieta", "Michelangelo", "dt depicts the dead body of Jesus after his crucifixion, draped across the Virgin Mary's lap as she looks down upon his body in grief.", "italian marble"));
		museum.add(new Sculpture("The Thinker ", "Auguste Rodin", "depicted Dante reflecting on The Divine Comedy", "bronze"));
		
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}
	}

}
