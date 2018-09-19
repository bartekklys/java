package pl.bartekk.solidPrinciples;

import java.util.Date;

/**
 * S - Single Responsibility Principle (known as SRP)
 */
public class SRP {

    /**
     * Example
     * Employee class BREAKS the Single Responsibility Principle
     * <p>
     * - The logic of determining whether the employee is due this year is actually not a
     * responsibility which the employee owns
     * - Similarly, income tax calculation is not a responsibility of the Employee
     * - lastly, Employee class should have the single responsibility of maintaining core
     * attributes of an employee
     */
    public class Employee {
        private String employeeId;
        private String name;
        private String address;
        private Date dateOfJoining;

        public boolean isPromotionDueThisYear() {
            return false;
        }

        public Double calcIncomeTaxForCurrentYear() {
            return null;
        }
    }
}
