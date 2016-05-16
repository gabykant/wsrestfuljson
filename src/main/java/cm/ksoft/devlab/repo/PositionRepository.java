package cm.ksoft.devlab.repo;

import org.springframework.data.repository.CrudRepository;

import cm.ksoft.devlab.models.*;

public interface PositionRepository extends CrudRepository<Position, Long>{
	
	Position findById(Long id);
}
