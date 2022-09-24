package cl.bootcamp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modelo.Region;

@Repository
public interface RegionRepository extends CrudRepository<Region, Integer> {

}
