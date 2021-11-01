package com.smolano.cupboard.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConversionService {
    @Autowired
    private ModelMapper modelMapper;

    public <T> T mapObject(Object dtoToTransformToEntity, Class<T> entityClass) {
        return (T) modelMapper.map(dtoToTransformToEntity, entityClass);

    }

    public <S, T> List<T> mapList(List<S> source, Class<T> type) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, type))
                .collect(Collectors.toList());
    }

}
