package com.codewithsatyaki;

import com.codewithsatyaki.state.DirectionService.BicyclingMode;
import com.codewithsatyaki.state.DirectionService.DirectionService;
import com.codewithsatyaki.state.DirectionService.DrivingMode;

public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new BicyclingMode());
        directionService.getEta();
        directionService.getDirection();
    }
}
