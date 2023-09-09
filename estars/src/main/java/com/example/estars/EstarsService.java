package com.example.estars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstarsService {
    @Autowired
    private EstarsRepository repo;

    //select methods, delete method, save method, get method

    public List<Estars> showAllStarsFound() {
        return (List<Estars>) repo.findAll();
    }

    public void save(Estars std) {
        repo.save(std);
    }

    //call delete method from controller which will refer to the index.html
    public void delete(long id) {
        repo.deleteById(id);
    }

    public Estars get(long id) {
        return repo.findById(id).get();
    }
}
