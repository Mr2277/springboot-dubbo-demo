package com.lls.factory.phone.absfactory;

import com.lls.factory.phone.before.Phone;

public interface AbstractPhoneFactory {

    Phone produceNonSmartPhone();

    Phone produceSmartPhone();

}