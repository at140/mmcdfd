package com.mmc.iframepoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ControllerConfig implements WebMvcConfigurer{
	
	  // ...

	//  @Bean
	 /* public CookieSerializer cookieSerializer() {
	    DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
	    cookieSerializer.setSameSite("None");
	    cookieSerializer.setUseSecureCookie(true);
	    return cookieSerializer;
	}*/
}
