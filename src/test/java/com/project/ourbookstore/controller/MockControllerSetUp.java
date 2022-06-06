package com.project.ourbookstore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

public abstract class MockControllerSetUp {
    protected ObjectMapper objectMapper;

    @BeforeEach
    private void setUp() {
        this.objectMapper = new ObjectMapper();
    }

    protected MockMvc mockMvcSet(Object controller) {
        return MockMvcBuilders.standaloneSetup(controller)
                .addFilter(new CharacterEncodingFilter("UTF-8", true))
                .setMessageConverters(getMappingJackson2HttpMessageConverter())
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .build();

    }

    private MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(objectMapper.registerModule(new JavaTimeModule()));
        return converter;
    }
}
