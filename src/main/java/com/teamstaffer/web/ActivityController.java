package com.teamstaffer.web;

import com.teamstaffer.model.Activity;
import com.teamstaffer.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Activity[]> getActivities() {
        return ResponseEntity.ok(this.activityService.getActivities());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> createActivity(@RequestBody Activity activity) {

        return ResponseEntity.ok(this.activityService.createActivity(activity).getActivityName());
    }

}
