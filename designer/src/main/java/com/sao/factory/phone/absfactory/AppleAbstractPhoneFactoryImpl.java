package com.sao.factory.phone.absfactory;

import com.sao.factory.phone.before.AppleNonSmartPhone;
import com.sao.factory.phone.before.ApplePhone;
import com.sao.factory.phone.before.Phone;

public class AppleAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new AppleNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new ApplePhone();
    }
}
