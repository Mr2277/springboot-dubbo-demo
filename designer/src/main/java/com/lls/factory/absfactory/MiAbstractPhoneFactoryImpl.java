package com.lls.factory.absfactory;

import com.lls.factory.before.MiNonSmartPhone;
import com.lls.factory.before.MiPhone;
import com.lls.factory.before.Phone;

public class MiAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new MiNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new MiPhone();
    }

}
