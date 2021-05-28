package com.lls.factory.simple;

import com.lls.factory.before.ApplePhone;
import com.lls.factory.before.Phone;

public class ApplePhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new ApplePhone();
    }

}
