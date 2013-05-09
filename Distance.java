
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.wrappers.Tile;

public class Distance {
public static double distanceToNpc(Tile playerTile,  Tile NpcTile) {
	double hypotenuse; 
	//if(playerTile != null && NpcTile != null) {
	double distanceOne = Math.pow(Math.abs(NpcTile.getY()) - Math.abs(playerTile.getY()), 2);
	double distanceTwo = Math.pow(Math.abs(playerTile.getX()) - Math.abs(NpcTile.getX()), 2); 
	hypotenuse = distanceOne + distanceTwo;
	return Math.round(Math.sqrt(hypotenuse));
	//	} else {
		//	return 0;
		//s}
	}

public static boolean walkToNpc(Tile npcTile) {
    int npcX = npcTile.getX() - 1;
    int npcY = npcTile.getY() - 1;
    Tile t = new Tile(npcX, npcY, 0);
    return  Walking.walk(t);
    
}
}
