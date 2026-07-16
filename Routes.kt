package com.blindgames.app.navigation

sealed class Routes(val route: String) {

    object Home : Routes("home")

    object Domino : Routes("domino")

    object AmericanDomino : Routes("american_domino")

    object Chess : Routes("chess")

    object Backgammon : Routes("backgammon")

    object Cards : Routes("cards")

    object Settings : Routes("settings")
}
