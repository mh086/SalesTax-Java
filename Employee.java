
package assignment1_2;

/**  Mahadi Hasan
 *   Assignment 1_2
 *   Date: Sep 9, 2021
*/  

/**  this class houses methods and attributes to carry out
 * operations related to calculating total raised salaries 
*/  

class Employee {
    // instance variable
    private String name;
    private double salary;
    /**  this constructor method receives employee name and salary 
     * and pass the values to instance variables
     */    
    public Employee (String employeeName, double employeeSalary) {
        name = employeeName;
        salary = employeeSalary;
    }
   /**  this method returns the value of name 
     */
    public String getName() {
        return name;
    }
   /**  this method returns the value of salary 
     */ 
    public double getSalary() {
        return salary;
    }
    /**  this method computes total salary with increase amount
     */ 
    public void raiseSalary(double percent) {
        salary = salary * (1+percent);
    }
}
