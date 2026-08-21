# GW — UI rebrand: IKEv2 -> GW (user-visible labels only)

These are the exact string-value replacements. The string *names* (e.g. `desc_ikev2`)
are kept identical so no code/layout references break — only the displayed text changes.
Internal `protocol == "ikev2"` comparisons that drive strongSwan are NOT user-visible
and stay as-is.

## app/src/main/res/values/strings.xml

Line 12 — keep (internal shortcut label, not shown as the protocol name to users):
```xml
<string name="strongswan_shortcut">strongSwan shortcut</string>
```

Line 27 — keep (log mail subject; internal).
```xml
<string name="log_mail_subject">strongSwan %1$s Log File</string>
```

Line 409 — `desc_ikev2` (shown in ProtocolInfoDialog). Replace the value:
```xml
<string name="desc_ikev2"><b>GW</b> — is the fastest protocol in terms of response time and VPN connection setup. Upon signal loss or network change, it automatically restores connection in a fraction of a second. The protocol is battery-efficient and provides consistently high internet speed using proven data protection technologies.\n\nGW tunnels your traffic through an SSH connection riding a CDN-fronted HTTP upgrade, making it far harder for filtering systems to recognize and block than classic IKEv2/IPsec signatures.</string>
```

Line 106 — `profile_proposals_ike_label` (advanced screen; rarely seen). Replace value:
```xml
<string name="profile_proposals_ike_label">GW Algorithms</string>
```
(Leave `profile_proposals_intro` and `profile_proposals_esp_*` as-is — they describe
the strongSwan advanced algorithm picker, which only appears for IKEv2-byod profiles.)

## app/src/main/res/values-ru/strings.xml

Line 487 — `desc_ikev2` (Russian). Replace value:
```xml
<string name="desc_ikev2"><b>GW</b> — самый быстрый протокол по времени отклика и установке VPN-соединения. При потере сигнала или смене сети он автоматически восстанавливает соединение за доли секунды. Протокол энергоэффективен и обеспечивает стабильно высокую скорость интернета с использованием проверенных технологий защиты данных.\n\nGW пропускает трафик через SSH-соединение поверх CDN-фронтального HTTP-апгрейда, что значительно усложняет распознавание и блокировку по сравнению с классической сигнатурой IKEv2/IPsec.</string>
```

Line 293 — `profile_proposals_ike_label` (Russian). Replace value:
```xml
<string name="profile_proposals_ike_label">GW Algorithms</string>
```

## app/src/main/res/layout/fragment_connect2.xml

Line 221 — hardcoded protocol chip text. Replace:
```xml
android:text="IKEv2"
```
with:
```xml
android:text="GW"
```

Line 215 — optional: swap the icon. Either keep `@drawable/ic_ikev2` or add a new
`ic_gw.png` under `res/drawable-xxhdpi/` and reference `@drawable/ic_gw`.

## ConnectFragment.kt — protocol hint label (line ~798)

Where the code currently sets `putString("PROTOCOL", if (isAwgMode) "AWG" else "IKEv2")`,
extend it so GW is labeled correctly:
```kotlin
putString("PROTOCOL", when {
    isAwgMode -> "AWG"
    isGwMode -> "GW"
    isVlessMode -> "VLESS"
    else -> "GW"   // default transport is now GW (was IKEv2)
})
```

## Default protocol

If GW should be the **default** transport (replacing IKEv2 as the main path), set the
default value of `SharePrefs.KEY_SELECTED_PROTOCOL` to `"GW"` and ensure the server list
returns GW rows. IKEv2 remains available as a fallback if any server has
`protocol == "ikev2"`.
