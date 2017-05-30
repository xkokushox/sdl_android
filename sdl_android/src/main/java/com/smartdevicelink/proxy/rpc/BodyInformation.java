package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.constants.Constants;
import com.smartdevicelink.proxy.rpc.enums.IgnitionStableStatus;
import com.smartdevicelink.proxy.rpc.enums.IgnitionStatus;
/** The body information including power modes. 
 * 
 * <p><b>Note:</b> The structure defines the information about the park brake and ignition.</p>
 * 
 * <p><b>Parameter List</b></p>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Param Name</th>
 * 			<th>Type</th>
 * 			<th>Mandatory</th>
 * 			<th>Description</th>
 * 			<th>Version</th>
 * 		</tr>
 * 		<tr>
 * 			<td>parkBrakeActive</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>Describes, if the parkbreak is active. The information about the park brake: - true, if active - false if not.</td>
 *  			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>ignitionStableStatus</td>
 * 			<td>IgnitionStableStatus</td>
 * 			<td>true</td>
 * 			<td>Describes, if the ignition situation is considered stableThe information about stability of the ignition switch. See {@linkplain IgnitionStableStatus}</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>ignitionStatus</td>
 * 			<td>IgnitionStatus</td>
 * 			<td>true</td>
 * 			<td>The information about ignition status. See {@linkplain  IgnitionStatus}</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>parkBrakeActive</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>The information about the park brake: - true, if active - false if not.</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>driverDoorAjar</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>The information about the park brake: - true, if active - false if not.</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>passengerDoorAjar</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>The information about the park brake: - true, if active - false if not.</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>rearLeftDoorAjar</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>The information about the park brake: - true, if active - false if not.</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>rearRightDoorAjar</td>
 * 			<td>Boolean</td>
 * 			<td>true</td>
 * 			<td>References signal "DrStatRr_B_Actl".</td>
 * 			<td>SmartDeviceLink 2.0</td>
 * 		</tr>
 * 
 *  </table>
 * @since SmartDeviceLink 2.0
 * @see SubscribeVehicleData  
 * @see GetVehicleData
 * @see OnVehicleData 
 *
 */

public class BodyInformation extends RPCStruct {
	/** Constructs a new BodyInformation object indicated by the Hashtable
	 * parameter
	 * @param hash
	 * The hash table to use
	 * 
	 *
	 */

    public BodyInformation() { }
    public BodyInformation(Hashtable<String, Object> hash) {
        super(hash);
    }

    public void setParkBrakeActive(Boolean parkBrakeActive) {
        if (parkBrakeActive != null) {
        	store.put(Constants.KEY_PARK_BRAKE_ACTIVE, parkBrakeActive);
        } else {
        	store.remove(Constants.KEY_PARK_BRAKE_ACTIVE);
        }
    }
    public Boolean getParkBrakeActive() {
        return (Boolean) store.get(Constants.KEY_PARK_BRAKE_ACTIVE);
    }
    public void setIgnitionStableStatus(IgnitionStableStatus ignitionStableStatus) {
        if (ignitionStableStatus != null) {
            store.put(Constants.KEY_IGNITION_STABLE_STATUS, ignitionStableStatus);
        } else {
        	store.remove(Constants.KEY_IGNITION_STABLE_STATUS);
        }
    }
    public IgnitionStableStatus getIgnitionStableStatus() {
        Object obj = store.get(Constants.KEY_IGNITION_STABLE_STATUS);
        if (obj instanceof IgnitionStableStatus) {
            return (IgnitionStableStatus) obj;
        } else if (obj instanceof String) {
        	return IgnitionStableStatus.valueForString((String) obj);
        }
        return null;
    }
    public void setIgnitionStatus(IgnitionStatus ignitionStatus) {
        if (ignitionStatus != null) {
            store.put(Constants.KEY_IGNITION_STATUS, ignitionStatus);
        } else {
        	store.remove(Constants.KEY_IGNITION_STATUS);
        }
    }
    public IgnitionStatus getIgnitionStatus() {
        Object obj = store.get(Constants.KEY_IGNITION_STATUS);
        if (obj instanceof IgnitionStatus) {
            return (IgnitionStatus) obj;
        } else if (obj instanceof String) {
            return IgnitionStatus.valueForString((String) obj);
        }
        return null;
    }
    
    public void setDriverDoorAjar(Boolean driverDoorAjar) {
        if (driverDoorAjar != null) {
        	store.put(Constants.KEY_DRIVER_DOOR_AJAR, driverDoorAjar);
        } else {
        	store.remove(Constants.KEY_DRIVER_DOOR_AJAR);
        }
    }    
    public Boolean getDriverDoorAjar() {
        return (Boolean) store.get(Constants.KEY_DRIVER_DOOR_AJAR);
    }
    
    
    public void setPassengerDoorAjar(Boolean passengerDoorAjar) {
        if (passengerDoorAjar != null) {
        	store.put(Constants.KEY_PASSENGER_DOOR_AJAR, passengerDoorAjar);
        } else {
        	store.remove(Constants.KEY_PASSENGER_DOOR_AJAR);
        }
    }    
    public Boolean getPassengerDoorAjar() {
        return (Boolean) store.get(Constants.KEY_PASSENGER_DOOR_AJAR);
    }
    
    public void setRearLeftDoorAjar(Boolean rearLeftDoorAjar) {
        if (rearLeftDoorAjar != null) {
        	store.put(Constants.KEY_REAR_LEFT_DOOR_AJAR, rearLeftDoorAjar);
        } else {
        	store.remove(Constants.KEY_REAR_LEFT_DOOR_AJAR);
        }
    }    
    public Boolean getRearLeftDoorAjar() {
        return (Boolean) store.get(Constants.KEY_REAR_LEFT_DOOR_AJAR);
    }

    public void setRearRightDoorAjar(Boolean rearRightDoorAjar) {
        if (rearRightDoorAjar != null) {
        	store.put(Constants.KEY_REAR_RIGHT_DOOR_AJAR, rearRightDoorAjar);
        } else {
        	store.remove(Constants.KEY_REAR_RIGHT_DOOR_AJAR);
        }
    }    
    public Boolean getRearRightDoorAjar() {
        return (Boolean) store.get(Constants.KEY_REAR_RIGHT_DOOR_AJAR);
    }     
    
}
