package com.teamstaffer.config;

import com.teamstaffer.model.Activity;
import com.teamstaffer.model.StaffMember;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(StaffMember.class);
        config.exposeIdsFor(Activity.class);
    }
}
