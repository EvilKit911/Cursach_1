public class Employee {
    // ФИО сотрудников
    private final String name ;
    private final String surname ;
    private final String patronymic ;
    // Отдел и ЗП
    private int department ;
    private int salary ;
    // Начальный номер ID
    private static int idGen = 1;// id гениратаров возврашаемое значение
    private int id ;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        //ФИО
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        // Отдел, ЗП, ID
        this.department = department;
        this.salary = salary;
        this.id = idGen ++; // увеличиваем каждый номер на 1
    }
    // Гетеры для ФИО
    public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public String getPatronymic(){return this.patronymic;}
    // Гетеры для Отдела, ЗП, ID
    public int getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public int getId(){return this.id;}
    // Сетеры ЗП, Отдел
    public int setSalary(){return this.salary = salary;}
    public int setDepartment(){return this.department = department;}
    // Добавим красок в унылую строку =)
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    // метод toString
    @Override
    public String toString() {
        return ANSI_YELLOW + "Личный номер "+ ANSI_BLUE + id + ANSI_YELLOW + " ФИО " +
                ANSI_BLUE + surname + " " + name + " " + patronymic +
                ANSI_YELLOW + " Отдел " + ANSI_PURPLE + department + ANSI_YELLOW +" Зарплата - " + ANSI_RESET + salary ;
    }
}
