import java.util.Arrays;
import java.util.Scanner;

public class psbb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of families
        System.out.print("Input the number of families : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Input the number of members in each family
        System.out.print("Input the number of members in the family (separated by a space) : ");
        String[] membersString = scanner.nextLine().split(" ");

        if (membersString.length != n) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        // Convert input string to integer list
        int[] familyMembers = new int[n];
        for (int i = 0; i < n; i++) {
            familyMembers[i] = Integer.parseInt(membersString[i]);
        }

        // Sort the family member array
        Arrays.sort(familyMembers);

        // Use a two-pointer approach to pair families
        int i = 0, j = n - 1;
        int bis = 0;

        while (i <= j) {
            if (familyMembers[i] + familyMembers[j] <= 4) {
                i++;
                j--;
            } else {
                j--;
            }
            bis++;
        }

        System.out.println("Minimum bus required is : " + bis);
    }
}
