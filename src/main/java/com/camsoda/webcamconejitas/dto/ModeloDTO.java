package com.camsoda.webcamconejitas.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ModeloDTO {

    private Integer idModelo;
    private String nombreArtista;
    private String correo;

}
