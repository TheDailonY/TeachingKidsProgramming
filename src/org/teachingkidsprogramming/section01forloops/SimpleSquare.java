package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    for (int i = 0; i < 1; i++)
    {
      Tortoise.setSpeed(5);
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.setPenWidth(5);
      Tortoise.move(50);
      Tortoise.turn(90);
      Tortoise.move(100);
      Tortoise.turn(-90);
      Tortoise.move(50);
      Tortoise.turn(180);
      Tortoise.move(50);
      Tortoise.turn(90);
      Tortoise.move(50);
      Tortoise.turn(90);
      Tortoise.move(50);
    }
  }
}