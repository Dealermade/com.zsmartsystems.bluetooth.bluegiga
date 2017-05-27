/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the BlueGiga Enumeration <b>BgApiResponse</b>.
 * <p>
 * Response codes
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum BgApiResponse {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * Completed successfully.
     */
    success(0x0000),

    /**
     * Invalid GATT connection handle.
     */
    invalid_conn_handle(0x0101),

    /**
     * Waiting response from GATT server to previous procedure.
     */
    waiting_response(0x0102),

    /**
     * Command contained invalid parameter
     */
    invalid_param(0x0180),

    /**
     * Device is in wrong state to receive command
     */
    wrong_state(0x0181),

    /**
     * File open failed.
     */
    file_open_failed(0x0A01),

    /**
     * XML parsing failed.
     */
    xml_parse_failed(0x0A02),

    /**
     * Device connection failed.
     */
    device_connection_failed(0x0A03);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, BgApiResponse> codeMapping;

    private int key;

    private BgApiResponse(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, BgApiResponse>();
        for (BgApiResponse s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the type code. Returns null if the code does not exist.
     *
     * @param i
     *            the code to lookup
     * @return enumeration value.
     */
    public static BgApiResponse getBgApiResponse(int i) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(i) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(i);
    }

    /**
     * Returns the BlueGiga protocol defined value for this enum
     *
     * @return the BGAPI enumeration key
     */
    public int getKey() {
        return key;
    }
}
