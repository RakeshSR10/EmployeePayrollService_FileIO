package com.bridgeLabz;

public class EmployeePayrollData {
    public Integer id;
    public String name;
    public double salary;

    public EmployeePayrollData(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Emp ID:"+id+", Emp name:"+name+", Salary:"+salary;
    }
}
