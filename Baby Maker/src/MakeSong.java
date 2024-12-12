import java.util.ArrayList;

public class MakeSong
	{
	static	ArrayList <Song> playlist = new ArrayList <Song> ();
	static int big=0;
		public static void main(String[] args)
			{
				
			
				
					playlist.add(new Song("Claire de Lune", "Claude Debussy", 300));
					playlist.add(new Song("Love Like You", "Rebecca Sugar", 180));
					playlist.add(new Song("Farewell", "Lena Raine", 480));
					playlist.add(new Song("Cara Mia Addio", "Mike Morasky", 150));
					playlist.add(new Song("Waltz No.2", "Dmitri Shostakovich", 300));
					
				//	printList();
				//	printList();
					longestWord();
					printList();
			}

		public static void printList()
		{
			for(int i=0; i<playlist.size(); i++)
				{
			System.out.println(playlist.get(i).getTitle());
			System.out.println(playlist.get(i).getArtist());
			System.out.println(playlist.get(i).getLengthInSeconds());
			playlist.get(i).setLengthInSeconds((playlist.get(i).getLengthInSeconds()) -10);
			playlist.get(0).setArtist("Adam Ward");
				}
			
		}
		public static void longestWord()
		{
			
			for(int i=0; i<playlist.size(); i++)
				{
					playlist.get(i).getTitle().length();
					System.out.println(playlist.get(i).getTitle().length());
					
					if(playlist.get(i).getTitle().length()>big)
						{
							big = playlist.get(i).getTitle().length();
						}
					
				}
			for(int i=0; i<playlist.size(); i++)
				{
					if (big==playlist.get(i).getTitle().length())
						{
							playlist.remove(i);
							
						}
				}
		}
	}
