package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.constants.Constants;

/**
 * Alert Response is sent, when Alert has been called
 * 
 * @since SmartDeviceLink 1.0
 */
public class AlertResponse extends RPCResponse {

	/**
	 * Constructs a new AlertResponse object
	 */
    public AlertResponse() {
        super(FunctionID.ALERT.toString());
    }

	/**
	 * <p>Constructs a new AlertResponse object indicated by the Hashtable
	 * parameter
	 * </p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public AlertResponse(Hashtable<String, Object> hash) {
        super(hash);
    }
    public Integer getTryAgainTime() {
        return (Integer) parameters.get(Constants.KEY_TRY_AGAIN_TIME);
    }
    public void setTryAgainTime(Integer tryAgainTime) {
        if (tryAgainTime != null) {
            parameters.put(Constants.KEY_TRY_AGAIN_TIME, tryAgainTime);
        } else {
            parameters.remove(Constants.KEY_TRY_AGAIN_TIME);
        }
    }
}
