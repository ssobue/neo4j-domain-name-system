package dev.ssobue.neo4j.dns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launch Class.
 *
 * @author ssobue
 */
@SpringBootApplication
public class Neo4jDomainNameSystemApplication {

    /**
     * Main Method.
     *
     * @param args Command Line Arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(Neo4jDomainNameSystemApplication.class, args);
    }
}
