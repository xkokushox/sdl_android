package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.VehicleDataResultCode;
/** Individual requested DID result and data.
 * 
 * <p><b>Parameter List</b></p>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Param Name</th>
 * 			<th>Type</th>
 * 			<th>Mandatory</th>
 *                 <th> Additional</th>
 * 			<th>Description</th>
 * 		</tr>
 * 		<tr>
 * 			<td>resultCode</td>
 * 			<td>VehicleDataResultCode</td>
 * 			<td>true</td>
 *                 <td></td>
 * 			<td>Individual DID result code </td>
 * 		</tr>
 * 		<tr>
 * 			<td>didLocation</td>
 * 			<td>Integer</td>
 * 			<td>true</td>
 *                 <td>minvalue = 0  maxvalue = 65535 </td>
 * 			<td>The address of DID location from the ReadDID request.</td>
 * 		</tr>
 *
 * 		<tr>
 * 			<td>data</td>
 * 			<td>String</td>
 * 			<td>false</td>
 *                 <td>maxlength = 5000 </td>
 * 			<td>The DID data which is the hex byte string of however many bytes are stored at that location</td>
 * 		</tr>
 *  </table>
 * @since SmartDeviceLink 1.0
 * 
 * @see VehicleDataResultCode
 * @see ReadDID
 */

public class DIDResult extends RPCStruct {
	public static final String KEY_RESULT_CODE = "resultCode";
	public static final String KEY_DATA = "data";
	public static final String KEY_DID_LOCATION = "didLocation";
	/** <p>Constructs a new DIDResult object indicated by the Hashtable
	 * parameter</p>
	 * @param hash
	 * The hash table to use
	 */	

    public DIDResult() {}
    public DIDResult(Hashtable<String, Object> hash) {
        super(hash);
    }
    public void setResultCode(VehicleDataResultCode resultCode) {
    	setValue(KEY_RESULT_CODE, resultCode);
    }
    public VehicleDataResultCode getResultCode() {
		return (VehicleDataResultCode) getObject(VehicleDataResultCode.class, KEY_RESULT_CODE);
    }
    public void setDidLocation(Integer didLocation) {
    	setValue(KEY_DID_LOCATION, didLocation);
    }
    public Integer getDidLocation() {
    	return getInteger(KEY_DID_LOCATION);
    }    
    public void setData(String data) {
    	setValue(KEY_DATA, data);
    }
    public String getData() {
    	return getString(KEY_DATA);
    }
}
