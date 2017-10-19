package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;
import com.pluralsight.model.YogaActivity;

@Service("yogaService")
public class YogaServiceImpl implements YogaService {

	public List<YogaActivity> findYogaActivities() {

		List<YogaActivity> activities1 = new ArrayList<YogaActivity>();

		YogaActivity runing = new YogaActivity();
		runing.setRun("Run");
		activities1.add(runing);

		YogaActivity bike = new YogaActivity();
		bike.setRun("Bike");
		activities1.add(bike);

		YogaActivity swim = new YogaActivity();
		swim.setRun("Swim");
		activities1.add(swim);

		return activities1;
	}

}
