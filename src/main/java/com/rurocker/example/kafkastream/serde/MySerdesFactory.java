package com.rurocker.example.kafkastream.serde;

public class MySerdesFactory {

    public static DepartmentSerde departmentSerde() {
        return new DepartmentSerde();
    }

    public static EmployeeSerde employeeSerde() {
        return new EmployeeSerde();
    }

    public static EmployeeHistorySerde employeeHistorySerde() {
        return new EmployeeHistorySerde();
    }

    public static EmploymentHistoryAggregationSerde employmentHistoryAggregationSerde() {
        return new EmploymentHistoryAggregationSerde();
    }

    public static EmployeeResultSerde employeeResultSerde() {
        return new EmployeeResultSerde();
    }
}
