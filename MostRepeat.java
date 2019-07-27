package GUVI_PLAYER;

import java.util.Scanner;

public class MostRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		 int characterCount = 0;
	        int maxCharacter = 0;
	        char maxCharacterChar = '.';

	        char[] cArray = word.toCharArray();

	        for(int i =0; i < cArray.length; i++)
	        {
	            int characterASCII = (int)cArray[i];
	            characterCount = 0;
	         
	            for(int x = 0; x < cArray.length; x++)
	            {
	                if(characterASCII == (int)cArray[x])
	                {
	                    characterCount ++;	                  
	                    if(characterCount > maxCharacter)
	                    {
	                        maxCharacter = characterCount;
	                        maxCharacterChar = cArray[i];
	                    }
	                }
	            }
	        }
	        System.out.println(maxCharacterChar);

	}

}
