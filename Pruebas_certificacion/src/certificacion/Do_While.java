package certificacion;

public class Do_While {
	
	public static void main(String[] args) throws Exception{
		   int i = 1, j = 10;
		   do {
		      if (i++ > --j) continue;
		   } while (i < 5);
		   System.out.println("i=" + i + " j=" + j);
		}

}

1		10


i= 2	j=9
i= 3	j=8
i= 4	j=7
i= 5	j=6
