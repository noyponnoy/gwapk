package com.witvpn.ikev2.presentation.ui.entropy

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.witvpn.ikev2.R

public class MnemonicFragmentDirections private constructor() {
  public companion object {
    public fun actionMnemonicFragmentToSplashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mnemonicFragment_to_splashFragment)
  }
}
