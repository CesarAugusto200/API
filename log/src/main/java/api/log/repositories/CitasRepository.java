package api.log.repositories;
import api.log.models.CitasModel;
import org.springframework.data.repository.CrudRepository;

public interface CitasRepository extends CrudRepository<CitasModel, Long> {

    // public CitasModel findByName(String name);
}
