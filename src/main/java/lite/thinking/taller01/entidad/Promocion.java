package lite.thinking.taller01.entidad;

import jakarta.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idpromocion;


     String fechainicial ;


     String fechafinal;
     String descripcion;



}
