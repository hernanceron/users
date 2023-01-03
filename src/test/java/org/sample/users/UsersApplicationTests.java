package org.sample.users;

import org.junit.jupiter.api.Test;
import org.sample.users.controllers.UserController;
import org.sample.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UsersApplicationTests {
	@Autowired
	private UserRepository userRepository;
	@Test
	void contextLoads() {
	}
	@Test
	void findAllUsers() {
		List lstUsers = userRepository.findAllUsers();
		assertThat(lstUsers.size()>0);
	}

}
