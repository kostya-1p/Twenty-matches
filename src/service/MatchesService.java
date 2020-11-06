package service;

import repository.MatchesRepository;

public class MatchesService {
    private MatchesRepository matchesRepository = new MatchesRepository();

    public int getMatchesCount() {
        return matchesRepository.getMatchesCount();
    }

    public void setMatchesCount(int matchesToSubtract) {
        matchesRepository.setMatchesCount(getMatchesCount() - matchesToSubtract);
    }
}
