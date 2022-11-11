
package assignment1_2;

/**  Mahadi Hasan
 *   Assignment 1_2
 *   Date: Sep 9, 2021
*/  

/**  this tester class carries out operations using the Employee class 
*/ 
public class EmployeeTester {
    public static void main(String args[]) {
        // Create a Employee object, give name and salary
        Employee emp1 = new Employee("Jake", 55000); 
        System.out.println("Employee name: " + emp1.getName()); // Print Employee Name
        System.out.printf("Employee Salary: %.2f\n", emp1.getSalary()); // Print Employee Salary
        emp1.raiseSalary(0.1); // call raiseSalary method and and give 10 percent increment
        System.out.printf("Employee Salary: %.2f", emp1.getSalary()); // Print Employee Increased Salary
    }
}

