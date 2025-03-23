package org.example.section2.adapter.implement;

import org.example.section2.adapter.implement.security.UserDetails;
import org.example.section2.adapter.implement.security.UserDetailsService;

public class AccountService implements UserDetailsService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
