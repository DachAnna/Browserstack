package com.annadach.config;

import org.aeonbits.owner.Config;

@MainConfig.Sources({"classpath:config/properties"})
public interface MainConfig extends Config {

    @Config.Key("userName")
    String getUserName();

    @Config.Key("accessKey")
    String getAccessKey();

    @Config.Key("baseUrl")
    String getBaseUrl();

}