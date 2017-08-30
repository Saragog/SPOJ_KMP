import java.util.Scanner;

public class KMP {

	private static Scanner in;
	
	private static void kmpSearch()
	{
		String text, pattern;
		int textLength, patternLength = in.nextInt();
		pattern = in.next();
		text = in.next();
		textLength = text.length();
		
		for (int actualTextPosition = 0; actualTextPosition + patternLength <= textLength; actualTextPosition++)
		{
			for (int actualPatternPosition = 0; actualPatternPosition < patternLength; actualPatternPosition++)
			{
				if (pattern.charAt(actualPatternPosition) != text.charAt(actualPatternPosition + actualTextPosition)) break;
				else if (actualPatternPosition == patternLength - 1)
				{
					System.out.println(actualTextPosition);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		int testNumber;
		testNumber = in.nextInt();
		while (testNumber-- > 0)
		{
			kmpSearch();
		}
		return;
	}

}
