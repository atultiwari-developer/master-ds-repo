package interview;

import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>((emp1, emp2)->(emp1.getAge()> emp2.getAge()?-1:(emp1.getAge()< emp2.getAge())?1:0));
        ts.add(new Employee("atul",20));
        ts.add(new Employee("vikash",30));
        ts.add(new Employee("inter",10));
        System.out.println(ts);
    }
}
