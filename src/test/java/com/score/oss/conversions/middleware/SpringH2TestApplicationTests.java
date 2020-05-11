package com.score.oss.conversions.middleware;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.score.oss.conversions.middleware.repository.UserRepository;

@SpringBootTest
class SpringH2TestApplicationTests {
    @Autowired
    UserRepository userRepo;
    

	@Test
	void findAllTest() {
	    Object ret = userRepo.findAll();
	    assertNotNull(ret);
	}


    @Test
    void findAdminTest() {
        Object ret = userRepo.findAdmin();
        assertNotNull(ret);
    }
}
