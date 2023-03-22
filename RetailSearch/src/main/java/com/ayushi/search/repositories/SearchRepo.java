package com.ayushi.search.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ayushi.search.entities.Search;


public interface SearchRepo extends JpaRepository<Search, Integer>{

//	@Query("select p from Search p where p.productname like :key")
//	List<Search> searchByTitle(@Param("key") String productname);
	
//	List<Search> findByTitleContaining(String title);

	List<Search> findByTitleContaining(String keyword);
	
//	List<Search> findByproductContaining(String productname);
}
 