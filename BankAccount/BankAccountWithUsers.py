
class BankAccount:
    # don't forget to add some default values for these parameters!
    

    def __init__(self, int_rate, balance): 
        self.int_rate = int_rate
        self.balance = balance
    def deposit(self, amount):
        self.balance= self.balance+amount
    def withdraw(self, amount):
        self.balance = self.balance-amount
    def display_account_info(self):
        balance = self.balance
        print(balance)
    def yield_interest(self):
        if self.balance>0:
            x= self.balance * self.int_rate
            self.balance = self.balance + x
    
class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account1 = BankAccount(int_rate=0.02, balance=0)
        self.account2 = BankAccount(int_rate=0.07, balance=1)
    def make_deposit(self, amount,num):
    	if num==1:
            self.account1.deposit(amount)
        else:
            self.account2.deposit(amount)

    def make_withdrawal(self, amount,num):
    	if num==1:
            self.account1.withdraw(amount)
        else:
            self.account2.withdraw(amount)
    def display_user_balance(self,num):
    	if num==1:
            print(self.account1.yield_interest())
        else:
            print(self.account2.yield_interest())
    def transfer_money(self,amount,num):
    	if num==1:
            self.account1.deposit(amount)
            self.account2.withdraw(amount)

        else:
            self.account2.deposit(amount)
            self.account1.withdraw(amount)