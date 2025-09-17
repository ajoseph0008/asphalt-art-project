import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
//b makes the background and the cactus
    CactusBoy b = new CactusBoy();
    //j makes the 4 x 4 sun in the top left corner
SunnyDay s = new SunnyDay();
    b.paintSky("LightSkyBlue");
    s.paintSun("Yellow");
    b.paintSand("LemonChiffon");
    b.miniCacti("LimeGreen");
    b.makeCactus("Green","Fuchsia","LimeGreen");    
  }
}