package com.witvpn.ikev2.presentation.ui.otp

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.witvpn.ikev2.R
import kotlin.Int
import kotlin.String

public class OTPFragmentDirections private constructor() {
  private data class ActionOTPFragmentToConfirmOTPFragment(
    public val emailArg: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_OTPFragment_to_confirmOTPFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("emailArg", this.emailArg)
        return result
      }
  }

  public companion object {
    public fun actionOTPFragmentToPolicyFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_policyFragment)

    public fun actionOTPFragmentToConfirmOTPFragment(emailArg: String): NavDirections =
        ActionOTPFragmentToConfirmOTPFragment(emailArg)

    public fun actionOTPFragmentToMnemonicFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_mnemonicFragment)

    public fun actionOTPFragmentToQRFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_QRFragment)

    public fun actionOTPFragmentToSplashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_splashFragment)

    public fun actionOTPFragmentToSplitTunnelFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_splitTunnelFragment)
  }
}
