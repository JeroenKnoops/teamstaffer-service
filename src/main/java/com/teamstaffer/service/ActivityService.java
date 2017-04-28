package com.teamstaffer.service;

import com.teamstaffer.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity[] getActivities() {

        List<Activity> ActivityList = new ArrayList<>();
        for (Activity s : activityRepository.findAll()) {
            ActivityList.add(s);
        }

        return ActivityList.stream().toArray(Activity[]::new);
    }

    public Activity createActivity(Activity activity) {

        return activityRepository.save(activity);
    }

}
