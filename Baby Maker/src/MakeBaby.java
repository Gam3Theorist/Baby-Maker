import java.util.ArrayList;

public class MakeBaby
	{
		public static void main(String[] args)
			{
				ArrayList <Baby> nursery = new ArrayList <Baby>();

				nursery.add(new Baby("Muhammad", 6.9));
				nursery.add(new Baby("John", 4.2));
				nursery.add(new Baby ("Caden", 130.4 ));
				nursery.add(new Baby ("JT", 225.1));
				
				nursery.get(0).setWeight(9.3);
				
				for(int i =0; i<nursery.size(); i++)
					{
						
						System.out.println(nursery.get(i).getName());
						System.out.println(nursery.get(i).getWeight());
		
					}
			}
	}

