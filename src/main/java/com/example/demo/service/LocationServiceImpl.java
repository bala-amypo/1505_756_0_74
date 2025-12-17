package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    LocationRepository Locationrepo;

    @Override
    public LocationEntity createlocation(LocationEntity location) {

        return Locationrepo.save(location);
    }

    @Override
    public List<LocationEntity> getallLocation() {
        return Locationrepo.findAll();
    }
}
