package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
	public static int badInputCounter = 0;
  
	public static void main(String[] args)
  {		
		//int answer = 90;
		
    String numberOfPeopleYouKilled = MessageBox.askForTextInput("Tell how many people you killed.");
    if (numberOfPeopleYouKilled.isEmpty())
    {
    	badInputCounter++;
      MessageBox.showMessage("Follows instructions or leave.");
      numberOfPeopleYouKilled = askNumberOfPeopleYouKilledAgain();
    }
    String didAfterWards = MessageBox.askForTextInput("What did you do next.");
   if(didAfterWards.isEmpty())
   {
	   badInputCounter++;
	   MessageBox.showMessage("Follows instructions or leave.");
	      didAfterWards = askDidAfterWardsAgain();
   }
   if(didAfterWards.matches("[\\d]*")) 
   {
	   badInputCounter++;
	   if(badInputCounter >= 3)
	   {
		   MessageBox.showMessage("I told you you were going to leave!!!");
		   System.exit(0);
	   }
	MessageBox.showMessage("That is not what you did afterwards. You could try again.");
	didAfterWards = askDidAfterWardsAgain();
   }
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part.");
    if(currentBodyPart.isEmpty()) 
    {
    	badInputCounter++;
    	 MessageBox.showMessage("Follows instructions or leave.");
         currentBodyPart = askCurrentBodyPartAgain();
    }
    if(currentBodyPart.matches("[\\d]*")) 
    {
    	badInputCounter++;
 	MessageBox.showMessage("That is not a body part. You could try again.");
 	currentBodyPart = askCurrentBodyPartAgain();
    }
    String VeteranStory = (" Today I woke up and killed " + numberOfPeopleYouKilled + " people, " + "then I "
        + didAfterWards + " ." + "Then I chopped this one guy's " + currentBodyPart + " off.");
    MessageBox.showMessage(VeteranStory);
  
  }//end of main
  
  public static String askNumberOfPeopleYouKilledAgain() 
  {
	  String numberOfPeopleYouKilled = MessageBox.askForTextInput("Tell how many people you killed.");
	  return numberOfPeopleYouKilled;
  }
  public static String askDidAfterWardsAgain() 
  {
	  String didAfterWards = MessageBox.askForTextInput("What did you do next.");
	  return didAfterWards;
  }
  public static String askCurrentBodyPartAgain() 
  {
	  String currentBodyPart = MessageBox.askForTextInput("Enter a body part.");
	  return currentBodyPart;
  }
   
}//end of Adlibs class