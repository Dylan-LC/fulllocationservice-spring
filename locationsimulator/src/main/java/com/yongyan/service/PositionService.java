package com.yongyan.service;

import com.yongyan.model.CurrentPosition;

/**
 *
 *
 *
 */
public interface PositionService {

    void processPositionInfo(long id,
                             CurrentPosition currentPosition,
                             boolean exportPositionsToKml,
                             boolean sendPositionsToIngestionSerice);

}
