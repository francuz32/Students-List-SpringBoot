package cl.bootcamp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bootcamp.modelo.Region;

@Service
public class RegionImplement implements RegionService {

	@Autowired
	private RegionRepository regionRepository;

	@Override
	public ArrayList<Region> listarRegion() {
		return (ArrayList<Region>) regionRepository.findAll();
	}
	
	

}
