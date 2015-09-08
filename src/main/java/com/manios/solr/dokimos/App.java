package com.manios.solr.dokimos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manios.solr.dokimos.repository.SolrIndexDocumentRepository;

/**
 * Let's play with SolrCloud
 *
 */
public class App {

	public static void main(String[] args) {

		// Some code to test CloudSolrClient factory implementation towards a solr-4.10.2 SolrCloud

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SolrIndexDocumentRepository solrIndexDocumentRepository = (SolrIndexDocumentRepository) context
				.getBean("solrIndexDocumentRepository");

		SolrIndexDocument pilot1 = new SolrIndexDocument("1", "Bob", "Sbab", 19, "F-5 Tiger");
		SolrIndexDocument pilot2 = new SolrIndexDocument("2", "Sanos", "Terlepepes", 23, "F-16");
		SolrIndexDocument pilot3 = new SolrIndexDocument("3", "Mpampis", "Sbobos", 24, "F-18");
		SolrIndexDocument pilot4 = new SolrIndexDocument("4", "Ιωάννης", "Μακρυγιάννης", 24, "SR-71");

		solrIndexDocumentRepository.save(pilot1);
		solrIndexDocumentRepository.save(pilot2);
		solrIndexDocumentRepository.save(pilot3);
		solrIndexDocumentRepository.save(pilot4);

		System.out.println("All pilots where saved!!");

		context.close();
	}
}
