package me.dio.copa.catar.domain.usecase

import me.dio.copa.catar.domain.repositories.MatchesRepository

class EnableNotificationUseCase(
    private val repository: MatchesRepository
) {
    suspend operator fun invoke(matchId: String) = repository.enableNotificationFor(matchId)
}