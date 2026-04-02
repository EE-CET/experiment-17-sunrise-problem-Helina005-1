
   
      import java.util.Scanner;

public class Sunrise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // The first building always sees the sun
        int count = 1;
        int maxHeight = heights[0];

        // Start from the second building
        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                count++;
                maxHeight = heights[i];
            }
        }

        System.out.println(count);
        sc.close();
    }

}
