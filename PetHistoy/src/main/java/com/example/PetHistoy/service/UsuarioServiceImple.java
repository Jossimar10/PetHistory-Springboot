package com.example.PetHistoy.service;

import org.springframework.stereotype.Service;

import com.example.PetHistoy.dto.Usuariodto;
import com.example.PetHistoy.models.Usuario;

import jakarta.persistence.EntityNotFoundException;
import mapper.UsuarioMapper;
import repository.UsuarioRepository;

@Service
public class UsuarioServiceImple implements UsuarioService{

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioServiceImple(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper){
        this.usuarioRepository= usuarioRepository;
        this.usuarioMapper= usuarioMapper;
    }

    @Override
    public Usuariodto crear(Usuariodto usuariodto){
        Usuario usuario = usuarioMapper.toUsuario(usuariodto);
        Usuario guardado = usuarioRepository.save(usuario);
        return usuarioMapper.toUsuariodto(guardado);
    }

    @Override
    public Usuariodto buscarId(Long id){
        return usuarioRepository.findById(id).map(usuarioMapper::toUsuariodto).orElseThrow(()-> new EntityNotFoundException("Usuario no encontrado"));
    }
}
