package com.sao.factory.phone.absfactory;

import com.sao.factory.phone.before.MiNonSmartPhone;
import com.sao.factory.phone.before.MiPhone;
import com.sao.factory.phone.before.Phone;

public class MiAbstractPhoneFactoryImpl implements AbstractPhoneFactory {

    public Phone produceNonSmartPhone() {
        return new MiNonSmartPhone();
    }

    public Phone produceSmartPhone() {
        return new MiPhone();
    }

}
