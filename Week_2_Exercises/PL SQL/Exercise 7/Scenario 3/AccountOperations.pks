CREATE OR REPLACE PACKAGE AccountOperations AS
    -- Procedure to open a new account
    PROCEDURE OpenNewAccount (
        p_AccountID NUMBER, 
        p_CustomerID NUMBER, 
        p_AccountType VARCHAR2, 
        p_Balance NUMBER
    );
    
    -- Procedure to close an existing account
    PROCEDURE CloseAccount (
        p_AccountID NUMBER
    );
    
    -- Function to get the total balance for a customer
    FUNCTION GetTotalBalance (
        p_CustomerID NUMBER
    ) RETURN NUMBER;
END AccountOperations;
/
