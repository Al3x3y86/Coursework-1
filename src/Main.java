public class Main {
    public static void main(String[] args) {
       Employee[] arr = new Employee[10];
       arr[0] = new Employee("Иван", " Иванович", " Иванов", 110_000, 1);
       arr[1] = new Employee("Александр", " Александрович", " Иванов", 120_000, 2);
       arr[2] = new Employee("Сергей", " Сергеевич", " Иванов", 130_000, 3);
       arr[3] = new Employee("Алексей", " Алексеевич", " Иванов", 140_000, 4);
       arr[4] = new Employee("Петр", " Петрович", " Иванов", 150_000, 5);
       arr[5] = new Employee("Максим", " Максимович", " Иванов", 160_000, 1);
       arr[6] = new Employee("Артур", " Артурович", " Иванов", 170_000, 2);
       arr[7] = new Employee("Дмитрий", " Дмитриевич", " Иванов", 180_000, 3);
       arr[8] = new Employee("Степан", " Степанович ", " Иванов", 190_000, 4);
       arr[9] = new Employee("Артем", " Артемович", " Иванов", 200_000, 5);

       EmployeeBook.leadOutListEmployees(arr);
       EmployeeBook.averageSalary(arr);
       EmployeeBook.minSalary(arr);
       EmployeeBook.maxSalary(arr);
       EmployeeBook.leadOutNamesEmployees(arr);

    }
}

