package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;

    public AccountController() {
        this.accountService = accountService;
    }

    public String createAccount(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        return null;
    }

    public String withdraw(Scanner sc) {
        return null;
    }

    public String getBalance(Scanner sc) {
        return null;
    }

    public String cancelAccount(Scanner sc) {
        return null;
    }

    public List<AccountDto> getAccounts(Scanner sc) {
        return null;
    }
}
