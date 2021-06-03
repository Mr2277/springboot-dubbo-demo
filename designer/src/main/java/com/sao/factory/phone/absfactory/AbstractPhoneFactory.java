package com.sao.factory.phone.absfactory;

import com.sao.factory.phone.before.Phone;

public interface AbstractPhoneFactory {

    Phone produceNonSmartPhone();

    Phone produceSmartPhone();

}