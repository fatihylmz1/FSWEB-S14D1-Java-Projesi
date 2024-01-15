public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("Mid Developer " + getName() + " starts developing.");
        setSalary(getSalary() + 1000);
    }
}
