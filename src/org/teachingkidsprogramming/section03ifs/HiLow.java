package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random r = new Random();
    int askForNumericalMaxHigh = MessageBox
        .askForNumericalInput("What do you want the max to be?" + " Please note over 1000 12 tries,"
            + " Under 700 8 tries, " + "Under 500 7 tries," + " Under 200 5 tries!");
    //int answer = r.nextInt(askForNumericalMaxHigh);
    int askForNumericalLeastLow = MessageBox
        .askForNumericalInput("What do you want the least to be?" + " Please note over -1000 22 tries,"
            + " Under -700 18 tries, " + "Under -500 17 tries," + " Under -200 15 tries!");
    // int answer2 = r.nextInt(askForNumericalLeastLow);
    int answer = r.nextInt(askForNumericalMaxHigh - askForNumericalLeastLow) + askForNumericalLeastLow;
    /* 
    Random r = new Random();
    int Low = 10;
    int High = 100;
    int R = r.nextInt(High - Low) + Low;
    int numberOfGuesses = 8;
     */
    for (int i = 0; i < answer; i++)
    {
      // numberOfGuesses = MessageBox.askForNumericalInput("Please enter the number of guesses:");
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      int numberOfGuesses = answer;
      if (askForNumericalMaxHigh > 1000)
      {
        numberOfGuesses = 12;
      }
      if (askForNumericalMaxHigh < 700)
      {
        numberOfGuesses = 8;
      }
      if (askForNumericalMaxHigh < 500)
      {
        numberOfGuesses = 7;
      }
      if (askForNumericalMaxHigh < 200)
      {
        numberOfGuesses = 5;
      }
      if (askForNumericalLeastLow > -1000)
      {
        numberOfGuesses = 22;
      }
      if (askForNumericalLeastLow < -700)
      {
        numberOfGuesses = 18;
      }
      if (askForNumericalLeastLow < -500)
      {
        numberOfGuesses = 17;
      }
      if (askForNumericalLeastLow < -200)
      {
        numberOfGuesses = 15;
      }
      if (answer < guess)
      {
        MessageBox.showMessage("Guess is too high.");
      }
      if (answer > guess)
      {
        MessageBox.showMessage("Guess is too low.");
      }
      if (answer < guess)
      {
        MessageBox.showMessage("Guess is too high.");
      }
      if (answer > guess)
      {
        MessageBox.showMessage("Guess is too low.");
        MessageBox.showMessage("You lost");
      }
    }
  }
}
