public class Member {
    private String name;
    private int age;
    private int salary;
    private int memberId;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", memberId=" + memberId +
                '}';
    }

    public int getMemberId() {
        return memberId;
    }

    public Member(String name, int age, int salary, int memberId) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.memberId = memberId;
    }
    public Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
