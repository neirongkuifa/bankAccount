package com.flexon.bankaccount;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountController {

    private List<Account> accounts = new ArrayList<>();

    @GetMapping(value = "/getAccount")
    public Account getAccountInfo(@RequestParam String id) {
        Account account = null;
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(id)) {
                account = a;
                break;
            }
        }
        return account;
    }

    @PostMapping(value = "/addAccount")
    public String addAccount(@RequestBody Account account) {
        accounts.add(account);
        return "Account added and Account Number is: " + account.getAccountNumber();
    }

    @PostMapping(value = "/deposit")
    public String deposit(@RequestBody BalanceUpdateDTO update) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(update.getId())) {
                a.setBalance(a.getBalance() + update.getAmount());
                return "Current Balance: " + a.getBalance();
            }
        }
        return null;
    }

    @PostMapping(value = "/withdraw")
    public String withdraw(@RequestBody BalanceUpdateDTO update) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(update.getId())) {
                a.setBalance(a.getBalance() - update.getAmount());
                return "Current Balance: " + a.getBalance();
            }
        }
        return null;
    }
}