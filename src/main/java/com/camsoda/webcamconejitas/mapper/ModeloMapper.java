package com.camsoda.webcamconejitas.mapper;

import com.camsoda.webcamconejitas.dto.ModeloDTO;
import com.camsoda.webcamconejitas.model.Modelo;

public class ModeloMapper {


    public static ModeloDTO modelToDTO(Modelo modelo) {
        return ModeloDTO.builder()
                .idModelo(modelo.getIdModelo())
                .nombreArtista(modelo.getNombreArtista())
                .correo(modelo.getCorreo())
                .build();
    }


    public static Modelo dtoToModel(ModeloDTO modeloDTO) {
        return Modelo.builder()
                .idModelo(modeloDTO.getIdModelo())
                .nombreArtista(modeloDTO.getNombreArtista())
                .correo(modeloDTO.getCorreo())
                .build();
    }
}
