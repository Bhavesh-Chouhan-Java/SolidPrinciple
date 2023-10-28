package com.jalaramcwa.solid.srp;

public class NotificationService {


    public void setOtp(String type) {
        if(type.equals("email")){
            System.out.println("Email OTP Service...");
        }else if(type.equals("message")){
            System.out.println("Message OTP Service...");
        }else {
            System.out.println("OTP Service...");
        }
    }

}
