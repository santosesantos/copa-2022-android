package me.dio.copa.catar.features.viewmodel

import me.dio.copa.catar.domain.model.MatchDomain

sealed class MainUIAction {
    object Unexpected: MainUIAction()
    data class MatchesNotFound(val message: String): MainUIAction()
    data class EnableNotification(val match: MatchDomain): MainUIAction()
    data class DisableNotification(val match: MatchDomain): MainUIAction()
}