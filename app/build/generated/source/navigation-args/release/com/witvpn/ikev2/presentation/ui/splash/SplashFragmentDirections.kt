package com.witvpn.ikev2.presentation.ui.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.witvpn.ikev2.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_mainFragment)

    public fun actionSplashFragmentToMnemonicFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_mnemonicFragment)

    public fun actionSplashFragmentToGraysBillingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_graysBillingFragment)
  }
}
