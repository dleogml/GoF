package org.example.section2.adapter;

import org.example.section2.adapter.createclass.AccountService;
import org.example.section2.adapter.createclass.AccountUserDetailsService;
import org.example.section2.adapter.createclass.security.LoginHandler;
import org.example.section2.adapter.createclass.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("daehee", "daehee");
        System.out.println(login);
    }
}
