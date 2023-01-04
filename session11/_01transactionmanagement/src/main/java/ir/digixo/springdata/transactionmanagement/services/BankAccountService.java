package ir.digixo.springdata.transactionmanagement.services;

import ir.digixo.springdata.transactionmanagement.entities.BankAccount;

import java.math.BigDecimal;

public interface BankAccountService {
    void transfer(BankAccount acc1, BankAccount acc2, Double amount);
}
