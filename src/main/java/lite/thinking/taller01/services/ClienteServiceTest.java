package lite.thinking.taller01.services;


import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;


import lite.thinking.taller01.entidad.Clientea;
import lite.thinking.taller01.repositorio.RepoClientea;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)

// Main class

public class ClienteServiceTest {

    @Mock
    private RepoClientea personRepo;
    //When using Mockito Use @InjectMocks to inject
    //Mocked beans to following class
    @InjectMocks
    private ServicioCliente personService;

    @Test
    void getAllPerson()
    {
        //given
        Clientea person= new Clientea( 1,"Ahnis","Gotham");
        Clientea person2= new Clientea(2,"Saksham","New york");
        //When
        given(personRepo.findAll())
                .willReturn(List.of(person,person2));
        var  personList = personService.getAllPerson();
        //Then
        //Make sure to import assertThat From org.assertj.core.api package
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(3);
    }
}

