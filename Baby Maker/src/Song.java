
public class Song
	{
private String Title;
private String Artist;
private int LengthInSeconds;

		public Song (String t, String a, int l)
		{
			Title=t;
			Artist=a;
			LengthInSeconds=l;
		}

		public String getTitle()
			{
				return Title;
			}

		public void setTitle(String title)
			{
				Title = title;
			}

		public String getArtist()
			{
				return Artist;
			}

		public void setArtist(String artist)
			{
				Artist = artist;
			}

		public int getLengthInSeconds()
			{
				return LengthInSeconds;
			}

		public void setLengthInSeconds(int length)
			{
				LengthInSeconds = length;
			}
		
	}
