package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String numberOfPeopleYouKilled = MessageBox.askForTextInput("Tell how many people you killed.");
    String didAfterWards = MessageBox.askForTextInput("What did you do next.");
    if (numberOfPeopleYouKilled.isEmpty())
    {
      MessageBox.showMessage("Follows instructions or leave.");
      return;
    }
    else if (numberOfPeopleYouKilled.matches("[\\d]*"))
    {
      MessageBox.showMessage("That is not an adverb get it right.");
      return;
    }
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part.");
    String VeteranStory = (" Today I woke up and killed " + numberOfPeopleYouKilled + " people, " + "then I "
        + didAfterWards + " ." + "Then I chopped this one guy's " + currentBodyPart + " off.");
    MessageBox.showMessage(VeteranStory);
  }
}