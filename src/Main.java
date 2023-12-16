import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите зарплату первого сотрудника: ");
        int firstSalary = scanner.nextInt();

        System.out.print("Введите зарплату второго сотрудника: ");
        int secondSalary = scanner.nextInt();

        System.out.print("Введите зарплату третьего сотрудника: ");
        int thirdSalary = scanner.nextInt();

        int maxSalary = 0;
        int minSalary = 0;

        if (thirdSalary > secondSalary && secondSalary < firstSalary) {
            maxSalary = thirdSalary;
            minSalary = secondSalary;
        }
        else if (firstSalary < secondSalary && firstSalary < thirdSalary) {
            maxSalary = thirdSalary;
            minSalary = firstSalary;
        }
        else if (secondSalary > firstSalary && secondSalary > thirdSalary) {
            maxSalary = secondSalary;
            minSalary = thirdSalary;
        }
        else if (firstSalary < thirdSalary && firstSalary < secondSalary) {
                maxSalary = secondSalary;
                minSalary = firstSalary;
        }
        else if (firstSalary>secondSalary && firstSalary>thirdSalary) {
            maxSalary = firstSalary;
            minSalary = thirdSalary;
        }
        else if (firstSalary>thirdSalary && firstSalary > secondSalary){
            maxSalary = firstSalary;
            minSalary = secondSalary;
        }
        int difference;
        difference = maxSalary - minSalary;
        System.out.println(difference);
    }
}