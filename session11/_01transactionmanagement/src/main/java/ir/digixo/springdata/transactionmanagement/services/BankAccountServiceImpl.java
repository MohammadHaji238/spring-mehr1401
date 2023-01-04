package ir.digixo.springdata.transactionmanagement.services;

import ir.digixo.springdata.transactionmanagement.entities.BankAccount;
import ir.digixo.springdata.transactionmanagement.repos.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;
@Service

public class BankAccountServiceImpl implements BankAccountService{
    @Autowired
    BankAccountRepository repository;
    @Override
    @Transactional
    public void transfer(BankAccount acc1,BankAccount acc2,Double amount) {

      //  final BankAccount acc11 = repository.findById(acc1.getAccno()).get();
      //  final BankAccount acc22 = repository.findById(acc2.getAccno()).get();


       try {
           final double v1 = acc1.getBalance().doubleValue() - amount;
           final double v2 = acc2.getBalance().doubleValue() + amount;
           acc1.setBalance(new BigDecimal(v1));
           acc2.setBalance(new BigDecimal(v2));
           repository.save(acc1);

           if (true)
               throw new RuntimeException("mmm");

           repository.save(acc2);
       }catch (RuntimeException e)
       {
           e.printStackTrace();
       }

      /*  try {
            final BankAccount acc11 = repository.findById(acc1.getAccno()).get();
            final BankAccount acc22 = repository.findById(acc2.getAccno()).get();
            final double v1 = acc11.getBalance().doubleValue() - amount;
            final double v2 = acc22.getBalance().doubleValue() + amount;
            acc11.setBalance(new BigDecimal(v1));
            acc22.setBalance(new BigDecimal(v2));
            repository.save(acc11);

            if (true)
                throw new RuntimeException("mmm");

            repository.save(acc22);
        }catch (RuntimeException e)
        {
            e.printStackTrace();
        }*/


    }
}
