package com.sao.factory.phone.simple;

import com.sao.factory.phone.before.ApplePhone;
import com.sao.factory.phone.before.Phone;

public class ApplePhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new ApplePhone();
    }

}
