public class Main {
    // не нравиться мне серый цвет он так уныл мне нужен свет... =)
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    private static Employee[] employee = new Employee[10];// поле типа Employee
    public static void main(String[] args) {// все ФИО взяты из рандомайзера ФИО, все совпадения с реальными людьми абсолютно случайны
    employee[0] = new Employee ("Куликов","Платон","Иванович",1,75_435);
    employee[1] = new Employee ("Николаев","Глеб","Александрович",2,63_640);
    employee[2] = new Employee ("Ершов","Георгий","Артёмович",3,57_820);
    employee[3] = new Employee ("Снегирев","Арсений","Романович",4,82_466);
    employee[4] = new Employee ("Акимов","Андрей","Евгеньевич",1,72_216);
    employee[5] = new Employee ("Борисов","Артём","Евгеньевич",5,89_900);
    employee[6] = new Employee ("Белов","Билал","Иванович",3,59_550);
    employee[7] = new Employee ("Широков","Никита","Ярославович",2,61_345);
    employee[8] = new Employee ("Сухарев","Илья","Кириллович",5,96_040);
    employee[9] = new Employee ("Чистяков","Яков","Андреевич",4,84_323);

    print();// обьявили метод вывода всех данных сотрудника
        System.out.println(" ");

       int allSalarys = salarySumm(); // объявили метод суммы ЗП
        System.out.println( ANSI_PURPLE + "Cумма заработной платы "+ ANSI_RESET + allSalarys);

        System.out.println(" ");

        Employee employeeMaxSalary = maxSalaryEmployee() ;// объявили метод поиска сотрудников с максимальной ЗП
        System.out.println( ANSI_PURPLE + "Сотрудник с нибольшей ЗП: " + ANSI_RESET + employeeMaxSalary);

        System.out.println(" ");

        Employee employeeMinSalary = minSalaryEmployee() ;// объявили метод поиска сотрудников с минимальной ЗП
        System.out.println(ANSI_PURPLE + "Сотрудник с наименьшей ЗП: " + ANSI_RESET + employeeMinSalary);

        System.out.println(" ");

        double averageSalary = averageSalary();// объявили метод рассчёта средней ЗП всех сотрудников
        System.out.println(ANSI_PURPLE + "Средняя ЗП сотрудников "+ ANSI_RESET + averageSalary);

        System.out.println(" ");

        printName();// выводим только ФИО
    }
    private static void print() { // метод выводит данные в строку
        for (Employee employee : employee ) {
            if (employee != null){
                System.out.println(employee);
            }
        }
    }


    private static int salarySumm() {// метод считает сумму ЗП
        int summSalary = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                summSalary = summSalary + employee.getSalary();
            }
        }
        return summSalary;
    }
    private static Employee maxSalaryEmployee() {// метод находит максимальную ЗП
        int maxSalary = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for(Employee employee : employee){
            if(employee != null & employee.getSalary() > maxSalary){
                 maxSalary = employee.getSalary();
                 employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary ;
    }

    private static Employee minSalaryEmployee() {// метод находит минимальную ЗП
        int minSalary = Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee employee : employee) {
            if (employee != null & employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static double averageSalary() {
        int employees = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                employees ++;
            }
        }
        if (employees != 0) {
            return (double) salarySumm() / employees;
        }
        return 0;
    }
    private static void printName() { // метод выводит ФИО сотрудника в строку
        for (Employee employee : employee ) {
            if (employee != null){
                System.out.println(ANSI_YELLOW + "Фамилия " + ANSI_BLUE + employee.getSurname()
                        + ANSI_YELLOW + " Имя " + ANSI_BLUE + employee.getName()+ ANSI_YELLOW +
                        " Отчество "+ ANSI_BLUE + employee.getPatronymic());
            }
        }
    }
}