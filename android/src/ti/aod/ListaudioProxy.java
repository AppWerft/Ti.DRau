/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2017 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.aod;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

// This proxy can be created by calling Drau.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = AodModule.class)
public class ListaudioProxy extends KrollProxy {
	// Standard Debugging variables
	private static final String LCAT = "ExampleProxy";
	private static final boolean DBG = TiConfig.LOGD;

	// Constructor
	public ListaudioProxy() {
		super();
	}

	private String searchItem;
	private String from;
	private String to;

	@Kroll.method
	public ListaudioProxy setSearchItem(String searchItem) {
		this.searchItem = searchItem;
		return this;
	}
	@Kroll.method
	public ListaudioProxy setFrom(String from) {
		this.from = from;
		return this;
	}
	@Kroll.method
	public ListaudioProxy setTo(String to) {
		this.to = to;
		return this;
	}
}
