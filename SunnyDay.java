import org.code.neighborhood.*;
public class SunnyDay extends PainterPlus{
  //Makes a 4x4 sun
  public void paintSun(String color){
    for(int i = 0; i < 4; i++) {
      for (int n =0; n < 3; n++) {
      paint(color);
      move();
      }
      paint(color);
     if(isFacingEast()){
       turnRight();
       move();
       turnRight();
     }else{
       turnLeft();
       move();
       turnLeft();
     }
  }
}
}
  