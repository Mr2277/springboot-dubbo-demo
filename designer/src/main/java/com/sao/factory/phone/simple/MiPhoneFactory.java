package com.sao.factory.phone.simple;

import com.sao.factory.phone.before.MiPhone;
import com.sao.factory.phone.before.Phone;

public class MiPhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new MiPhone();
    }

}
