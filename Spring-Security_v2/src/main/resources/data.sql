/*insert data into Customer*/
insert into `customer` (name,email,mobile_number, pwd, role,create_dt) values ('Sekh','sekh@example.com','01923012012', '$2a$12$9GrvmyDLPJKzsWM7c.lL4.4mMElXGE6kKdCqeA2dxFFppxB1.fD9S', 'admin',CURDATE());

insert into `customer` (name,email,mobile_number, pwd, role,create_dt) values ('Mahadi','Mahadi@example.com','01312311002', '$2a$12$9GrvmyDLPJKzsWM7c.lL4.4mMElXGE6kKdCqeA2dxFFppxB1.fD9S', 'user',CURDATE());

/*insert data into accounts*/
insert into `accounts` (customer_id, account_number, account_type, branch_address, create_dt) values (1, 186576453434, 'Savings', 'Moghbazar Dhaka', CURDATE());


/*insert Data into account_transactions*/
INSERT INTO `account_transactions` (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt) VALUES (UUID(), 186576453434, 1, CURDATE()-7, 'Coffee Shop', 'Withdrawal', 30,34500,CURDATE()-7);

INSERT INTO `account_transactions` (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt) VALUES (UUID(), 186576453434, 1, CURDATE()-6, 'Uber', 'Withdrawal', 100,34400,CURDATE()-6);

INSERT INTO `account_transactions` (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt) VALUES (UUID(), 186576453434, 1, CURDATE()-5, 'Self Deposit', 'Deposit', 500,34900,CURDATE()-5);

INSERT INTO `account_transactions`  (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt)VALUES (UUID(), 186576453434, 1, CURDATE()-4, 'Ebay', 'Withdrawal', 600,34300,CURDATE()-4);

INSERT INTO `account_transactions` (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt) VALUES (UUID(), 186576453434, 1, CURDATE()-2, 'OnlineTransfer', 'Deposit', 700,35000,CURDATE()-2);

INSERT INTO `account_transactions` (transaction_id, account_number, customer_id, transaction_dt, transaction_summary, transaction_type,transaction_amt, 
closing_balance, create_dt) VALUES (UUID(), 186576453434, 1, CURDATE()-1, 'Amazon.com', 'Withdrawal', 100,34900,CURDATE()-1);

/*insert into Loans*/

INSERT INTO `loans` (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt) VALUES ( 1, '2020-10-13', 'Home', 200000, 50000, 150000, '2020-10-13');

INSERT INTO `loans` (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt) VALUES ( 1, '2020-06-06', 'Vehicle', 40000, 10000, 30000, '2020-06-06');
 
INSERT INTO `loans` (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt) VALUES ( 1, '2018-02-14', 'Home', 50000, 10000, 40000, '2018-02-14');

INSERT INTO `loans` (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt) VALUES ( 1, '2018-02-14', 'Personal', 10000, 3500, 6500, '2018-02-14');

/*Insert data into Cards*/

INSERT INTO `cards` (card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt) VALUES ('4565XXXX4656', 1, 'Credit', 10000, 500, 9500, CURDATE());

INSERT INTO `cards` (card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt) VALUES ('3455XXXX8673', 1, 'Credit', 7500, 600, 6900, CURDATE());
 
INSERT INTO `cards` (card_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt) VALUES ('2359XXXX9346', 1, 'Credit', 20000, 4000, 16000, CURDATE());

/*Insert data Notices*/
INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('Home Loan Interest rates reduced', 'Home loan interest rates are reduced as per the goverment guidelines. The updated rates will be effective immediately', '2020-10-14', '2020-11-30', CURDATE(), null);

INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('Net Banking Offers', 'Customers who will opt for Internet banking while opening a saving account will get a $50 amazon voucher', '2020-10-14', '2020-12-05', CURDATE(), null);

INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('Mobile App Downtime', 'The mobile application of the Mtech Bank will be down from 2AM-5AM on 12/05/2020 due to maintenance activities', '2020-10-14', '2020-12-01', CURDATE(), null);

INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('E Auction notice', 'There will be a e-auction on 12/08/2020 on the Bank website for all the stubborn arrears.Interested parties can participate in the e-auction', '2020-10-14', '2020-12-08', CURDATE(), null);
   
INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('Launch of Millennia Cards', 'Millennia Credit Cards are launched for the premium customers of EazyBank. With these cards, you will get 5% cashback for each purchase', '2020-10-14', '2020-11-28', CURDATE(), null);

INSERT INTO `notice_details` (notice_summary, notice_details, notice_beg_dt, notice_end_dt, create_dt, update_dt) VALUES ('COVID-19 Insurance', 'Mtech Bank launched an insurance policy which will cover COVID-19 expenses. Please reach out to the branch for more details', '2020-10-14', '2020-12-31', CURDATE(), null);


/*Authorites*/

INSERT INTO `authorities` (`customer_id`, `name`)
 VALUES (1, 'READ');
 
INSERT INTO `authorities` (`customer_id`, `name`)
 VALUES (1, 'WRITE');
 
 UPDATE authorities SET name="ROLE_USER" WHERE id=1;
UPDATE authorities SET name="ROLE_ADMIN" WHERE id=2;
 
