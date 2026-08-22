package com.witvpn.ikev2.presentation.ui.otp

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ConfirmOTPFragmentArgs(
  public val emailArg: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("emailArg", this.emailArg)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("emailArg", this.emailArg)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ConfirmOTPFragmentArgs {
      bundle.setClassLoader(ConfirmOTPFragmentArgs::class.java.classLoader)
      val __emailArg : String?
      if (bundle.containsKey("emailArg")) {
        __emailArg = bundle.getString("emailArg")
        if (__emailArg == null) {
          throw IllegalArgumentException("Argument \"emailArg\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"emailArg\" is missing and does not have an android:defaultValue")
      }
      return ConfirmOTPFragmentArgs(__emailArg)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ConfirmOTPFragmentArgs {
      val __emailArg : String?
      if (savedStateHandle.contains("emailArg")) {
        __emailArg = savedStateHandle["emailArg"]
        if (__emailArg == null) {
          throw IllegalArgumentException("Argument \"emailArg\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"emailArg\" is missing and does not have an android:defaultValue")
      }
      return ConfirmOTPFragmentArgs(__emailArg)
    }
  }
}
