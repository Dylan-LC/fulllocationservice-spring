package com.yongyan.service;

import com.yongyan.model.DirectionInput;
import com.yongyan.model.Point;
import com.yongyan.model.ServiceLocation;
import com.yongyan.model.SimulatorFixture;

import java.io.File;
import java.util.List;

/**
 *
 *
 *
 */
public interface PathService {

    /**
     * @return
     */
    List<DirectionInput> loadDirectionInput();

    SimulatorFixture loadSimulatorFixture();

    /**
     * @param directionInput
     * @return
     */
    List<Point> getCoordinatesFromGoogle(DirectionInput directionInput);

    String getCoordinatesFromGoogleAsPolyline(DirectionInput directionInput);


//    List<Point> getCoordinatesFromKmlFile(File kmlFile);

    List<ServiceLocation> getServiceStations();
}
