package com.witvpn.ikev2.presentation.ui.otp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.witvpn.ikev2.R

public class ConfirmOTPFragmentDirections private constructor() {
  public companion object {
    public fun actionConfirmOTPFragmentToSplashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_confirmOTPFragment_to_splashFragment)
  }
}
