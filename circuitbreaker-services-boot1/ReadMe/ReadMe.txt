First Run the application BankService
After this Run the application AccountService

Access the following URL in the browser
http://localhost:8070/bankservice/balance

You will get the following information as
Your current balance is Rs 5000/-

To test Circuit Breaker
Stop the application AccountService

Access the following URL in the browser
http://localhost:8070/bankservice/balance

You will get the following information as
Currently Bank is under maintenance, please try after sometime. We deeply regret the inconvenience