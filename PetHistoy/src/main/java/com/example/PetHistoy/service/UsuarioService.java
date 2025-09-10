package com.example.PetHistoy.service;

import com.example.PetHistoy.dto.Usuariodto;

public interface UsuarioService {
    Usuariodto crear(Usuariodto usuariodto);
    Usuariodto buscarId(Long id);
}
