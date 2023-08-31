import java.util.*;

public class Randomizer {

    public static void main(String[] args) {
        System.out.println("Groups for today!");
        String[] A_roster = {"Alexa", "John", "Jennifer", "Luke", "Nikhil", "Katherine",
        "Alex", "Mac", "Sarah", "Nico", "Thomas", "Ryan", "Susan",
        "Winston", "Aditya"};
        String[] B_roster = {"Sofia", "Brielle", "Oliver", "Daniel", "Henry M", "Henry C", "Claire",
         "Joseph", "Luke", "Carter", "Connor", "Lillian", "Kiran", "Alice", "Sarah"};
        // makeGroups(A_roster, 4);
        makeGroups(B_roster, 4);
    }

    public static String[] shuffleArray(String[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--)
            {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
            }
        return array;
    }

    public static void makeGroups(String[] array, int num) {
        array = shuffleArray(array);         

        int total = array.length;
        int size = total / num;
        
        if (total % num != 0) {
            size++;
        }

        String[][] groups = new String[num][size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < num; j++) {
                if (index < total) {
                    groups[j][i] = array[index];
                    index++;
                }
            }
        }
        printGroups(groups);
    }

    public static void printGroups(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Group " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    System.out.print(array[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }
}
