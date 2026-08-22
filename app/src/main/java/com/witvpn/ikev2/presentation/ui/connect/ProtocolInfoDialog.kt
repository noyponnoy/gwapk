package com.witvpn.ikev2.presentation.ui.connect

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import com.witvpn.ikev2.R

/**
 * @param showIkev2 показывать ли описание протокола IKEv2. Доступность IKEv2
 * управляется через Firebase Remote Config (ключ ikev2_enabled); по умолчанию
 * скрыто — fail-safe.
 */
class ProtocolInfoDialog(
    context: Context,
    private val showIkev2: Boolean = false
) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_protocol_info)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window?.setLayout(
            android.view.ViewGroup.LayoutParams.MATCH_PARENT,
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT
        )

        if (!showIkev2) {
            findViewById<TextView>(R.id.tv_desc_ikev2)?.visibility = View.GONE
        }

        findViewById<ImageView>(R.id.iv_close)?.setOnClickListener {
            dismiss()
        }
    }
}