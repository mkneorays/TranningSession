package com.neorays.cnfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {PersistanceConfiguration.class ,ServiceConfiguration.class })
@Configuration
public class RootAppConfiguration {

}
