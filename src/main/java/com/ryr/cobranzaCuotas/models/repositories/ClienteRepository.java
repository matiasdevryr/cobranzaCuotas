package com.ryr.cobranzaCuotas.models.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.ryr.cobranzaCuotas.models.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, ObjectId> {

}
