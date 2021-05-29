package com.lls.factory.phone.absfactory;

import com.lls.factory.phone.before.AppleNonSmartPhone;
import com.lls.factory.phone.before.ApplePhone;
import com.lls.factory.phone.before.Phone;

public class AppleAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new AppleNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new ApplePhone();
    }
}
