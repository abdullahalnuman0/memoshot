/**
 * Memoshot – Project Information
 *
 * This file serves as the Kotlin entry point for the Memoshot project showcase.
 * It prints a summary of the app’s purpose, key features, and technology stack
 * so that visitors (and GitHub’s language detection) can immediately see that
 * the project is built with Kotlin.
 */
fun main() {
    val projectName = "Memoshot"
    val tagline = "Find any screenshot by the text inside it."
    val description = """
        A private Android app that reads every screenshot on your phone,
        sorts it into categories, makes it searchable, and helps you clear
        the ones you no longer need. Everything runs on the device:
        no account, no cloud, and it works offline.
    """.trimIndent()

    val keyFeatures = listOf(
        "🔍 Full‑text search – search every word and number inside your screenshots",
        "📂 Automatic categories – Codes, Receipts, Tickets, Chats, Products, Other",
        "⚡ One‑tap actions – copy codes, open links, add dates to calendar",
        "🧹 Safe cleanup – finds expired codes and duplicates, moves them to trash",
        "🏷️ Tags – group screenshots your way",
        "🔔 Code alert – copy one‑time codes from notifications (optional)",
        "🏠 Home‑screen widget – search with one tap",
        "📤 Share to Memoshot – make any shared image searchable",
        "🌐 More writing systems – Latin, Chinese, Devanagari, Japanese, Korean",
        "🔒 App lock – fingerprint or device‑credential lock",
        "📁 Extra folders & custom rules – index other folders and set cleanup rules",
        "📄 Bulk text export – export recognized text of many screenshots at once",
        "🎨 Material 3, light & dark – edge‑to‑edge, predictive back, large‑font layouts"
    )

    val techStack = mapOf(
        "Language & UI" to "100% Kotlin · Jetpack Compose · Material 3 · no XML layouts",
        "Architecture" to "Single :app module · MVVM + unidirectional data flow · Hilt",
        "Data" to "Room with FTS4 full‑text index · Paging 3 · DataStore",
        "Background work" to "WorkManager (no foreground services, no expedited jobs)",
        "On‑device ML" to "ML Kit Text Recognition v2 (Latin bundled; other scripts on demand)",
        "Performance" to "Baseline Profiles · R8 full mode · 16 KB page‑size aligned native libraries",
        "Platform" to "minSdk 26 (Android 8.0) → targetSdk 36 · edge‑to‑edge · predictive back · Android 14 partial photo access"
    )

    val privacy = """
        ✅ OCR, categories and search run on the phone
        ✅ No account, no sign‑in, no backend server
        ✅ No analytics or tracking
        ✅ Screenshots and their text never leave the device
    """.trimIndent()

    println("=".repeat(60))
    println("📸  $projectName")
    println("    $tagline")
    println("=".repeat(60))
    println()
    println("📖  Description")
    println("    $description")
    println()
    println("✨  Key Features")
    keyFeatures.forEach { println("    • $it") }
    println()
    println("⚙️  Technology Stack")
    techStack.forEach { (category, details) ->
        println("    • $category: $details")
    }
    println()

    printDeveloperInfo()

    println("🔒  Privacy by Design")
    println(privacy)
    println()
    println("=".repeat(60))
    println("© 2026 Dvexo. All rights reserved.")
    println("=".repeat(60))
}

fun printDeveloperInfo() {
    val developerName = "Abdullah Al Numan"
    val developerEmail = "abdullahalnumanb@gmail.com"
    val whatsappNumber = "+8801754155296"

    println()
    println("👨‍💻  Developer Info")
    println("    ─────────────────────────────────────────")
    println("    Name      : $developerName")
    println("    Email     : $developerEmail")
    println("    WhatsApp  : $whatsappNumber")
    println("    Contact   : https://wa.me/${whatsappNumber.replace("+", "").replace(" ", "")}")
    println("    ─────────────────────────────────────────")
}
