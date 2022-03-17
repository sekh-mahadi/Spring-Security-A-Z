INSERT INTO customer(name, email, mobile_number, pwd, role, create_dt) VALUES ('Sekh','sekh@example.com','01923012012', '$2a$12$9GrvmyDLPJKzsWM7c.lL4.4mMElXGE6kKdCqeA2dxFFppxB1.fD9S', 'admin',CURDATE());

INSERT INTO `customer` VALUES ('Mahadi','mahadi@example.com','01923012012', '$2a$12$2U4FGlLSoWuiFYYGPXXi3O1L6q2U2e2ZPBlnaqYnU//TfIlj0R3CW', 'admin',CURDATE());
 
INSERT INTO `accounts`  VALUES (1, 186576453434, 'Savings', '123 Main Street, New York', CURDATE());
 
INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-7, 'Coffee Shop', 'Withdrawal', 30,34500,CURDATE()-7);

INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-6, 'Uber', 'Withdrawal', 100,34400,CURDATE()-6);

INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-5, 'Self Deposit', 'Deposit', 500,34900,CURDATE()-5);

INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-4, 'Ebay', 'Withdrawal', 600,34300,CURDATE()-4);

INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-2, 'OnlineTransfer', 'Deposit', 700,35000,CURDATE()-2);

INSERT INTO `account_transactions` VALUES (UUID(), 186576453434, 1, CURDATE()-1, 'Amazon.com', 'Withdrawal', 100,34900,CURDATE()-1);
