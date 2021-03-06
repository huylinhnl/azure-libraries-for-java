/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ARP table associated with the ExpressRouteCircuit.
 */
public class ExpressRouteCircuitArpTable {
    /**
     * Entry age in minutes.
     */
    @JsonProperty(value = "age")
    private Integer age;

    /**
     * Interface address.
     */
    @JsonProperty(value = "interface")
    private String interfaceProperty;

    /**
     * The IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The MAC address.
     */
    @JsonProperty(value = "macAddress")
    private String macAddress;

    /**
     * Get the age value.
     *
     * @return the age value
     */
    public Integer age() {
        return this.age;
    }

    /**
     * Set the age value.
     *
     * @param age the age value to set
     * @return the ExpressRouteCircuitArpTable object itself.
     */
    public ExpressRouteCircuitArpTable withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Get the interfaceProperty value.
     *
     * @return the interfaceProperty value
     */
    public String interfaceProperty() {
        return this.interfaceProperty;
    }

    /**
     * Set the interfaceProperty value.
     *
     * @param interfaceProperty the interfaceProperty value to set
     * @return the ExpressRouteCircuitArpTable object itself.
     */
    public ExpressRouteCircuitArpTable withInterfaceProperty(String interfaceProperty) {
        this.interfaceProperty = interfaceProperty;
        return this;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     * @return the ExpressRouteCircuitArpTable object itself.
     */
    public ExpressRouteCircuitArpTable withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the macAddress value.
     *
     * @return the macAddress value
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress value.
     *
     * @param macAddress the macAddress value to set
     * @return the ExpressRouteCircuitArpTable object itself.
     */
    public ExpressRouteCircuitArpTable withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

}
