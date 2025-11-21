package com.maven;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Employee emp=new Employee(null, 0, null, null);
       emp.setEmpId(123);
       emp.setEmpNmae("Ravi");
       emp.setDesg("student");
       emp.setMobileNum("623386726");
       System.out.println(emp);
       Object obj = new Object();
       
       Employee e1 = new Employee("amit",678,"manager","6009288292");
       System.out.println(e1);
       
    }
}
