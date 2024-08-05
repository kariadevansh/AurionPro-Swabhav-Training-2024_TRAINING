package com.apro.behavioural.observer.model;

public class EmailNotifier implements INotifiers{

	@Override
	public void notify(Account account, String type, double amount) {
		if(type.equals("credit")) {
			System.out.println("\n******Email********\n");
			System.out.println("Their has been A credit operation for your bank account : "+account.getAccountNo());
			System.out.println("The amount  $"+amount+" is credited to your account");
			System.out.println("\nPrevious balance :"+(account.getBalance()-amount));
			System.out.println("updated balance :"+account.getBalance());
			return;
		}
		if(type.equals("debit")) {
			System.out.println("\n******Email********\n");
			System.out.println("Their has been A credit operation for your bank account : "+account.getAccountNo());
			System.out.println("The amount  $"+amount+" is debited from your account");
			System.out.println("\nPrevious balance :"+(account.getBalance()+amount));
			System.out.println("updated balance :"+account.getBalance());
			return;
		}
		
	}
	
}