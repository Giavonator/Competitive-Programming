import java.util.*;

public class g2
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int tc = 0; tc < n; tc++)
        {
            String tmp = sc.nextLine();

            int i = 1;

            while (i < tmp.length() && tmp.charAt(i) >= tmp.charAt(i-1)) i++;
            while (i < tmp.length() && tmp.charAt(i) <= tmp.charAt(i-1)) i++;

            char c = tmp.charAt(i-1);

            String tr = tmp.substring(i, tmp.length());

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j <= tr.length(); j++)
            {
                sb.append(c);
            }

            String s = tmp.substring(0, i-1) + sb.toString();
            System.out.println(s);
			
        }
		sc.close();
    }
}