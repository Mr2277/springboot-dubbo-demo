package com.lls.factory.phone.simple;

import com.lls.factory.phone.before.ApplePhone;
import com.lls.factory.phone.before.Phone;

public class ApplePhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new ApplePhone();
    }

}
