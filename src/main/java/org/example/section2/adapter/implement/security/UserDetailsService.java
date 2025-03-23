package org.example.section2.adapter.implement.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
