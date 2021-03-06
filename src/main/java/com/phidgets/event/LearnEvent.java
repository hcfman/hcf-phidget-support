/*
 * Copyright 2006 Phidgets Inc.  All rights reserved.
 */

package com.phidgets.event;

import com.phidgets.Phidget;
import com.phidgets.IRLearnedCode;

/**
 * This class represents the data for a LearnEvent.
 * 
 * @author Phidgets Inc.
 */
public class LearnEvent
{
	Phidget source;
	IRLearnedCode value;

	/**
	 * Class constructor. This is called internally by the phidget library when creating this event.
	 * 
	 * @param source the Phidget object from which this event originated
	 */
	public LearnEvent(Phidget source, IRLearnedCode value)
	{
		this.source = source;
		this.value = value;
	}

	/**
	 * Returns the source Phidget of this event. This is a reference to the Phidget object from which this
	 * event was called. This object can be cast into a specific type of Phidget object to call specific
	 * device calls on it.
	 * 
	 * @return the event caller
	 */
	public Phidget getSource() {
		return source;
	}

	/**
	 * Returns the learned code.
	 * 
	 * @return the learned code
	 */
	public IRLearnedCode getValue() {
		return value;
	}

	/**
	 * Returns a string containing information about the event.
	 * 
	 * @return an informative event string
	 */
	public String toString() {
		return source.toString() + " Learned Code: "
		  + value;
	}
}
