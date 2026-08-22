package com.witvpn.ikev2.presentation.ui.billing.grays

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.witvpn.ikev2.R

public class GraysBillingFragmentDirections private constructor() {
  public companion object {
    public fun actionGraysBillingFragmentToSplashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_graysBillingFragment_to_splashFragment)
  }
}
