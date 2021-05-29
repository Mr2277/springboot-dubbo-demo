package com.lls.factory.phone.simple;

import com.lls.factory.phone.before.MiPhone;
import com.lls.factory.phone.before.Phone;

public class MiPhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new MiPhone();
    }

}
