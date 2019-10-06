package br.com.ks.flyservice.controllers;

import br.com.ks.flyservice.service.dto.VoosDTO;
import br.com.ks.flyservice.service.impl.VoosServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Voos Api")
@RestController
public class VoosController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private VoosServiceImpl voosService;

    public VoosController(VoosServiceImpl voosService) {
        this.voosService = voosService;
    }

    @ApiOperation(value = "Metodo para retornar os Voos persistido na aplicação!")
    @GetMapping(value = "api/voos", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<VoosDTO> recuperarVoos() {
        log.info("Recuperando lista de voos");
        return voosService.findAll();
    }


}
