package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;

import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.setPenWidth(1);
    Tortoise.setSpeed(10);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(Color.BLACK);
    Double line = 10.5;
    Double zoom = 1.1;
    for (int i = 0; i < 70; i++)
    {
      //
      line = weaveOneLayer(line, zoom);
      //
      zoom = zoom * 1.3;
    }
  }
  private static Double weaveOneLayer(Double line, Double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      //
      drawTriangle(line);
      //
      Tortoise.turn(360 / 6);
      line = line + zoom;
    }
    return line;
  }
  private static void drawTriangle(Double line)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(line);
      Tortoise.turn(360 / 3);
    }
  }
}
