package rnxmpp.service;

import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/**
 * Created by Kristian Frølund on 7/19/16.
 * Copyright (c) 2016. Teletronics. All rights reserved
 */

public interface XmppService {

    @ReactMethod
    public void trustHosts(ReadableArray trustedHosts);

    @ReactMethod
    void setup(String jid, String password, String authMethod, String hostname, Integer port);

    @ReactMethod
    void connect();

    @ReactMethod
    void disconnect();

    @ReactMethod
    void sendStanza(String stanza);
}
