import org.code.neighborhood.*;
public class BackgroundPainter extends SunnyDay{
/**
  *This method paints the whole background
  *It paints the whole background with the color you want except for the bottom row and the top left point.
  */
public void paintSky(String color){
  int y = 0;
  while(y < 31){
     if(canMove()){
  move();
  paint(color);
  } else {
    if(isFacingEast()){
      turnRight();
      move();
      turnRight();
      paint(color);
      y++;
    } else {
      turnLeft();
      move();
      turnLeft();
      paint(color);
      y++;
    }
  }
 }
}
/**
  *Paints the bottom five lines in the color you put
  */
  public void paintSand (String color){
  int x = 0;
  while(x < 5) //This while loop while happen 5 times because each time it happens it adds one until it equals 5
    if(canMove()){
      paint(color);
      move();
    } else {
      if(isFacingEast()){
        paint(color);
        turnLeft();
        move();
        turnLeft();
        x++;
      } else {
        paint(color);
        turnRight();
        move();
        turnRight();
        x++;
      }
    }
}
//Paints small little cacti
public void miniCacti(String color){
  int x = 0;
  int y = 0;
  int z = 0;
  int w = 0;
  turnLeft();
  move();
  turnRight();
  while (x < 6){
    move();
    x++;
  }
  while (y < 4){
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    y++;
  }
  move();
  turnLeft();
  move();
  paint("MediumVioletRed");
  turnLeft();
  turnLeft();
  move();
  move();
  paint("LawnGreen");
  turnLeft();
  turnLeft();
  move();
  turnRight();
  while(z < 20){
    move();
    z++;
  }
  while (w < 4){
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    w++;
  }
  move();
  turnLeft();
  move();
  paint("DeepPink");
  turnLeft();
  turnLeft();
  move();
  move();
  paint("LawnGreen");
  turnLeft();
  turnLeft();
  move();
  turnRight();
  
}
  
}