package me.dio.copa.catar.features.viewmodel

import me.dio.copa.catar.domain.model.MatchDomain

data class MainUIState(
    val matches: List<MatchDomain> = emptyList()
)
