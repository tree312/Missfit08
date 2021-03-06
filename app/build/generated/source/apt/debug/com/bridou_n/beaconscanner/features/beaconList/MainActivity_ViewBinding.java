// Generated code from Butter Knife. Do not modify!
package com.bridou_n.beaconscanner.features.beaconList;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bridou_n.beaconscanner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131492994;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.rootView = Utils.findRequiredViewAsType(source, R.id.activity_main, "field 'rootView'", CoordinatorLayout.class);
    target.bluetoothState = Utils.findRequiredViewAsType(source, R.id.bluetooth_state, "field 'bluetoothState'", TextView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.empty_view, "field 'emptyView'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.scan_fab, "field 'scanFab' and method 'startStopScan'");
    target.scanFab = Utils.castView(view, R.id.scan_fab, "field 'scanFab'", FloatingActionButton.class);
    view2131492994 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startStopScan();
      }
    });
    target.scanProgress = Utils.findRequiredViewAsType(source, R.id.scan_progress, "field 'scanProgress'", ProgressBar.class);
    target.textView1 = Utils.findRequiredViewAsType(source, R.id.textView1, "field 'textView1'", TextView.class);
    target.textView2 = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView2'", TextView.class);
    target.textView1_1 = Utils.findRequiredViewAsType(source, R.id.textView1_1, "field 'textView1_1'", TextView.class);
    target.textView2_1 = Utils.findRequiredViewAsType(source, R.id.textView2_1, "field 'textView2_1'", TextView.class);
    target.textView3 = Utils.findRequiredViewAsType(source, R.id.textView3, "field 'textView3'", TextView.class);
    target.textView4 = Utils.findRequiredViewAsType(source, R.id.textView4, "field 'textView4'", TextView.class);
    target.textView3_1 = Utils.findRequiredViewAsType(source, R.id.textView3_1, "field 'textView3_1'", TextView.class);
    target.textView4_1 = Utils.findRequiredViewAsType(source, R.id.textView4_1, "field 'textView4_1'", TextView.class);
    target.leftHand = Utils.findRequiredViewAsType(source, R.id.leftHand, "field 'leftHand'", ImageView.class);
    target.rightHand = Utils.findRequiredViewAsType(source, R.id.rightHand, "field 'rightHand'", ImageView.class);
    target.leftFoot = Utils.findRequiredViewAsType(source, R.id.leftFoot, "field 'leftFoot'", ImageView.class);
    target.rightFoot = Utils.findRequiredViewAsType(source, R.id.rightFoot, "field 'rightFoot'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.toolbar = null;
    target.rootView = null;
    target.bluetoothState = null;
    target.emptyView = null;
    target.scanFab = null;
    target.scanProgress = null;
    target.textView1 = null;
    target.textView2 = null;
    target.textView1_1 = null;
    target.textView2_1 = null;
    target.textView3 = null;
    target.textView4 = null;
    target.textView3_1 = null;
    target.textView4_1 = null;
    target.leftHand = null;
    target.rightHand = null;
    target.leftFoot = null;
    target.rightFoot = null;

    view2131492994.setOnClickListener(null);
    view2131492994 = null;

    this.target = null;
  }
}
