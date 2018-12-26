package com.autentia.democouchbase.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WritingConverter
public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {

    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public LocalDateTime convert(String source) {
        return LocalDateTime.parse(source, FORMATTER);
    }
}
