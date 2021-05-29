package com.lls.factory.phone.absfactory;

import com.lls.factory.phone.before.MiNonSmartPhone;
import com.lls.factory.phone.before.MiPhone;
import com.lls.factory.phone.before.Phone;

public class MiAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new MiNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new MiPhone();
    }

}
