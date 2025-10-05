package io.github.traininglabz.solid.srp;

import lombok.RequiredArgsConstructor;

class ExampleSolution {

    record Employee(
            String name,
            double salaryAmount,
            double totalHours,
            double hoursOff,
            double hoursWorked) {
    }

    static class PayCalculator {
        public double calculatePay(Employee employee) {
            return employee.salaryAmount * Math.min(1.0, employee.hoursWorked / getRegularHours(employee));
        }

        private double getRegularHours(Employee employee) {
            return employee.totalHours - employee.hoursOff;
        }
    }

    static class HourReported {
        public void reportHours(Employee employee) {
            System.out.printf("Hours Worked / Regular Hours: %.2f / %.2f\n",
                    employee.hoursWorked, getRegularHours(employee));
        }

        private double getRegularHours(Employee employee) {
            return employee.totalHours - employee.hoursOff;
        }
    }

    static class EmployeeRepository {
        public void save(Employee employee) {
            System.out.printf("Saved employee data: %s\n", employee);
        }
    }

    @RequiredArgsConstructor
    static class EmployeeFacade {

        private final PayCalculator payCalculator;
        private final HourReported hourReported;
        private final EmployeeRepository employeeRepository;

        public double calculatePay(Employee employee) {
            return payCalculator.calculatePay(employee);
        }

        public void reportHours(Employee employee) {
            hourReported.reportHours(employee);
        }

        public void save(Employee employee) {
            employeeRepository.save(employee);
        }
    }

    public static void run() {
        Employee employee = new Employee("Arjun", 50_000, 45, 5, 35);

        EmployeeFacade employeeFacade = new EmployeeFacade(
                new PayCalculator(),
                new HourReported(),
                new EmployeeRepository());

        employeeFacade.save(employee);
        employeeFacade.reportHours(employee);
        System.out.printf("Calculated Pay: %.2f\n", employeeFacade.calculatePay(employee));
    }
}
