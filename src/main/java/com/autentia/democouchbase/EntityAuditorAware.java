package com.autentia.democouchbase;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class EntityAuditorAware implements AuditorAware<String> {

    private final static String AUDITOR = "Pablo Betancor";

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(AUDITOR);
    }
}
