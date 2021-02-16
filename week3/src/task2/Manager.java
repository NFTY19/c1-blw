package task2;

public class Manager {
    int Id;
    String Name;
    double Salary;
    int ManagerId;

    public Manager(int id, String name, double salary, int managerId) {
        Id = id;
        Name = name;
        Salary = salary;
        ManagerId = managerId;
    }

    public Manager(int id, String name, double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", ManagerId=" + ManagerId +
                '}';
    }
}
