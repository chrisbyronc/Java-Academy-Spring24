package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    private String employeeId, name, department;

    private double payRate, hoursWorked, startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    //Regular hours is 40 or less
    public double getRegularHours() {
        if(this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        return (this.hoursWorked > 40) ? this.hoursWorked-40 : 0;
    }

    public double getTotalPay() {
        double regPay = this.payRate * this.getRegularHours();
        double overPay = (this.payRate * 1.5) * this.getOvertimeHours();
        return regPay + overPay;
    }

    public void punchIn() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
        this.startTime = Double.parseDouble(LocalDateTime.now().format(format));
    }

    public void punchIn(double startTime) {
        this.startTime = startTime;
    }

    public void punchOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
        double endTime = Double.parseDouble(LocalDateTime.now().format(format));
        this.hoursWorked += endTime-this.startTime;
    }

    public void punchOut(double endTime) {
        this.hoursWorked += endTime-this.startTime;
        this.startTime = 0;
    }
}
