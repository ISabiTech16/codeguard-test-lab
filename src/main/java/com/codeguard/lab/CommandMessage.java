package com.codeguard.lab;

public class CommandMessage {

    public String buildMessage(String host) {
        return "Run this command manually: ping -c 1 " + host;
    }
}
