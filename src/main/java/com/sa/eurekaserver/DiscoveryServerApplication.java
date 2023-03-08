package com.sa.eurekaserver;

import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl.EurekaJerseyClientBuilder;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {
	
	static Logger logger = LoggerFactory.getLogger(DiscoveryServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
		
		testLogging();
	}
	
	public static void testLogging() {
		try {
			logger.debug("A DEBUG Message");
			logger.info("An INFO Message");
			logger.warn("A WARN Message");
			logger.error("An ERROR Message");
		} catch (Exception e){
			
		}
	}
/*	
	@Bean
	public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs() throws NoSuchAlgorithmException {
		DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
		//System.setProperty("javax.net.ssl.keyStore", "src/main/resources/eureka.p12");
	    System.setProperty("javax.net.ssl.keyStore", "/tmp/eureka.p12");
		System.setProperty("javax.net.ssl.keyStorePassword", "password");
		//System.setProperty("javax.net.ssl.trustStore", "src/main/resources/eureka.p12");
		System.setProperty("javax.net.ssl.trustStore", "/tmp/eureka.p12");
		System.setProperty("javax.net.ssl.trustStorePassword", "password");
		EurekaJerseyClientBuilder builder = new EurekaJerseyClientBuilder();
		builder.withClientName("eureka");
		builder.withSystemSSLConfiguration();
		builder.withMaxTotalConnections(10);
		builder.withMaxConnectionsPerHost(10);
		args.setEurekaJerseyClient(builder.build());
		return args;
	}
*/

}
