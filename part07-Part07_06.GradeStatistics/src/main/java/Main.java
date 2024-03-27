
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        double average = 0.0;
        double passingAverage = 0.0;
        int sum = 0;
        int passingSum = 0;
        int count = 0;
        int countPassing = 0;
        double passPercentage = 0.0;
        // HashMap<Integer, Integer> gradeMap = new HashMap<>();
        // gradeMap.put(5, 0);
        // gradeMap.put(4, 0);
        // gradeMap.put(3, 0);
        // gradeMap.put(2, 0);
        // gradeMap.put(1, 0);
        // gradeMap.put(0, 0);
        int[] gradeCount = new int[6];
        while (true) {
            String numberAsString = scanner.nextLine();
            int number = Integer.valueOf(numberAsString);
            if(number == -1) {
                break;
            }
            if(number<0 || number>100) {
                continue;
            }
            count++;
            sum += number;
            if(number >= 50) {
                countPassing++;
                passingSum += number;
            }

            if(number < 50) {
                gradeCount[5] = gradeCount[5] + 1;
            }else if(number < 60) {
                gradeCount[4] = gradeCount[4] + 1;
            }else if(number < 70) {
                gradeCount[3] = gradeCount[3] + 1;
            }else if(number < 80) {
                gradeCount[2] = gradeCount[2] + 1;
            }else if(number < 90) {
                gradeCount[1] = gradeCount[1] + 1;
            }else {
                gradeCount[0] = gradeCount[0] + 1;
            }

        }
        average = 1.0 * sum / count;
        if(countPassing > 0) {
            passingAverage = 1.0 * passingSum / countPassing;
        }

        passPercentage = (100 * 1.0 * countPassing)/count;

        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + (passingAverage > 0.0 ? passingAverage : "-"));
        System.out.println("Pass percentage: " + passPercentage);
        System.out.println("Grade distribution:");
        for(int i=0;i<6;i++) {
            System.out.println(5-i + ": "+convertToStar(gradeCount[i]));
        }
    }

    private static String convertToStar(int number) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<number;i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
