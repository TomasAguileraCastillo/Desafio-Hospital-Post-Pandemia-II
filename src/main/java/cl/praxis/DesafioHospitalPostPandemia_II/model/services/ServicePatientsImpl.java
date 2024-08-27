package cl.praxis.DesafioHospitalPostPandemia_II.model.services;

import cl.praxis.DesafioHospitalPostPandemia_II.DesafioHospitalPostPandemiaIiApplication;
import cl.praxis.DesafioHospitalPostPandemia_II.model.dto.Patients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePatientsImpl implements ServicePatients {
    private static final Logger log = LoggerFactory.getLogger(DesafioHospitalPostPandemiaIiApplication.class);
    private List<Patients> p ;
    public ServicePatientsImpl(){
        log.warn("inicio metodo creacion de listado");
        p = new ArrayList<>();
        p.add(new Patients(1,"14093470-4","Cecilio","Stuart","Av siempre viva 742","654987321","CecilioLove@freake.com","Federico Stuart",998526311,"Taquicardia Severa"));
        p.add(new Patients(2,"15852963-4","Colombo","Jimenez","las delicias 456","321654987","MagnaJimenez@hotmail.com","Colombino II Jimenez",454512693, "Problema Respiratorio"));
        p.add(new Patients(3,"4562123-8","Sofio","Mayo","Conquistadores 654","45678913","DMayo@hotmail.com", "Jean Mayo",588596456,"Reservado N/D"));
        p.add(new Patients(4,"17456789-2","Cristiana","Dominguez","Antumala 5","258741936","CDominguez@ciniao.com","Albertina Dominguez",321654987,"Preparacion Alta"));
    }

    //////////////////////////////////////////////////////////////////
    //Listar Todos los pacientes
    @Override
    public List<Patients> mostrarTodos() {
        log.warn("inicio metodo mostrar Listado mostrarTodos()");
        return p ;
    }

    /////////////////////////////////////////////////////////////////
    //Crear un Nuevo Paciente
    @Override
    public boolean crearPaciente(Patients pacientes) {
        log.warn("inicio metodo crear Pacientes crearPaciente()");
        p.add(pacientes);
        return false;
    }

    /////////////////////////////////////////////////////////////////
    //Actualizar Paciente
    @Override
    public boolean actualizarPaciente(Patients p) {
        log.warn("inicio metodo actualizar Paciente actualizarPaciente()");

        Patients pActualizar = encuentraUno(p.getId());
        pActualizar.setRut(p.getRut());
        pActualizar.setNombre(p.getNombre());
        pActualizar.setApellido(p.getApellido());
        pActualizar.setDireccion(p.getDireccion());
        pActualizar.setTelefono(p.getTelefono());
        pActualizar.setCorreo(p.getCorreo());
        pActualizar.setNombreContacto(p.getNombreContacto());
        pActualizar.setTelefonoContacto(p.getTelefonoContacto());
        pActualizar.setDiagnostico(p.getDiagnostico());
        return true;
    }

    /////////////////////////////////////////////////////////////////
    ///Borrar Paciente
    @Override
    public boolean borrarPaciente(int id) {
        log.warn("inicio metodo Borrar Pacientes borrarPaciente()");
        return p.removeIf(patients -> patients.getId() == id);
    }


    /////////////////////////////////////////////////////////////////
    //Buscar solo un paciente
    public Patients encuentraUno(int id) {
        log.warn("inicio metodo buscar un registro encuentraUno()");
        return p.stream()
                .filter(patients -> patients.getId() == id)
                .findFirst()
                .orElse(null);
    }


}
