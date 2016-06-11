package services;

import models.EvtHandlingEnd;

import java.util.List;

/**
 * Created by prate_000 on 30-05-2016.
 */
public interface EvtHandlingEndService {
    List<EvtHandlingEnd> getEvtHandlingEndList();
    List<EvtHandlingEnd> getEvtHandlingEndByTime(int time);
    List<EvtHandlingEnd> getEvtHandlingEndByFlightId(int flight_id);
}
