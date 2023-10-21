package me.dio.copa.catar.features.viewmodel

sealed class MainUIAction {
    object Unexpected: MainUIAction()
    data class MatchesNotFound(val message: String): MainUIAction()
}