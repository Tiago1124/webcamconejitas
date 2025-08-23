package com.camsoda.webcamconejitas.controller;

import com.camsoda.webcamconejitas.dto.ModeloDTO;
import com.camsoda.webcamconejitas.mapper.ModeloMapper;
import com.camsoda.webcamconejitas.model.Modelo;
import com.camsoda.webcamconejitas.repository.ModeloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/modelo")
@RestController
public class ModeloController {
    private final ModeloRepository modeloRepository;

    @GetMapping("/all")
    public List<ModeloDTO> listarModelos() {
        List<Modelo> modelos = modeloRepository.findAll();
        List<ModeloDTO> modelosDTO = ModeloMapper.listModeloToDTO(modelos);
        return modelosDTO;
    }
}
