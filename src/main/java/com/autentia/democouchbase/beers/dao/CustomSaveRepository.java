package com.autentia.democouchbase.beers.dao;

public interface CustomSaveRepository<T> {
    <S extends T> S save(S beer);
}
