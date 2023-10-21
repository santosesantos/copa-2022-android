package me.dio.copa.catar.domain.usecase

import me.dio.copa.catar.domain.repositories.MatchesRepository

class GetMatchesUseCase(
    private val repository: MatchesRepository
) {
    suspend operator fun invoke() = repository.getMatches()
}