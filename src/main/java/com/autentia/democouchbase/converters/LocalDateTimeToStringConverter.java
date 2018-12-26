package com.autentia.democouchbase.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ReadingConverter
public class LocalDateTimeToStringConverter implements Converter<LocalDateTime, String> {

    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public String convert(LocalDateTime source) {
        return source.format(FORMATTER);
    }
}
