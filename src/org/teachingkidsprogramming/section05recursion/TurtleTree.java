package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    int branchLength = 90;
    Tortoise.getBackgroundWindow().setBackground(Color.BLACK);
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    Tortoise.setPenWidth(7);
    if (branchLength > 0)
    {
      adjustColor(branchLength);
      Tortoise.move(branchLength);
      drawLowerBranches(branchLength);
      drawLowerBranches(branchLength);
      adjustColor(branchLength);
      Tortoise.move(branchLength);
      drawShorterBranch(branchLength);
      drawShorterBranch(branchLength);
      drawShorterBranch(branchLength);
    }
  }
  public static void adjustColor(int branchLength)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branchLength));
  }
  private static void drawLowerBranches(int branchLength)
  {
    Tortoise.turn(30);
    drawShorterBranch(branchLength);
    Tortoise.turn(-60);
    drawShorterBranch(branchLength);
    Tortoise.turn(30);
    adjustColor(branchLength);
    Tortoise.move(-branchLength);
  }
  private static void drawShorterBranch(int branchLength)
  {
    drawBranch(branchLength - 10);
  }
}