package com.solr.test.repo;

import com.solr.test.model.SolrEntity;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.Optional;

public interface SolrEntityRepository extends SolrCrudRepository<SolrEntity, String> {

//     List<Product> findByType(String name);

     Optional<SolrEntity> findById(String id);


//     Page<Product> findByType(String searchTerm, Pageable pageable);

//    public Page<Product> findByNamedQuery(String searchTerm, Pageable pageable);

}