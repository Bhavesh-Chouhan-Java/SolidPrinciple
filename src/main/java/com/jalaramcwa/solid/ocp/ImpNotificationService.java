package com.jalaramcwa.solid.ocp;

public interface ImpNotificationService {
    public abstract void sendOtp(String type);

    public abstract void sendTransactionReport(String type);


}
