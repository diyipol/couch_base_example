package com.autentia.democouchbase.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

import java.math.BigDecimal;

@WritingConverter
public class BigDecimalToStringConverter implements Converter<BigDecimal, String> {

    @Override
    public String convert(BigDecimal source) {
        return source.toString();
    }
}
