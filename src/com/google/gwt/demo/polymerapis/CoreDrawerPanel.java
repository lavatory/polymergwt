package com.google.gwt.demo.polymerapis;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.demo.myelemental.HTMLElement;

@JsType
public interface CoreDrawerPanel extends HTMLElement {

  void closeDrawer();
  void openDrawer();
  void togglePanel();

  @JsProperty void setForceNarrow(boolean narrow);

  // TODO(digi): Rename to isNarrow() when JsType parsing allows.
  @JsProperty boolean getNarrow();
  
  @JsProperty String getSelected();
  @JsProperty void setSelected(String selected);
}
