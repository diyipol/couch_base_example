package com.autentia.democouchbase.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.math.BigDecimal;

@ReadingConverter
public class StringToBigDecimalConverter implements Converter<String, BigDecimal> {

    @Override
    public BigDecimal convert(String source) {
        return new BigDecimal(source);
    }
}
