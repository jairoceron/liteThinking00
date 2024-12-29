package lite.thinking.taller01.controller;


import lite.thinking.taller01.entidad.Clientea;
import lite.thinking.taller01.services.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    private final ServicioCliente personService;
    public ClienteController(ServicioCliente personService){
        this.personService=personService;
    }

    @GetMapping("/personsX")
    public ResponseEntity<List<Clientea>> getAllPersonsR() {
        return ResponseEntity.ok(personService.getAllPerson());
    }

    @GetMapping("/api/employees/{idCliente}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String idCliente)
    { return "ID: " + idCliente; }

    @GetMapping("/api/employeest/{idCliente}")
    @ResponseBody
    public String getEmployeesById2(@PathVariable String idCliente)
    { return "ID: " + idCliente; }


    @GetMapping("/api/employeeswithvariable/{id}")
    @ResponseBody public String getEmployeesByIdWithVariableName(@PathVariable("id")
                                                                 String employeeId)
    {
        return "ID: " + employeeId;
    }

    @GetMapping("/api/guardarData/{idCliente}/{nombre}/{categoria}")
    @ResponseBody public List<Clientea> guardarData(@PathVariable("idCliente")
                                                        int idCliente,  @PathVariable String nombre , @PathVariable String categoria)
    {
        System.out.println(idCliente);
        System.out.println(nombre);
        System.out.println(categoria);


        return personService.guardarDatos(idCliente, nombre, categoria);
        // System.out.println("Registro guardado");
        // return "ID: ";
    }





    @GetMapping("/persons")
    public List<Clientea> getAllPersons() {
        return personService.getAllPerson();
    }

    @GetMapping("/personsbyId/{idPersona}")
    public List<Clientea> getAllPerson2(@PathVariable int idPersona) {
        return personService.getAllPerson2(idPersona);
    }
}
