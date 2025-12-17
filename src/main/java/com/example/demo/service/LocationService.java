package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.LocationEntity;
@Service
public interface LocationService {
    LocationEntity createlocation(LocationEntity location);
    List<LocationEntity> getallLocation();
}
