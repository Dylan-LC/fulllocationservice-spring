package com.yongyan.service;

import com.yongyan.model.GpsSimulatorRequest;
import com.yongyan.model.Point;
import com.yongyan.task.GpsSimulator;

import java.io.File;
import java.util.List;

/**
 *
 *
 */

public interface GpsSimulatorFactory {

    GpsSimulator prepareGpsSimulator(GpsSimulatorRequest gpsSimulatorRequest);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, File kmlFile);

    GpsSimulator prepareGpsSimulator(GpsSimulator gpsSimulator, List<Point> points);

}
