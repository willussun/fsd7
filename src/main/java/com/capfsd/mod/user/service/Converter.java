package com.capfsd.mod.user.service;

@FunctionalInterface
public interface Converter<S, T> {
    T convert(S source);
}
