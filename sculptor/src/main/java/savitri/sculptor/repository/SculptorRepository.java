package savitri.sculptor.repository;

	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import savitri.sculptor.model.Sculptor;

	@Repository
	@Qualifier("SculRepo")
	public interface SculptorRepository extends JpaRepository<Sculptor, Long>{

	}

