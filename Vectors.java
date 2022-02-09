package yourPackage.path;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Vectors {

    public Vector vectorxx(Location vector1, Location vector2){
	double g = -0.09;
	double d = vector2.distance(vector1);
	double VectorX = (1.0 + 0.7 * d) * (vector2.getX() - vector.getX()) / d;
	double VectorY = (1.0 + 0.03 * d) * (vector2.getY() - vector.getY()) / d - 0.5 * g * d;
	double VectorZ = (1.0 + 0.07 * d) * (vector2.getZ() - vector.getZ()) / d;
	return new Vector(VectorX, VectorY, VectorZ);
    }
}
