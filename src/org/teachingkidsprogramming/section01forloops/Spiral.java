package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Whites;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(120);
    Tortoise.getBackgroundWindow().setBackground(Grays.Black);
    ColorWheel.addColor(Whites.GhostWhite);
    ColorWheel.addColor(Greens.Lime);
    //    ColorWheel.addColor(Purples.Purple);
    for (int i = 0; i < 1000000000; i++)
    {
      Tortoise.turn(1000000000 / 666);
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 1);
    }
  }
}
