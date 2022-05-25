package com.javaweb;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * main
 *
 * @author zxcsjf
 * @since 2022/05/25 22:05
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("ShanJifeiTB14");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
