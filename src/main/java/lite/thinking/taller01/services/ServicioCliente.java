package lite.thinking.taller01.services;

import java.util.ArrayList;
import java.util.List;


import lite.thinking.taller01.entidad.Clientea;
import lite.thinking.taller01.repositorio.RepoClientea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class ServicioCliente {


   // ReploClientea
    private RepoClientea repo;

    public ServicioCliente(RepoClientea repo)
    {
        // this keyword refers to current instance
        this.repo = repo;
    }

    public List<Clientea> getAllPerson()
    {
        System.out.println(repo.findAll());

        System.out.println("LiteThinking ....... mi primer microservicio ..........");
        return repo.findAll();
    }


    public List<Clientea> guardarDatos(Integer idPerson, String nombre, String categoria) {

        Clientea clientea = new Clientea(idPerson, nombre,categoria);
         repo.save(clientea);

        List<Clientea> listClientes = new ArrayList<>();
        listClientes.add(clientea);

        Clientea cl = new Clientea(5223,"Aldrin","Premium");
        listClientes.add(cl);

        return listClientes;
    }



    public List<Clientea> getAllPerson2(int idPersona) {
        System.out.println(repo.findAll());
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(idPersona);
        return repo.findAllById(listInteger);
    }
}
