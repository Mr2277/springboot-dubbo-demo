package com.lls.factory.simple;

import com.lls.factory.before.MiPhone;
import com.lls.factory.before.Phone;

public class MiPhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new MiPhone();
    }

}
