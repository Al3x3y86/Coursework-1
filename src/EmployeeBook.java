public class EmployeeBook {
    public static void leadOutListEmployees(Employee[] employee) {
        for (byte i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static double calculationTotalSalaries(Employee[] employee) {
        double totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                totalSalary = totalSalary + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: "+totalSalary);
        return totalSalary;
    }

    public static void minSalary(Employee[] employee) {
        double min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (min > employee[i].getSalary()) {
                    min = employee[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата: "+min);
    }

    public static void maxSalary(Employee[] employee) {
        double max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (max < employee[i].getSalary()) {
                    max = employee[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата: "+max);
    }

    public static void averageSalary(Employee[] employee) {
        double mid = calculationTotalSalaries(employee) / employee.length;
        System.out.println("Cреднее значение зарплат: "+ mid);
    }

    public static void leadOutNamesEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName(employee));
            }
        }
    }
}

