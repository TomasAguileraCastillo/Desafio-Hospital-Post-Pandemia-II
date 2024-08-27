package cl.praxis.DesafioHospitalPostPandemia_II.model.services;


import cl.praxis.DesafioHospitalPostPandemia_II.model.dto.Patients;

import java.util.List;

public interface ServicePatients {

        
        List<Patients> mostrarTodos(); // Listado de todos los pacientes
        boolean crearPaciente (Patients paciente); // Crea un paciente
        boolean actualizarPaciente(Patients paciente); //actualiza un Paciente
        boolean borrarPaciente(int id); // eliminacion de registro
        Patients encuentraUno(int id); // busca un paciente





    


}
