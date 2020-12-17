package pe.edu.upeu.exa3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.upeu.exa3.dao.RolDao;

@SpringBootTest
class Exa3BackendDanielRojasApplicationTests {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	RolDao rolDao;
	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("992304718"));
		System.out.println(rolDao.buscarRolUser(4));
	}
}