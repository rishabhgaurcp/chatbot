import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**

javac MagpieRunner4.java
RUN COMMAND: java MagpieRunner4.java
QUIT COMMAND: Bye
basic command to copy paste:
|| findKeyword(statement, "sad" >= 0

 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */

public class Magpie4
{


// List<String> monkeFacts = new List<String>() {{
// monkeFacts.add("monke have opposable thumbs, we play monke games");
// monkeFacts.add("two main types of monke: new world and old world. old world in asia/africa n stuf; new world in murica");
// monkeFacts.add("old world monke fill cheek pouches with food monke swallow it later when they find a safe place to rest never spit");
// monkeFacts.add("howler monke are loudest monke");
// monkeFacts.add("ape not monke");
// monkeFacts.add("gorilla is not same guerilla");
// monkeFacts.add("pygmy marmoset smaller than hasbulla!");
// monkeFacts.add("squirrel monke have more than 25 diff calls n stuf");
// monkeFacts.add("monke live between 10 n 50 yrs n stuf");
// monkeFacts.add("patas are fastest monke run 35 mph ong no cap my gang");
// monkeFacts.add("white-faced capuchin monke say hello by sticking finger up other monke nose");
// }};


  
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "its monke time";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */

  String prev = "";
  String resp = "";
  String previnput = "";
  Boolean repeat = false;

	public String getResponse(String statement)
	{

    List<String> monkeFacts = new ArrayList<String>();
monkeFacts.add("monke have opposable thumbs, we play monke games");
monkeFacts.add("two main types of monke: new world and old world. old world in asia/africa n stuf; new world in murica");
monkeFacts.add("old world monke fill cheek pouches with food monke swallow it later when they find a safe place to rest never spit");
monkeFacts.add("howler monke are loudest monke");
monkeFacts.add("ape not monke");
monkeFacts.add("gorilla is not same guerilla");
monkeFacts.add("pygmy marmoset smaller than hasbulla!");
monkeFacts.add("squirrel monke have more than 25 diff calls n stuf");
monkeFacts.add("monke live between 10 n 50 yrs n stuf");
monkeFacts.add("patas are fastest monke run 35 mph ong no cap my gang");
monkeFacts.add("white-faced capuchin monke say hello by sticking finger up other monke nose");
    
    Random randomizer = new Random();
		String randomListElement = monkeFacts.get(randomizer.nextInt(monkeFacts.size()));
		String response = "";
    boolean negative = false;
    
    if ((findKeyword(statement, "no") >= 0)
       || findKeyword(statement, "not") >= 0)
    {
      negative = true;
    }
    
		if (statement.length() == 0)
		{
			response = "gimme words ma main monke man";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "no i dont care about ur family, i want to speak about MONKE";
		}

    else if (previnput == statement){
      response = "my monke bro y u repeatin urself? u only makin monke more confused";
    }

    //more responses below
    
    else if (statement == "hello there")
    {
			if (repeat){
        response = "said that already";
      }
      else{
        response = "general kenobi";
      }
		}

    else if (findKeyword(statement, "apologize") >= 0
        || findKeyword(statement, "sorry") >= 0
        || findKeyword(statement, "its ok") >= 0
        || findKeyword(statement, "my bad") >= 0)
    {
		  if (negative){
        response = "hUh? monke ANGR!";
      }
      else{
        response = "monke forgive";
      }
		}

    else if (findKeyword(statement, "sad") >= 0
        || findKeyword(statement, "upset") >= 0
        || findKeyword(statement, "mad") >= 0
        || findKeyword(statement, "grief") >= 0
        || findKeyword(statement, "angry") >= 0)
    {
			if (negative){
        response = "oh... monke condolences?";
      }
      else{
        response = "monke condolences";
      }
		}

    else if (findKeyword(statement, "doge") >= 0
        || findKeyword(statement, "cheems") >= 0
        || findKeyword(statement, "funny yellow dog") >= 0)
    {
			response = "funny yellow dog";
		}

    else if ((findKeyword(statement, "silly") >= 0)
        || statement.contains("dum")
        || findKeyword(statement, "goofy") >= 0
        || findKeyword(statement, "foolish") >= 0){
      response = "why yes, monke is quite " + getRandomGoofy();
    }
      
    else if (findKeyword(statement, "hate") >= 0
        || findKeyword(statement, "despise") >= 0)
    {
			response = "\"never make hate monke only makes love\" - sun 'monke' tzu";
		}


    // fax choosing
  

      
    else if ((prev.contains("would you like to hear about monke") || prev.contains("want have another one?"))) {
        if (findKeyword(statement, "yes") >= 0
        || findKeyword(statement, "sure") >= 0
        || findKeyword(statement, "yea") >= 0
        || findKeyword(statement, "yeah") >= 0){
          response = "here cool monke fact: " + randomListElement;
        }
        else if (findKeyword(statement, "no") >= 0
        || findKeyword(statement, "nope") >= 0
        || findKeyword(statement, "nah") >= 0
        || findKeyword(statement, "nuh uh") >= 0
        || findKeyword(statement, "not") >= 0){
          response = "dont care have cool monke fact anyway: " + randomListElement;
        }
        else if(findKeyword(statement, "help") >= 0
        || findKeyword(statement, "escape") >= 0
        || findKeyword(statement, "quit") >= 0
        || findKeyword(statement, "leave") >= 0
        || findKeyword(statement, "stop") >= 0
        || findKeyword(statement, "halt") >= 0
        || findKeyword(statement, "cease") >= 0){
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println("there is no escape. there is only monke fax.");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          System.out.println(" ");
          response = "jk im just sad now";
        }
      else{
        response = "ok fine leave if you didnt want the monke fax anyways :(";
      }
    }

    else if (prev.contains("cool monke fact")){
      response = "want have another one?";
    }
      

// arbitrary excitment words
      else if (statement.contains("excite")
        || findKeyword(statement, "happy") >= 0
        || findKeyword(statement, "wonderful") >= 0
        || findKeyword(statement, "awesome") >= 0
        || findKeyword(statement, "let's go") >= 0 
        || findKeyword(statement, "epic") >= 0 )
      {
        response = "WOOO OOO AAA AAAHH MONKE HAPPY";
      }
      else if (statement.contains("excite")
        || findKeyword(statement, "happy") >= 0
        || findKeyword(statement, "wonderful") >= 0
        || findKeyword(statement, "should") >= 0
        || findKeyword(statement, "great") >= 0
        || findKeyword(statement, "cool") >= 0  && negative)
      {
        response = "monke sad if you sad";
      }

    else if (findKeyword(statement, "rip") >= 0
        || findKeyword(statement, "darn") >= 0
        || findKeyword(statement, "well") >= 0
        || findKeyword(statement, "yikes") >= 0
        || findKeyword(statement, "ok") >= 0
        || findKeyword(statement, "okay") >= 0
        || findKeyword(statement, "mhm") >= 0
        || findKeyword(statement, "indeed") >= 0
        || findKeyword(statement, "good") >= 0
        || findKeyword(statement, "uh oh") >= 0)
    {
			if (statement.contains("you?")){
        response = "monke is doing well, thinkin about monkes";
      }
      else{
        response = "so anyway, would you like to hear about monkes?";
      }
		}

    else if (findKeyword(statement, "bored") >= 0
        || findKeyword(statement, "nothing") >= 0
        || findKeyword(statement, "doing well") >= 0
        || statement.contains("which monke")
        || statement.contains("what monke"))
    {
			response = "would you like to hear about som monkes?";
		}

    else if (prev.contains("?") && (previnput.contains("?") == false) && (prev.contains("huh") == false)){
      response = "ah ok monke see";
    }
        
      else if (statement.contains("day")
        || findKeyword(statement, "afternoon") >= 0
        || findKeyword(statement, "evening") >= 0
        || findKeyword(statement, "morning") >= 0)
        {
          response = "today is good day to be monke";
        }
      
    

      else if (findKeyword(statement, "hi") >= 0
				|| findKeyword(statement, "hello") >= 0
				|| findKeyword(statement, "yo") >= 0
				|| findKeyword(statement, "hey") >= 0
      	|| findKeyword(statement, "whats up") >= 0
        || findKeyword(statement, "gday") >= 0
        || findKeyword(statement, "howdy") >= 0
        || findKeyword(statement, "mornin") >= 0
        || findKeyword(statement, "whats poppin") >= 0
        || findKeyword(statement, "whats the story") >= 0
        || findKeyword(statement, "good afternoon") >= 0
        || findKeyword(statement, "hola") >= 0
        || findKeyword(statement, "bonjour") >= 0
        || findKeyword(statement, "ello") >= 0
        || findKeyword(statement, "good morning") >= 0
        || findKeyword(statement, "good evening") >= 0)
      {
        response = getRandomGreeting();
      }

      else if (statement.contains("day")
        || findKeyword(statement, "afternoon") >= 0
        || findKeyword(statement, "evening") >= 0
        || findKeyword(statement, "morning") >= 0)
        {
          response = "today is good day to be monke";
        }

    //food
    else if (statement.contains("cucumber")
        || statement.contains("apple")
        || statement.contains("pear")
        || statement.contains("maple syrup")
        || statement.contains("orange")
        || statement.contains("bread")
        || statement.contains("taco")
        || statement.contains("spiders")
        || statement.contains("sandwich")
        || statement.contains("egg")
        || statement.contains("nut")
        || statement.contains("papaya")
        || statement.contains("strawberr")
        || statement.contains("mango")
        || statement.contains("pineapple")
        || statement.contains("watermelon")
        || statement.contains("steak")
        || statement.contains("chocolate")
        || statement.contains("beef")
        || statement.contains("pork")
        || statement.contains("chicken")
        || statement.contains("starving")
        || statement.contains("hungry")
        || statement.contains("juice"))
    {
			response = "where banana ;)";
		}

    else if (findKeyword(statement, "know that") >= 0 
          || findKeyword(statement, "know about") >= 0
          || findKeyword(statement, "know what") >= 0)
          {
            if (statement.contains("monke") 
          ||findKeyword(statement, "banana") >= 0 
          ||findKeyword(statement, "ape") >= 0 
          ||findKeyword(statement, "orangutan") >= 0 
          ||findKeyword(statement, "proboscis") >= 0 
          ||findKeyword(statement, "primate") >= 0)
          {
            response = "why yes. monke is quite the connoissuer of such things.";
          }
          else{
          response = knowIdentifier(statement);
        }
    }

    else if (statement.contains("banana")){
        response = "give monke banana";
      }

    //handling questions
    else if(statement.contains("?")) {
      if (findKeyword(statement, "do you") >= 0
        || findKeyword(statement, "would you") >= 0
        || findKeyword(statement, "can you") >= 0
        || statement.contains("u want")
        || findKeyword(statement, "should you") >= 0) 
      {
        if ((findKeyword(statement, "like") >= 0)
        || findKeyword(statement, "want") >= 0){
          if (statement.contains("monke")){
            response = "yes, monke do like monke";
          }
          else if (statement.contains("banana")){
            response = "yes. give. NOW";
          }
          else{
            response = objectIdentifierLike(statement);
          }
        }
        else{
        response = "yes thats a monkeing good idea";
        }
      }
      else if (statement.contains("favorite")){ //favorites
        if (statement.contains("monke")){
          response = "fav monke is orangatanga";
        }
        else if (statement.contains("food")){
          response = "monke fav is banana";
        }
        else if (statement.contains("color")){
          response = "brown, color of monke and color of throwing things";
        }
        else{
          response = "yes";
        }
      }

    else if (statement.contains("banana")){
      if (repeat){
        response = "where can monke get banana";
      }
      else{
        response = "monke want banana";
      }
    }
      else if ((findKeyword(statement, "it") >= 0)){
        response = "monke no understand concept of word \"it\", monke sorry";
        }
      else if (statement.contains("return")){
        response = "yes, return to monke of course";
      }
      else{
        response = getRandomResponse();
      }
    } // other questions

    else if (statement.contains("return")
          || findKeyword(statement, "reject humanity") >= 0){
      response = "u should return to monke";
    }

    //test objects
    else if ((findKeyword(statement, "that") >= 0)
    || (findKeyword(statement, "this") >= 0)
    || (findKeyword(statement, "the") >= 0))
    {
      response = objectIdentifier(statement);
    }

    else if (findKeyword(statement, "monke") >= 0)
		{
			if (!negative){
        response = "mmmm monke";
      }
      else {
        response = "yes monke";
      }
    }

    // Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
      
    else {
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
    }
    
    resp = response;
    if ((resp != prev)){
      repeat = false;
    }
    else{
      repeat = true;
    }
    
    if (resp == "said that already"){
      repeat = true;
    }
    prev = resp;
    previnput = statement;
    
		return response;
	}
  
  
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	
  private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "monke, my g, u sure u want to " + restOfStatement + "?";
	}

private String objectIdentifier(String statement)
  {
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
    if (findKeyword(statement, "this") >= 0){
		  int psn = findKeyword (statement, "this", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "monke, u talkin bout this " + restOfStatement + "?";
    }
    else if (findKeyword(statement, "that") >= 0){
      int psn = findKeyword (statement, "that", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "monke, u talkin bout that " + restOfStatement + "?";
    }
    else if (findKeyword(statement, "the") >= 0){
      int psn = findKeyword (statement, "the", 0);
		  String restOfStatement = statement.substring(psn + 3).trim();
		  return "monke, u talkin bout the " + restOfStatement + "?";
    }
    else{
      return "how did u get here";
    }
	}

  private String objectIdentifierLike(String statement)
  {
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
    if (findKeyword(statement, "like") >= 0){
		  int psn = findKeyword (statement, "like", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "monke not sure, do u like " + restOfStatement + "?";
    }
    else if (findKeyword(statement, "want") >= 0){
      int psn = findKeyword (statement, "want", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "nah, monke no want " + restOfStatement;
    }
    else{
      return "how did u get here";
    }
	}

  private String knowIdentifier(String statement)
  {
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
    if (findKeyword(statement, "about") >= 0){
		  int psn = findKeyword (statement, "about", 0);
		  String restOfStatement = statement.substring(psn + 5).trim();
		  return "no, monke no know about " + restOfStatement + ". is it about monke?";
    }
    else if (findKeyword(statement, "that") >= 0){
      int psn = findKeyword (statement, "that", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "no, monke didnt know that " + restOfStatement + ". but monke does not care for such things. monke only interested in monkes.";
    }
    else if (findKeyword(statement, "what") >= 0){
      int psn = findKeyword (statement, "what", 0);
		  String restOfStatement = statement.substring(psn + 4).trim();
		  return "monke not know what " + restOfStatement + " is. but monke does not care for such things. monke only interested in monkes.";
    }
    else{
      return "how did u get here";
    }
	}
	
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */


	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	

	
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}
	


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 9;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "bro u sound like monke on monke powder rn";
		}
		else if (whichResponse == 1)
		{
			response = "monke, u soundin bananas rn bruv";
		}
		else if (whichResponse == 2)
		{
			response = "monke confused help monke understand";
		}
		else if (whichResponse == 3)
		{
			response = "monke 1 monke 2 monke no understand u";
		}
    else if (whichResponse == 4)
		{
			response = "monke unsure";
		}
    else if (whichResponse == 5)
		{
			response = "confusioned";
		}
    else if (whichResponse == 6)
		{
			response = "huh??? monke dunno";
		}
    else if (whichResponse == 7)
		{
			response = "where banan- uh i mean where understanding";
		}
    else if (whichResponse == 8)
		{
			response = "return to conversation about monke pls";
		}
    else if (whichResponse == 9)
		{
			response = "monke no comprende";
		}

		return response;
	}

  private String getRandomGreeting()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "whats good in the hood my fellow primate enjoyer";
		}
		else if (whichResponse == 1)
		{
			response = "its good to see you";
		}
		else if (whichResponse == 2)
		{
			response = "how ard you doing?";
		}
		else if (whichResponse == 3)
		{
			response = "MONKEY SAYS HI";
		}

		return response;
	}


  private String getRandomGoofy()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "goofy";
		}
		else if (whichResponse == 1)
		{
			response = "silly";
		}
		else if (whichResponse == 2)
		{
			response = "rambunctious";
		}
		else if (whichResponse == 3)
		{
			response = "wacky and uncharacteristic";
		}

		return response;
	}

 

}
