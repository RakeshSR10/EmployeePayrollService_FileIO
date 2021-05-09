package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.bridgeLabz.EmployeePayrollService.IOService.FILE_IO;

public class EmployeePayrollServiceTest {
    //UC4 - Ability to store Employee Payroll into a file
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1,"Jeff Bezos",1000000.0),
                new EmployeePayrollData(2, "Bill Gates",2000000.0),
                new EmployeePayrollData(3,"Mark Zuckerberg",3000000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        employeePayrollService.printData(FILE_IO);
        long entries = employeePayrollService.countEntries(FILE_IO);
        System.out.println("Total number of Entries = "+entries);//UC5 TotalEntries = 3
        Assertions.assertEquals(3, entries);
    }
    //UC6 -Ability to Analysis the EmployeePayroll service
    @Test
    public void givenFileOnReadingFromFileShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        long entries = employeePayrollService.readEmployeePayrollData(FILE_IO);
        Assertions.assertEquals(3,entries);
    }
}
