package org.example.section2.adapter.createclass.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
