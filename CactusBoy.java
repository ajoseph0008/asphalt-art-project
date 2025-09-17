import org.code.neighborhood.*;
public class CactusBoy extends BackgroundPainter{
  public void makeCactus (String color1, String color2, String color3){
    //Starts making the stalk of the cactus
    turnRight();
    for(int i = 0; i < 6; i++){
      move();
    }
    
    turnRight();
    for(int i = 0; i < 9; i++){
      move();
    }
    
    for(int x = 0; x < 15; x++){
      int y = 0;
      paint(color1);
      move();
      while (y < 6){
       paint(color3);
        move();
        y++;
      }
      paint(color1);
      if(isFacingWest()){
        turnRight();
        move();
        turnRight();
      } else {
        turnLeft();
        move();
        turnLeft();
      }
    }
    
    //Making the left cactus pad
    turnRight();
    move();
    turnRight();
    
    for(int z =0; z < 6; z++){
      move();
      paint(color1);
    }
    
    move();
    turnRight();
    move();
    turnRight();
    paint(color1);
    for(int w = 0; w < 13; w++){
      move();
      paint(color3);
    }
    move();
    paint(color1);
    turnLeft();
    move();
    paint(color1);
    turnLeft();
    for(int v = 0; v < 14; v++){
      move();
      paint(color3);
    }
    move();
    paint(color1);
    move();
    turnRight();
    move();
    paint(color1);
    turnRight();
    for (int u = 0; u < 2; u++){
      for(int t = 0; t < 4; t++){
        move();
        paint(color3);
      }
      if (isFacingEast()){
        turnLeft();
        move();
        turnLeft();
        paint(color1);
      } else{
        turnRight();
        paint(color1);
        move();
        turnRight();
        paint(color1);
      }
    }
      for (int s = 0; s < 3; s++){
        move();
        paint(color3);
      }
      move();
      paint(color1);
      turnLeft();
      move();
      turnLeft();
      move();
      paint(color1);
      move();
      paint(color3);
      move();
      paint(color3);
      move();
      paint(color1);
      turnRight();
      move();
      turnRight();
      move();
      paint(color1);
      move();
    paint(color1);
    turnLeft();
    move();
    paint(color2);
    turnLeft();
    move();
    paint(color2);
    turnLeft();
    for (int r = 0; r < 4; r++){
      move();
    }
    turnLeft();
    for(int q = 0; q < 3; q++){
      move();
    }
    move();
    turnRight();
    move();
    turnLeft();
    for(int n = 0; n < 11; n++){
      paint(color3);
      move();
    }
    paint(color1);
    turnLeft();
    move();
    turnLeft();
    for(int m = 0; m < 11; m++){
      move();
    }
    turnLeft();
    turnLeft();
    for(int p = 0; p < 4; p++){
      paint(color1);
      move();
    }
    //Continues making the middle part of the stem
    for(int o = 0; o < 3; o++){
      paint(color1);
      move();
      for(int y = 0; y < 6; y++){
       paint(color3);
        move();
      }
      paint(color1);
      if(isFacingWest()){
        turnRight();
        move();
        turnRight();
      } else {
        turnLeft();
        move();
        turnLeft();
      }
    }
    // Starts making the right cactus pad
    turnLeft();
    move();
    turnLeft();
    for(int l = 0; l < 6; l++){
      move();
      paint(color1);
    }
    move();
    turnLeft();
    move();
    turnLeft();
    paint(color1);
    for(int k = 0; k < 13; k++){
      move();
      paint(color3);
    }
    move();
    paint(color1);
    turnRight();
    move();
    paint(color1);
    turnRight();
    for(int j = 0; j < 14; j++){
      move();
      paint(color3);
    }
    move();
    paint(color1);
    move();
    turnLeft();
    move();
    turnLeft();
    paint(color1);
    for(int h = 0; h < 15; h++){
      move();
      paint(color3);
    }
    move();
    paint(color1);
    turnRight();
    move();
    paint(color1);
    turnRight();
    for(int g = 0; g < 6; g++){
      move();
      paint(color3);
    }
    for(int f = 0; f < 6; f++){
      move();
      paint(color1);
    }
    for(int e = 0; e < 2; e++){
      paint(color1);
      move();
      for(int y = 0; y < 3; y++){
        paint(color3);
        move();
      }
      paint(color1);
      if (isFacingEast()){
        turnLeft();
        move();
        turnLeft();
      } else {
        turnRight();
        move();
        turnRight();
        move();
        paint(color1);
        move();
        paint(color3);
        move();
        paint(color3);
        move();
        paint(color1);
        turnLeft();
        move();
        turnLeft();
        move();
        paint(color1);
        move();
        paint(color1);
        turnRight();
        move();
        paint(color2);
        turnRight();
        move();
        paint(color2);
        turnRight();
      }
    }
    //Returns painter back to the stem
    for(int d = 0; d < 4; d++){
      move();
      turnRight();
      move();
      move();
      turnLeft();
    }
    turnRight();
    turnRight();
    move();
    turnLeft();
    //Finishes the stem and the whole cactus
    for(int c = 0; c < 6; c++){
      paint(color1);
      move();
      for(int y = 0; y < 6; y++){
       paint(color3);
        move();
      }
      paint(color1);
      if(isFacingWest()){
        turnRight();
        move();
        turnRight();
      } else {
        turnLeft();
        move();
        turnLeft();
      }
    }
    for (int b = 0; b < 6; b++){
      move();
      paint(color1);
    }
  }
}