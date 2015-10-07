package com.miscellaneous;

public class SongOfPi {
	
	
	public void chkSongOfPi(String text)
	{
		if(text.isEmpty() || text==null) {
			System.out.println("It's not a pi song.");
		}
	
		String pi="3.1415926535897932384626433833";
		String piCompare=pi.replaceAll("[^0-9]", "");
		char[] piArray = piCompare.toCharArray();
		
		String[] textArr = text.split(" ");		
		if(textArr!=null)
		{
			int[] textlen = new int[textArr.length];
			for(int i=0; i < textArr.length ;i++)
			{
				String tempText = textArr[i].replaceAll("[^a-zA-Z]", ""); 
				textlen[i] = tempText.length();
			}
			
			boolean isequal = true;
			for(int j=0 ; j < textlen.length ;j++){
				
				if(!(new Integer (textlen[j]).toString()).equals((Character.toString(piArray[j]))) ){
					isequal = false;
				}
			}
			
			if(!isequal) {
				System.out.println("It's not a pi song.");
			}
			else {
				System.out.println("It's a pi song.");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SongOfPi songOfPi = new SongOfPi();
		songOfPi.chkSongOfPi("Can I have a large container of tea right now");
	}

}
