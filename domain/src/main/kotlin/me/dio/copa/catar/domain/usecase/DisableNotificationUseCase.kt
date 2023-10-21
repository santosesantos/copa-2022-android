package me.dio.copa.catar.domain.usecase

import me.dio.copa.catar.domain.repositories.MatchesRepository

class DisableNotificationUseCase(
    private val repository: MatchesRepository
) {
    suspend operator fun invoke(matchId: String) = repository.disableNotificationFor(matchId)
}