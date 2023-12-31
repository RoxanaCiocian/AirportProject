package com.example.demo.sms;

import com.example.demo.sms.model.SMS;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class SMSService {
    private final String ACCOUNT_SID = "AC0c5a67f42c5e13fa6f32a62990a483f7";

    private final String AUTH_TOKEN = "99e6fe714cb58b1080796b216150e23f";

    private final String FROM_NUMBER = "+15612500624";

    public void send(SMS sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();

    }

}
