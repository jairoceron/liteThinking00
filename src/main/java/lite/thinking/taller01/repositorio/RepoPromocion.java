package lite.thinking.taller01.repositorio;

import lite.thinking.taller01.entidad.Clientea;
import lite.thinking.taller01.entidad.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPromocion extends JpaRepository<Promocion, Integer > {
}
