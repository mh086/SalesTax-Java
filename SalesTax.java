
package assignement1_1;

/**  Mahadi Hasan
 *   Assignment 1_1
 *   Date: Sep 9, 2021
*/  

/**  this class houses methods and attributes to carry 
 * out operations related to calculating total item cost 
*/  

class SalesTax {
    //instance variables
    private double stateTaxRate, countyTaxRate, itemPrice, totalTax, totalCost;
   
    /**  this constructor method receives two sales 
     * taxes and pass the values to instance variables
     */    
    public SalesTax(double state, double county) {
        stateTaxRate = state;
        countyTaxRate = county;
    }
    /**  this method receives item price and passes the value to instance variable
     *   it also computes total tax amount
     */
    public void computeTax(double price) {
        itemPrice = price;
        totalTax = price * (stateTaxRate + countyTaxRate);
    }
    /**  this method computes total item cost
     */    
    public void computeCost() {
        totalCost = itemPrice + totalTax;
    }
    /**  this method returns the value of total tax 
     */    
    public double getSalesTax() {
        return totalTax;
    }
    /**  this method returns the value of total cost 
     */  
    public double getCost() {
        return totalCost;
    }   
}
