package cl.praxis.DesafioHospitalPostPandemia_II.controller;


import cl.praxis.DesafioHospitalPostPandemia_II.DesafioHospitalPostPandemiaIiApplication;
import cl.praxis.DesafioHospitalPostPandemia_II.model.dto.Patients;
import cl.praxis.DesafioHospitalPostPandemia_II.model.services.ServicePatients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PatientsController {

    private static final Logger log = LoggerFactory.getLogger(DesafioHospitalPostPandemiaIiApplication.class);
    private static ServicePatients servicePatients; //correccion de revision

    public PatientsController(ServicePatients servicePatients) {
        this.servicePatients = servicePatients;
    }

   @GetMapping
    public String mostrarPacietes(Model model){
        log.info("Inicio de proceso MostrarPacientes ");
        model.addAttribute("listaPacientes", servicePatients.mostrarTodos() );
        return "listadoPacientes";
    }
    @PostMapping("/pnew")
    public String save(@ModelAttribute Patients nuevoPaciente){
        log.info("Inicio de proceso de Creacion de Paciente");
        boolean result = servicePatients.crearPaciente(nuevoPaciente);
        return "redirect:/";
    }
    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") int id){
        log.info("Inicio de proceso de eliminacion de paciente ");
        boolean result = servicePatients.borrarPaciente(id);
        return "redirect:/";
    }
    @PostMapping
    public String upDate(@ModelAttribute Patients upP){
        log.info("Inicio de proceso de actualizacion de paciente");
        servicePatients.actualizarPaciente(upP);
        return "/";
    }
    @GetMapping("/upD/{id}")
    public String unPaciente(@PathVariable("id") int id, Model model){
        model.addAttribute("pActualiza", servicePatients.encuentraUno(id));
        return "pacientesUpdate";
    }
    @GetMapping("/cancela")
    public String cancela(){
        log.info("Inicio de proceso de Cancelacion de Actualizar Paciente ");
        return "redirect:/";
    }
}
