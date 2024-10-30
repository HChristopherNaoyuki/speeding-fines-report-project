package Solution;

public class SpeedingFinesReport
{
    // Main method: Entry point of the program
    public static void main(String[] args)
    {
        // Declaration and population of a 2D array with speeding fines (in km) for four cities
        int[][] speedingFines = {
            {128, 135, 139},  // Johannesburg (JHB)
            {155, 129, 175},  // Durban (DBN)
            {129, 130, 185},  // Cape Town (CTN)
            {195, 155, 221}   // Port Elizabeth (PE)
        };
        
        // Display the speeding fines for each city
        System.out.println("******************************");
        System.out.println("SPEDDING FINES REPORT");
        System.out.println("******************************");
        System.out.println(" \tJAN\tFEB\tMAR");

        // Loop through the cities (rows) and print the speeding fines for each month (columns)
        for (int i = 0; i < speedingFines.length; i++)
        {
            // Determine the city name based on the current row index
            switch (i)
            {
                case 0 -> System.out.print("JHB\t");
                case 1 -> System.out.print("DBN\t");
                case 2 -> System.out.print("CTN\t");
                case 3 -> System.out.print("PE\t");
            }

            // Loop through each month's fine and print it
            for (int j = 0; j < speedingFines[i].length; j++)
            {
                System.out.print(speedingFines[i][j] + "km\t");
            }
            System.out.println();
        }

        // Determine and display the highest and lowest speeding fines
        int highestFine = findHighestFine(speedingFines);
        int lowestFine = findLowestFine(speedingFines);
        
        System.out.println("******************************");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("******************************");
        System.out.println("Maximum Speed Captured: " + highestFine + "km");
        System.out.println("Minimum Speed Captured: " + lowestFine + "km");
        System.out.println("******************************");
    }

    // Method to find the highest speeding fine in the 2D array
    public static int findHighestFine(int[][] fines)
    {
        int maxFine = fines[0][0]; // Initialize with the first element in the array
        for (int[] row : fines)
        {
            for (int fine : row)
            {
                if (fine > maxFine)
                {
                    maxFine = fine;
                }
            }
        }
        return maxFine;
    }

    // Method to find the lowest speeding fine in the 2D array
    public static int findLowestFine(int[][] fines)
    {
        int minFine = fines[0][0]; // Initialize with the first element in the array
        for (int[] row : fines)
        {
            for (int fine : row)
            {
                if (fine < minFine)
                {
                    minFine = fine;
                }
            }
        }
        return minFine;
    }
}
