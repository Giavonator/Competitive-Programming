import java.util.Scanner;
    class Problem12REAL {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
			String endPrint = "";
            for(int testcase = 0; testcase < testCases; testcase++) {
                String[] lines = input.nextLine().split(" ");
                int dataLength = Integer.parseInt(lines[0]);
                int templateLength = Integer.parseInt(lines[1]);
                String[] dataType = new String[dataLength];
                String[] dataValue = new String[templateLength];
                for(int i = 0; i < dataLength; i++)
                {
                    String dataLine = input.nextLine();
                    String[] dataSplit = dataLine.split("\\:");
                    dataType[i] = dataSplit[0];
                    dataValue[i] = dataSplit[1].substring(1);
                }
                for (int j = 0; j < templateLength; j++)
                {
                    int x = 0;
                    String templateLine = input.nextLine();
                    if((templateLine.indexOf("[", x) < 0) && (templateLine.indexOf("]", x) < 0))
                    {
                        endPrint += templateLine + "\n";
                    }
                    else
                    {
                        while(true)
                        {
                            int fbIndex = templateLine.indexOf("[", x);
                            int sbIndex = templateLine.indexOf("]", x);
                                String foundType = templateLine.substring(fbIndex + 1, sbIndex);
                                int typeIndex = 0;
                                for (int index = 0; index < dataLength; index++)
                                {
                                    if (foundType.equals(dataType[index]))
                                    {
                                        typeIndex = index;
                                    }
                                }
                            String before = templateLine.substring(x, fbIndex);
                            endPrint += before + dataValue[typeIndex];
                            x = sbIndex +1;
                            if (templateLine.indexOf("[", x) < 0)
                            {
                                endPrint += templateLine.substring(x) + "\n";
                                break;
                            }
                        }
                    }
                }

            }
			System.out.print(endPrint);
        }
    }
    }