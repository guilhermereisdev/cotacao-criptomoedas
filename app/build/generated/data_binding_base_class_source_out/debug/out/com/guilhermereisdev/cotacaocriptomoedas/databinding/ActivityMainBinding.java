// Generated by view binder compiler. Do not edit!
package com.guilhermereisdev.cotacaocriptomoedas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.guilhermereisdev.cotacaocriptomoedas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRefreshPrices;

  @NonNull
  public final AppCompatImageView icAppLogo;

  @NonNull
  public final TextView tvBitcoinLabel;

  @NonNull
  public final TextView tvBitcoinPrice;

  @NonNull
  public final TextView tvEthereumLabel;

  @NonNull
  public final TextView tvEthereumPrice;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRefreshPrices,
      @NonNull AppCompatImageView icAppLogo, @NonNull TextView tvBitcoinLabel,
      @NonNull TextView tvBitcoinPrice, @NonNull TextView tvEthereumLabel,
      @NonNull TextView tvEthereumPrice) {
    this.rootView = rootView;
    this.btnRefreshPrices = btnRefreshPrices;
    this.icAppLogo = icAppLogo;
    this.tvBitcoinLabel = tvBitcoinLabel;
    this.tvBitcoinPrice = tvBitcoinPrice;
    this.tvEthereumLabel = tvEthereumLabel;
    this.tvEthereumPrice = tvEthereumPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_refresh_prices;
      Button btnRefreshPrices = ViewBindings.findChildViewById(rootView, id);
      if (btnRefreshPrices == null) {
        break missingId;
      }

      id = R.id.ic_app_logo;
      AppCompatImageView icAppLogo = ViewBindings.findChildViewById(rootView, id);
      if (icAppLogo == null) {
        break missingId;
      }

      id = R.id.tv_bitcoin_label;
      TextView tvBitcoinLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvBitcoinLabel == null) {
        break missingId;
      }

      id = R.id.tv_bitcoin_price;
      TextView tvBitcoinPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvBitcoinPrice == null) {
        break missingId;
      }

      id = R.id.tv_ethereum_label;
      TextView tvEthereumLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvEthereumLabel == null) {
        break missingId;
      }

      id = R.id.tv_ethereum_price;
      TextView tvEthereumPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvEthereumPrice == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnRefreshPrices, icAppLogo,
          tvBitcoinLabel, tvBitcoinPrice, tvEthereumLabel, tvEthereumPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
