
public class LblBreakDemo {

	public static void main(String[] args) {
		int i,j;
		outer:
			for(i=1;i<=5;i++)
			{
				
					for(j=1;j<=6;j++)
					{
						if(i==3)
							break outer;
						System.out.println(i+" "+j);
					}
		System.out.println("----------------");
			}

	}

}
