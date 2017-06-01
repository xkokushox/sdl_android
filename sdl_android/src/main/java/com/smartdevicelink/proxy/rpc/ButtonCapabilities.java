package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.ButtonName;

/**
 * Provides information about the capabilities of a SDL HMI button.
 * <p><b> Parameter List</b></p>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Name</th>
 * 			<th>Type</th>
 * 			<th>Description</th>
 * 			<th>SmartDeviceLink Ver. Available</th>
 * 		</tr>
 * 		<tr>
 * 			<td>name</td>
 * 			<td>ButtonName</td>
 * 			<td>The name of theSDL HMI button.</td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 * 		<tr>
 * 			<td>shortPressAvailable</td>
 * 			<td>Boolean</td>
 * 			<td>The button supports a SHORT press. See {@linkplain ButtonPressMode} for more information.</td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 *     <tr>
 * 			<td>longPressAvailable</td>
 * 			<td>Boolean</td>
 * 			<td>The button supports a LONG press. See {@linkplain ButtonPressMode} for more information.</td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 *     <tr>
 * 			<td>upDownAvailable</td>
 * 			<td>Boolean</td>
 * 			<td>The button supports "button down" and "button up". When the button is depressed, the <i>{@linkplain OnButtonEvent}</i> notification will be invoked with a value of BUTTONDOWN.
 *                  <p> When the button is released, the <i>{@linkplain OnButtonEvent}</i> notification will be invoked with a value of BUTTONUP.</p></td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 * </table>
 * 
 * <p>Upon the request HMI must provide the list of the following information:</p>
 * 	<p>The names of all existing/supported hardware buttons.</p>
 * 		<p>The availability of LONG/SHORT press for each existing/supported hardware button correspondingly</p>
 * 		<p>The availability of UP/DOWN events for each existing/supported hardware button correspondingly.</p>
 * 
 * @since SmartDeviceLink 1.0
 * 
 * @see ButtonName
 * @see ButtonEventMode
 * @see ButtonPressMode 
 * 
 * 
 *
 * @see OnButtonEvent
 * @see OnButtonPress
 * 
 */
public class ButtonCapabilities extends RPCStruct {
	public static final String KEY_NAME = "name";
	public static final String KEY_SHORT_PRESS_AVAILABLE = "shortPressAvailable";
	public static final String KEY_LONG_PRESS_AVAILABLE = "longPressAvailable";
	public static final String KEY_UP_DOWN_AVAILABLE = "upDownAvailable";
	/**
	 * Constructs a newly allocated ButtonCapabilities object
	 */
    public ButtonCapabilities() { }
    /**
     * Constructs a newly allocated ButtonCapabilities object indicated by the Hashtable parameter
     * @param hash The Hashtable to use
     */
    public ButtonCapabilities(Hashtable<String, Object> hash) {
        super(hash);
    }
    /**
     * Get the name of theSDL HMI button.
     * @return ButtonName the name of the Button
     */    
    public ButtonName getName() {
        return (ButtonName) getObject(ButtonName.class, KEY_NAME);
    }
    /**
     * Set the name of theSDL HMI button.
     * @param name the name of button
     */    
    public void setName( ButtonName name ) {
        setValue(KEY_NAME, name);
    }
    /**
     * Whether the button supports a SHORT press. See <i>{@linkplain com.smartdevicelink.proxy.rpc.enums.ButtonPressMode}</i> for more information.
     * @return True if support otherwise False.
     */    
    public Boolean getShortPressAvailable() {
        return getBoolean( KEY_SHORT_PRESS_AVAILABLE );
    }
    /**
     * Set the button supports a SHORT press. See <i>{@linkplain com.smartdevicelink.proxy.rpc.enums.ButtonPressMode}</i> for more information.
     * @param shortPressAvailable True if support otherwise False.
     */    
    public void setShortPressAvailable( Boolean shortPressAvailable ) {
        setValue(KEY_SHORT_PRESS_AVAILABLE, shortPressAvailable);
    }
    /**
     * Whether the button supports a LONG press. See <i>{@linkplain com.smartdevicelink.proxy.rpc.enums.ButtonPressMode}</i> for more information.
     * @return True if support otherwise False.
     */
    public Boolean getLongPressAvailable() {
        return getBoolean( KEY_LONG_PRESS_AVAILABLE );
    }
    /**
     * Set the button supports a LONG press. See <i>{@linkplain com.smartdevicelink.proxy.rpc.enums.ButtonPressMode}</i> for more information.
     * @param longPressAvailable True if support otherwise False.
     */    
    public void setLongPressAvailable( Boolean longPressAvailable ) {
        setValue(KEY_LONG_PRESS_AVAILABLE, longPressAvailable);
    }
    /**
     * Whether the button supports "button down" and "button up". When the button is depressed, the <i>{@linkplain OnButtonEvent}</i> notification will be invoked with a value of BUTTONDOWN.
     * @return True if support otherwise False.
     */    
    public Boolean getUpDownAvailable() {
        return getBoolean( KEY_UP_DOWN_AVAILABLE );
    }
    /**
     * Set the button supports "button down" and "button up". When the button is depressed, the <i>{@linkplain OnButtonEvent}</i> notification will be invoked with a value of BUTTONDOWN.
     * @param upDownAvailable True if support otherwise False.
     */    
    public void setUpDownAvailable( Boolean upDownAvailable ) {
        setValue(KEY_UP_DOWN_AVAILABLE, upDownAvailable);
    }
}
