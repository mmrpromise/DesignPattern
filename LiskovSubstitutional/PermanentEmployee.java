/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutional;

/**
 *
 * @author promise
 */
public class PermanentEmployee extends Employee {

    public PermanentEmployee(String name, int ID) {
        super(name, ID);
    }
    
    @Override
    public int calculateBonus(int salary) {
        return salary*100;
    }

    @Override
    public int getMinimumSalary() {
        return 1500;
    }
    
}
