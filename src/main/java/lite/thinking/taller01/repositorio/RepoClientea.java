package lite.thinking.taller01.repositorio;

import lite.thinking.taller01.entidad.Clientea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepoClientea extends JpaRepository<Clientea, Integer> {
    boolean existsById(Integer id);

    @Override
    List<Clientea> findAll();

    @Override
    List<Clientea> findAllById(Iterable<Integer> integers);

    @Override
    Optional<Clientea> findById(Integer integer);
}
