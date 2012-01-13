// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class AwtScreenData extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 48; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	AwtScreenData(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	AwtScreenData() {
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
	public int get_numConfigs() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_numConfigs(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_root() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_root(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public long get_whitepixel() { log.finest("");return (Native.getLong(pData+16)); }
	public void set_whitepixel(long v) { log.finest(""); Native.putLong(pData+16, v); }
	public long get_blackpixel() { log.finest("");return (Native.getLong(pData+24)); }
	public void set_blackpixel(long v) { log.finest(""); Native.putLong(pData+24, v); }
	public AwtGraphicsConfigData get_defaultConfig(int index) { log.finest(""); return (Native.getLong(pData+32) != 0)?(new AwtGraphicsConfigData(Native.getLong(pData+32)+index*160)):(null); }
	public long get_defaultConfig() { log.finest("");return Native.getLong(pData+32); }
	public void set_defaultConfig(long v) { log.finest(""); Native.putLong(pData + 32, v); }
	public long get_configs(int index) { log.finest(""); return Native.getLong(pData+40)+index*Native.getLongSize(); }
	public long get_configs() { log.finest("");return Native.getLong(pData+40); }
	public void set_configs(long v) { log.finest(""); Native.putLong(pData + 40, v); }


	String getName() {
		return "AwtScreenData"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"numConfigs = " + get_numConfigs() +", ";
		ret += ""+"root = " + get_root() +", ";
		ret += ""+"whitepixel = " + get_whitepixel() +", ";
		ret += ""+"blackpixel = " + get_blackpixel() +", ";
		ret += ""+"defaultConfig = " + get_defaultConfig() +", ";
		ret += ""+"configs = " + get_configs() +", ";
		return ret;
	}


}



