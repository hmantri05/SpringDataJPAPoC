# SpringDataJPAPoC
Spring Data using MongoDB PoC


Spring Data MongoDB uses the MongoTemplate to execute the queries behind your find* methods. You can use the template yourself for more complex queries.

Spring Boot will handle those repositories automatically as long as they are included in the same package (or a sub-package) of your @SpringBootApplication class. For more control over the registration process, you can use the @EnableMongoRepositories annotation.
