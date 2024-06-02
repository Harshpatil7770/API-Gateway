package com.cbank.gateway.bootstrap;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

import lombok.extern.slf4j.Slf4j;

@ComponentScan
@Slf4j
public class GatewaybootStrap {

	@EventListener(ApplicationReadyEvent.class)
	public void bootStrap() {
		log.info("*********************************************************");
		log.info("*********************************************************");
		log.info("******************* API GATEWAY STARTED *****************");
		log.info("*********************************************************");
		log.info("*********************************************************");
	}
}
