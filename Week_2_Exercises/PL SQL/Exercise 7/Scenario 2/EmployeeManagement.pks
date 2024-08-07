CREATE OR REPLACE PACKAGE EmployeeManagement AS
    -- Procedure to hire a new employee
    PROCEDURE HireNewEmployee (
        p_EmployeeID NUMBER, 
        p_Name VARCHAR2, 
        p_Position VARCHAR2, 
        p_Salary NUMBER, 
        p_Department VARCHAR2, 
        p_HireDate DATE
    );
    
    -- Procedure to update details of an existing employee
    PROCEDURE UpdateEmployeeDetails (
        p_EmployeeID NUMBER, 
        p_Name VARCHAR2, 
        p_Salary NUMBER
    );
    
    -- Function to calculate the annual salary of an employee
    FUNCTION CalculateAnnualSalary (
        p_EmployeeID NUMBER
    ) RETURN NUMBER;
END EmployeeManagement;
/
