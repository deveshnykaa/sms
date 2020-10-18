package com.example.BulkDemo.Bulk_Crud_Operations;
// Jai Mata di jai
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BulkCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkCrudOperationsApplication.class, args);
	}

}
