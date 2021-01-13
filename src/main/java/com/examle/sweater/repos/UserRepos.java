package com.examle.sweater.repos;

import com.examle.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
