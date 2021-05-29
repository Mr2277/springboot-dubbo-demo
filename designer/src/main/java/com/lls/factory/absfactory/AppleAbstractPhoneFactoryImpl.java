package com.lls.factory.absfactory;

import com.lls.factory.before.AppleNonSmartPhone;
import com.lls.factory.before.ApplePhone;
import com.lls.factory.before.Phone;

public class AppleAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new AppleNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new ApplePhone();
    }
}
