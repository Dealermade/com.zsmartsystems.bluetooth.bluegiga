/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.bluetooth.bluegiga.command.gap;

import com.zsmartsystems.bluetooth.bluegiga.BlueGigaCommand;

/**
 * Class to implement the BlueGiga command <b>setAdvParameters</b>.
 * <p>
 * This command is used to set the advertising parameters. Example: If the minimum
 * advertisement interval is 40ms and the maximum advertisement interval is 100ms then the
 * real advertisement interval will be mostly the middle value (70ms) plus a randomly added
 * 20ms delay, which needs to be added according to the Bluetooth specification.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaSetAdvParametersCommand extends BlueGigaCommand {
    public static int COMMAND_CLASS = 0x06;
    public static int COMMAND_METHOD = 0x08;

    /**
     * Minimum advertisement interval in units of 625us. Range: 0x20 to 0x4000. Default: 0x200
     * (320ms) Explanation: 0x200 = 512 512 * 625us = 320000us = 320ms
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int adv_interval_min;

    /**
     * Maximum advertisement interval in units of 625us. Range: 0x20 to 0x4000. Default: 0x200
     * (320ms)
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int adv_interval_max;

    /**
     * A bit mask to identify which of the three advertisement channels are used. Examples: 0x07:
     * All three channels are used 0x03: Advertisement channels 37 and 38 are used. 0x04: Only
     * advertisement channel 39 is used
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int adv_channels;
    /**
     * Minimum advertisement interval in units of 625us. Range: 0x20 to 0x4000. Default: 0x200
     * (320ms) Explanation: 0x200 = 512 512 * 625us = 320000us = 320ms
     *
     * @param adv_interval_min the adv_interval_min to set as {@link int}
     */
    public void setAdv_interval_min(int adv_interval_min) {
        this.adv_interval_min = adv_interval_min;
    }

    /**
     * Maximum advertisement interval in units of 625us. Range: 0x20 to 0x4000. Default: 0x200
     * (320ms)
     *
     * @param adv_interval_max the adv_interval_max to set as {@link int}
     */
    public void setAdv_interval_max(int adv_interval_max) {
        this.adv_interval_max = adv_interval_max;
    }

    /**
     * A bit mask to identify which of the three advertisement channels are used. Examples: 0x07:
     * All three channels are used 0x03: Advertisement channels 37 and 38 are used. 0x04: Only
     * advertisement channel 39 is used
     *
     * @param adv_channels the adv_channels to set as {@link int}
     */
    public void setAdv_channels(int adv_channels) {
        this.adv_channels = adv_channels;
    }


    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(COMMAND_CLASS, COMMAND_METHOD);

        // Serialize the fields
        serializeUInt16(adv_interval_min);
        serializeUInt16(adv_interval_max);
        serializeUInt8(adv_channels);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaSetAdvParametersCommand [adv_interval_min=");
        builder.append(adv_interval_min);
        builder.append(", adv_interval_max=");
        builder.append(adv_interval_max);
        builder.append(", adv_channels=");
        builder.append(adv_channels);
        builder.append("]");
        return builder.toString();
    }
}
