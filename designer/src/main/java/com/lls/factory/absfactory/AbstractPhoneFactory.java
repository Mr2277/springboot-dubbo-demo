package com.lls.factory.absfactory;

import com.lls.factory.before.Phone;

public interface AbstractPhoneFactory {

    Phone produceNonSmartPhone();

    Phone produceSmartPhone();

}