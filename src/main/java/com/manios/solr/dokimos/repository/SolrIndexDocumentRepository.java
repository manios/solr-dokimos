package com.manios.solr.dokimos.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.manios.solr.dokimos.SolrIndexDocument;

/**
 * 
 * @author cmanios
 */
@Repository
public interface SolrIndexDocumentRepository extends
		SolrCrudRepository<SolrIndexDocument, String> {

}
