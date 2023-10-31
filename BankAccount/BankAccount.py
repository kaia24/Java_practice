
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
    
bank1 = BankAccount(0.05,100)
bank2 = BankAccount(0.05,200)
bank1.deposit(300)
bank1.deposit(200)
bank1.deposit(600)
bank1.withdraw(100)
bank1.yield_interest()
bank1.display_account_info()

bank2.deposit(600)
bank2.deposit(500)
bank2.withdraw(100)
bank2.withdraw(400)
bank2.withdraw(10)
bank2.withdraw(1)
bank2.yield_interest()
bank2.display_account_info()