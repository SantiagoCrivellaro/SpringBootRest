package com.application.rest.entites.persistence.impl;

import com.application.rest.entites.Maker;
import com.application.rest.entites.persistence.IMakerDAO;
import com.application.rest.repositories.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private MakerRepository repository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) repository.findAll();
    }


    @Override
    public Optional<Maker> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Maker maker) {

        repository.save(maker);
    }

    @Override
    public void deleteById(Long id) {

        repository.deleteById(id);
    }

}
