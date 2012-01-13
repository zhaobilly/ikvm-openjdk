// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XSelectionRequestEvent extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 80; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	XSelectionRequestEvent(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	XSelectionRequestEvent() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_type() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_type(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_serial() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_serial(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public boolean get_send_event() { log.finest("");return (Native.getBool(pData+16)); }
	public void set_send_event(boolean v) { log.finest(""); Native.putBool(pData+16, v); }
	public long get_display() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_display(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public long get_owner() { log.finest("");return (Native.getLong(pData+32)); }
	public void set_owner(long v) { log.finest(""); Native.putLong(pData+32, v); }
	public long get_requestor() { log.finest("");return (Native.getLong(pData+40)); }
	public void set_requestor(long v) { log.finest(""); Native.putLong(pData+40, v); }
	public long get_selection() { log.finest("");return (Native.getLong(pData+48)); }
	public void set_selection(long v) { log.finest(""); Native.putLong(pData+48, v); }
	public long get_target() { log.finest("");return (Native.getLong(pData+56)); }
	public void set_target(long v) { log.finest(""); Native.putLong(pData+56, v); }
	public long get_property() { log.finest("");return (Native.getLong(pData+64)); }
	public void set_property(long v) { log.finest(""); Native.putLong(pData+64, v); }
	public long get_time() { log.finest("");return (Native.getULong(pData+72)); }
	public void set_time(long v) { log.finest(""); Native.putULong(pData+72, v); }


	String getName() {
		return "XSelectionRequestEvent"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"type = " + XlibWrapper.eventToString[get_type()] +", ";
		ret += ""+"serial = " + get_serial() +", ";
		ret += ""+"send_event = " + get_send_event() +", ";
		ret += ""+"display = " + get_display() +", ";
		ret += ""+"owner = " + get_owner() +", ";
		ret += ""+"requestor = " + get_requestor() +", ";
		ret += ""+"selection = " + XAtom.get(get_selection()) +", ";
		ret += ""+"target = " + XAtom.get(get_target()) +", ";
		ret += ""+"property = " + XAtom.get(get_property()) +", ";
		ret += ""+"time = " + get_time() +", ";
		return ret;
	}


}



