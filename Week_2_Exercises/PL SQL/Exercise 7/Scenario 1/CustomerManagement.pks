CREATE OR REPLACE PACKAGE CustomerManagement AS
    -- Procedure to add a new customer
    PROCEDURE AddNewCustomer (
        p_CustomerID NUMBER, 
        p_Name VARCHAR2, 
        p_DOB DATE, 
        p_Balance NUMBER
    );
    
    -- Procedure to update details of an existing customer
    PROCEDURE UpdateCustomerDetails (
        p_CustomerID NUMBER, 
        p_Name VARCHAR2, 
        p_Balance NUMBER
    );
    
    -- Function to get the balance of a customer
    FUNCTION GetCustomerBalance (
        p_CustomerID NUMBER
    ) RETURN NUMBER;
END CustomerManagement;
/
