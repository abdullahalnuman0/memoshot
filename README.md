<div align="center">

<a href="https://memoshot.dvexo.com"><img src="assets/banner.png" alt="Memoshot: find any screenshot by what's in it" width="100%"></a>

<br>

# Memoshot

**Find any screenshot by the text inside it.**<br>
A private Android app that reads every screenshot on your phone, sorts it into categories, makes it searchable and helps you clear the ones you no longer need. Everything runs on the device: no account, no cloud, and it works offline.

<br>

<a href="https://play.google.com/store/apps/details?id=app.memoshot"><img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" alt="Get it on Google Play" height="80"></a>

<br>

[![Website](https://img.shields.io/badge/Website-memoshot.dvexo.com-3341C9?style=for-the-badge&logo=googlechrome&logoColor=white)](https://memoshot.dvexo.com)
[![Google Play](https://img.shields.io/badge/Google_Play-app.memoshot-1F8A55?style=for-the-badge&logo=googleplay&logoColor=white)](https://play.google.com/store/apps/details?id=app.memoshot)

![Version](https://img.shields.io/badge/version-1.3.1-1B1B1F?style=flat-square)
![Android](https://img.shields.io/badge/Android-8.0%2B-3DDC84?style=flat-square&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-2.4-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-Material_3-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![ML Kit](https://img.shields.io/badge/OCR-ML_Kit_on--device-FFD43B?style=flat-square&logo=google&logoColor=black)
![Privacy](https://img.shields.io/badge/data-stays_on_device-1F8A55?style=flat-square&logo=shieldsdotio&logoColor=white)

[Overview](#-overview) · [Screenshots](#-screenshots) · [Features](#-features) · [How it works](#-how-it-works) · [Privacy](#-privacy-by-design) · [Engineering](#-engineering) · [Contact](#-contact)

</div>

---

## ✦ Overview

People take screenshots to remember things: a one-time code, a receipt, a boarding pass, a Wi-Fi password, a product they want to buy later. Then the screenshot disappears among hundreds of others, and the gallery can't search what's written inside them.

**Memoshot** fixes that. It reads the text in every screenshot **on the phone**, sorts each one into **Codes, Receipts, Tickets, Chats, Products or Other**, and lets you find it again by typing any word or number you remember. It also notices what has expired, such as used codes, past tickets and duplicates, and offers to clear it. Nothing is deleted until you confirm.

<table>
<tr>
<td width="33%" valign="top">

### 🔎 Search by text
Type `boarding`, `total` or the first digits of a code. Matches are highlighted right on the screenshot.

</td>
<td width="33%" valign="top">

### 🗂️ Sorted automatically
New screenshots are read in the background and filed into six categories, with no setup.

</td>
<td width="33%" valign="top">

### 🔒 Private and offline
Text recognition runs on the device. Screenshots and their text never leave the phone.

</td>
</tr>
</table>

<div align="center">

<a href="assets/video/memoshot-preview.mp4"><img src="assets/video/preview-poster.png" alt="Watch the Memoshot preview video" width="88%"></a>

<sub>The Google Play preview video (38 s, with English captions in <a href="assets/video/memoshot-preview.srt"><code>.srt</code></a>). Click to open the MP4.</sub>

</div>

---

## 📱 Screenshots

### Google Play store listing

<div align="center">
<img src="assets/store/screenshots-strip.png" alt="Memoshot Google Play screenshots: search, home, detail, cleanup, privacy, offline" width="100%">
</div>

<details>
<summary><b>View the six store screenshots at full size</b></summary>
<br>

| | | |
|:-:|:-:|:-:|
| <img src="assets/store/screenshots/1-search.png" width="260" alt="Find any screenshot by its text"> | <img src="assets/store/screenshots/2-home.png" width="260" alt="Codes, receipts and tickets sorted for you"> | <img src="assets/store/screenshots/3-detail.png" width="260" alt="Copy codes and amounts in one tap"> |
| **Find any screenshot by its text** | **Codes, receipts & tickets sorted for you** | **Copy codes and amounts in one tap** |
| <img src="assets/store/screenshots/4-cleanup.png" width="260" alt="Clean up expired screenshots safely"> | <img src="assets/store/screenshots/5-privacy.png" width="260" alt="Private: screenshots stay on your phone"> | <img src="assets/store/screenshots/6-offline.png" width="260" alt="Works offline. No account."> |
| **Clean up expired screenshots safely** | **Private: screenshots stay on your phone** | **Works offline. No account.** |

</details>

### Feature graphic

<div align="center">
<img src="assets/store/feature-graphic.png" alt="Memoshot feature graphic: Find any screenshot by what's in it" width="80%">
</div>

### See it in action

<table>
<tr>
<td width="36%" align="center" valign="middle">
<img src="assets/demo.gif" alt="Animated demo: searching, copying a code, categories and cleanup" width="300">
</td>
<td width="64%" valign="middle">

**Search → act → clean up, in under 30 seconds**

1. Type one word, such as `password`. Memoshot finds the chat screenshot that holds it.
2. Copy a flight number or add the date to your calendar from the detail sheet.
3. Browse by category: receipts, tickets and codes sort themselves.
4. Review expired codes and duplicates, then move them to the trash in one go. You can restore them later.

</td>
</tr>
</table>

### Dark theme

<div align="center">
<img src="assets/dark-mode.png" alt="Memoshot in dark theme: home, search, detail and cleanup" width="100%">
</div>

### More screens

| | | | |
|:-:|:-:|:-:|:-:|
| <img src="assets/screens/onboarding.png" width="190" alt="Onboarding"> | <img src="assets/screens/permission.png" width="190" alt="Photo permission"> | <img src="assets/screens/tags.png" width="190" alt="Tags"> | <img src="assets/screens/date-filter.png" width="190" alt="Date filter"> |
| Onboarding | Photo access, explained | Your own tags | Filter by date |
| <img src="assets/screens/detail-boarding.png" width="190" alt="Smart actions"> | <img src="assets/screens/cleanup.png" width="190" alt="Cleanup review"> | <img src="assets/screens/languages.png" width="190" alt="Other writing systems"> | <img src="assets/screens/settings.png" width="190" alt="Settings"> |
| Smart actions | Cleanup review | More writing systems | Settings |

> All screens use fictional sample data captured on an emulator. No real person, account or third-party app appears in them.

---

## ✨ Features

| | Feature | What it does |
|:-:|---|---|
| 🔎 | **Full-text search** | Search every word and number inside your screenshots. Results are ranked, matches are highlighted on the image, and you can filter by category, date and tag. |
| 🗂️ | **Automatic categories** | Codes · Receipts · Tickets · Chats · Products · Other. Change a category by hand any time. |
| ⚡ | **One-tap actions** | Copy a code or an amount, open a link, call a number, or add a date to the calendar, straight from the screenshot. |
| 🧹 | **Safe cleanup** | Finds used one-time codes, past tickets and duplicates, and gives the reason for each. Moves them to the system trash so they can be restored. |
| 🏷️ | **Tags** | Group screenshots your way ("Trip", "Taxes"…) and filter by tag. |
| 🔔 | **Code alert** *(optional)* | Take a screenshot of a one-time code and copy it from the notification. The alert never shows on the lock screen. |
| 🧩 | **Home-screen widget** | One tap from the launcher to search. |
| 📥 | **Share to Memoshot** | Share any image from another app to make it searchable too. |
| 🌐 | **More writing systems** | Latin-alphabet languages built in. Chinese, Devanagari, Japanese and Korean can be turned on in Settings. |
| 🔐 | **App lock** | Optional fingerprint or device-credential lock. |
| 📁 | **Extra folders and custom rules** | Index other image folders and set your own cleanup rules by category and age. |
| 📤 | **Bulk text export** | Export the recognized text of many screenshots at once. |
| 🌗 | **Material 3, light and dark** | Edge-to-edge, predictive back, large-font layouts and content descriptions throughout. |

➡️ The full tour is in **[docs/FEATURES.md](docs/FEATURES.md)**.

---

## ⚙️ How it works

```mermaid
flowchart LR
    A["📸 New screenshot<br/>(MediaStore)"] --> B["🔁 WorkManager<br/>background job"]
    B --> C["🔤 ML Kit OCR<br/>on-device"]
    C --> D["🧠 Classifier<br/>(pure Kotlin)"]
    D --> E["🗃️ Room + FTS4<br/>local index"]
    E --> F["🔎 Search · 🗂️ Categories<br/>⚡ Actions · 🧹 Cleanup"]

    style A fill:#FFF8DB,stroke:#FFD43B,color:#1B1B1F
    style C fill:#ECE6FF,stroke:#6A4CE0,color:#1B1B1F
    style D fill:#DDF3E7,stroke:#1F8A55,color:#1B1B1F
    style E fill:#DDEBFA,stroke:#1A73C9,color:#1B1B1F
    style F fill:#FDE2EC,stroke:#C8336B,color:#1B1B1F
```

1. **Detect.** Memoshot watches the screenshot folders (and any folder you add) through MediaStore. It never scans the whole gallery.
2. **Read.** A background WorkManager job runs Google ML Kit text recognition on the device, in batches that respect battery and charging state.
3. **Understand.** A rule-based classifier written in pure Kotlin sorts the screenshot and extracts entities such as codes, amounts, dates, flight numbers, links and phone numbers. It also works out when a code or ticket has expired.
4. **Index.** The text goes into a local Room database with an FTS4 full-text index. Search normalizes the query (case, accents, digits) and ranks the results.
5. **Act.** You search, browse, tag, copy, share and clean up, all on the phone.

➡️ Architecture, data model and tech stack: **[docs/ARCHITECTURE.md](docs/ARCHITECTURE.md)**.

---

## 🔒 Privacy by design

<table>
<tr>
<td>✅ OCR, categories and search run <b>on the phone</b></td>
<td>✅ <b>No account</b>, no sign-in, no backend server</td>
</tr>
<tr>
<td>✅ <b>No analytics</b> or crash-reporting SDK</td>
<td>✅ Works fully in <b>airplane mode</b></td>
</tr>
<tr>
<td>✅ Reads only <b>screenshot folders</b> (plus folders you add)</td>
<td>✅ <b>Never deletes</b> a file without your confirmation</td>
</tr>
<tr>
<td>✅ The index is <b>excluded from cloud backups</b></td>
<td>✅ Code alerts are <b>hidden on the lock screen</b></td>
</tr>
</table>

The only network traffic comes from Google's ad and consent SDKs and ML Kit's own usage and error statistics. None of them receive your screenshots or their text. Photo access is optional: you can pick screenshots by hand instead.

➡️ Details: **[docs/PRIVACY.md](docs/PRIVACY.md)** · Privacy policy: **[memoshot.dvexo.com/privacy](https://memoshot.dvexo.com/privacy/)**

---

## 🛠️ Engineering

<div align="center">

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material_3-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
![Hilt](https://img.shields.io/badge/Hilt_DI-2E7D32?style=for-the-badge&logo=dagger&logoColor=white)
![Room](https://img.shields.io/badge/Room_+_FTS4-1A73C9?style=for-the-badge&logo=sqlite&logoColor=white)
![WorkManager](https://img.shields.io/badge/WorkManager-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![ML Kit](https://img.shields.io/badge/ML_Kit_OCR-FF6F00?style=for-the-badge&logo=google&logoColor=white)
![Coil](https://img.shields.io/badge/Coil_3-C8336B?style=for-the-badge&logoColor=white)
![Glance](https://img.shields.io/badge/Glance_widget-6A4CE0?style=for-the-badge&logo=android&logoColor=white)

</div>

| | |
|---|---|
| **Language & UI** | 100% Kotlin · Jetpack Compose · Material 3 · no XML layouts |
| **Architecture** | Single `:app` module split into `core/*` and `feature/*` packages · MVVM + unidirectional data flow · Hilt |
| **Data** | Room with an FTS4 full-text index · Paging 3 · DataStore |
| **Background work** | WorkManager (no foreground services, no expedited jobs) |
| **On-device ML** | ML Kit Text Recognition v2 (Latin bundled; other scripts downloaded on demand) |
| **Performance** | Baseline Profiles · R8 full mode · 16 KB page-size aligned native libraries |
| **Platform** | minSdk 26 (Android 8.0) → targetSdk 36 · edge-to-edge · predictive back · Android 14 partial photo access |

**Quality in numbers**

| 🧪 **350+** automated tests | 🖼️ **100+** reviewed screenshot-test images | 📚 **260+** labelled OCR fixtures | 📐 **41** architecture decision records |
|:-:|:-:|:-:|:-:|
| JVM unit, Robolectric and instrumented tests | Roborazzi renders in light, dark and 2× font | A corpus that keeps the classifier accurate | Every non-obvious choice written down |

Automated guards check that no forbidden permission or network library sneaks in, that user content is never logged, and that store texts stay within Play's limits.

---

## 🗓️ Release history

| Version | Highlights |
|---|---|
| **1.3.1** | App lock prompt fix · Add tag stays above the navigation bar · steadier ad layout |
| **1.3.0** | Moved to Google's newer ads library, loaded in the background |
| **1.2.0** | Tags · home-screen widget · share to Memoshot · Chinese, Devanagari, Japanese and Korean OCR · code alerts · weekly cleanup reminder · pick screenshots by hand |
| **1.1.0** | Every feature free for everyone: extra folders, custom cleanup rules, text export |

Full notes: **[CHANGELOG.md](CHANGELOG.md)**

---

## 📬 Contact

Questions, feedback or collaboration: get in touch.

<div align="center">

[![WhatsApp](https://img.shields.io/badge/WhatsApp-Chat_with_us-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/+8801754155296)
[![Email](https://img.shields.io/badge/Email-abdullahalnumanb%40gmail.com-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:abdullahalnumanb@gmail.com)
[![Website](https://img.shields.io/badge/Website-memoshot.dvexo.com-3341C9?style=for-the-badge&logo=googlechrome&logoColor=white)](https://memoshot.dvexo.com)

<br>

<a href="https://play.google.com/store/apps/details?id=app.memoshot"><img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" alt="Get it on Google Play" height="70"></a>

<br><br>

<sub>Memoshot is developed by <b>Dvexo</b>. This repository is a project showcase: it contains documentation and media, not the app's source code.<br>
Google Play and the Google Play logo are trademarks of Google LLC. © 2026 Dvexo. All rights reserved. See <a href="LICENSE">LICENSE</a>.</sub>

</div>
