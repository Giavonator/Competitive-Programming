import java.util.*;

public class calc2
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int tc = 0; tc < n; tc++)
        {
            HashSet<Integer> set = new HashSet<Integer>();
            HashSet<Integer> overSet = new HashSet<Integer>();

            int numIterations = 0;
            int k = sc.nextInt();
            set.add(k);

            while (set.size() != 99)
            {
                numIterations++;

                HashSet<Integer> tempSet = new HashSet<Integer>();

                for (int element : set)
                {
                    tempSet.add(element + 1);
                    tempSet.add(element * 3);
                    tempSet.add(element/2);
                }

                for (int element : overSet)
                {
                    tempSet.add(element + 1);
                    tempSet.add(element*3);
                    tempSet.add(element/2);
                }

                for (int element : tempSet)
                {
                    if (0 < element && element < 100) set.add(element);
                    else overSet.add(element);
                }
            }

            System.out.println(numIterations);
        }
		sc.close();
    }
}