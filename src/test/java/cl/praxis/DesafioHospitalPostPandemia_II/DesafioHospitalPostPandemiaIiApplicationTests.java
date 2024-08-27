package cl.praxis.DesafioHospitalPostPandemia_II;

import cl.praxis.DesafioHospitalPostPandemia_II.model.dto.Patients;
import cl.praxis.DesafioHospitalPostPandemia_II.model.services.ServicePatients;
import cl.praxis.DesafioHospitalPostPandemia_II.model.services.ServicePatientsImpl;
import org.apache.catalina.Service;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DesafioHospitalPostPandemiaIiApplicationTests {

	@Autowired
	ServicePatients service;

	@Test
	void contextLoads() {
	}


	@Test
	void mostrarTodoTest(){
		List<Patients> p = service.mostrarTodos();

		assertEquals(true, p.size()>0, "Test de creacion de Lista");
		assertTrue(p.size()>0,"Test de Creacion de lista ");

	}
}
