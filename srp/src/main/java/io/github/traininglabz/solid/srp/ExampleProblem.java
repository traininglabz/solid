package io.github.traininglabz.solid.srp;

import lombok.Data;

class ExampleProblem {

    @Data
    static class Employee {

        private final String name;
        private final double salaryAmount;
        private final double totalHours;
        private final double hoursOff;
        private final double hoursWorked;

        public double calculatePay() {
            return salaryAmount * Math.min(1.0, hoursWorked / getRegularHours());
        }

        public void reportHours() {
            System.out.printf("Hours Worked / Regular Hours: %.2f / %.2f\n", hoursWorked, getRegularHours());
        }

        public void save() {
            System.out.printf("Saved employee data: %s\n", this);
        }

        private double getRegularHours() {
            return totalHours - hoursOff;
        }

    }

    public static void run() {
        Employee employee = new Employee("Arjun", 50_000, 45, 5, 35);

        employee.save();
        employee.reportHours();
        System.out.printf("Calculated Pay: %.2f\n", employee.calculatePay());
    }
}
