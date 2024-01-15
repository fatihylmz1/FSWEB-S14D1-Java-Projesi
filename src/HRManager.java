public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }
    public void addEmployee(JuniorDeveloper juniorDeveloper){
        addToDevelopers(juniorDeveloper,juniorDevelopers);
    }
    public void addEmployee(MidDeveloper midDeveloper) {
        addToDevelopers(midDeveloper, midDevelopers);
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addToDevelopers(seniorDeveloper, seniorDevelopers);
    }
    private void addToDevelopers(Employee employee, Employee[] developers) {
        int index = findEmptyIndex(developers);
        if (index != -1) {
            developers[index] = employee;
            System.out.println(employee.getName() + " added to developers.");
        } else {
            System.out.println("No available index for " + employee.getName());
        }
    }

    private int findEmptyIndex(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1; // No available index
    }
}
