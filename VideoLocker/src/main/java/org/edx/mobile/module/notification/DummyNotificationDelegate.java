package org.edx.mobile.module.notification;

import org.edx.mobile.model.api.EnrolledCoursesResponse;

import java.util.List;

public class DummyNotificationDelegate implements NotificationDelegate{
    @Override
    public void unsubscribeAll() {

    }

    @Override
    public void resubscribeAll() {

    }

    @Override
    public void syncWithNotificationServer() {

    }

    @Override
    public void checkCourseEnrollment(List<EnrolledCoursesResponse> responses) {

    }

    @Override
    public void changeNotificationSetting(String courseId, String channelId, boolean subscribe) {

    }

    @Override
    public void subscribeAndUnsubscribeToServer(String channel, boolean subscribe) {

    }

    @Override
    public boolean isSubscribedByCourseId(String channel){
        return false;
    }
}